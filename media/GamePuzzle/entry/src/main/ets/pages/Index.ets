/*
 * Copyright (c) 2022-2023 Huawei Device Co., Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import mediaQuery from '@ohos.mediaquery'
import mediaLibrary from '@ohos.multimedia.mediaLibrary'
import GameRules from "../model/GameRules"
import ImageModel from "../model/ImageModel"
import ImagePicker from '../common/ImagePicker'
import Logger from '../model/Logger'
import PictureItem from '../model/PictureItem'
import abilityAccessCtrl, { Permissions } from '@ohos.abilityAccessCtrl'

const PERMISSIONS: Array<Permissions> = ['ohos.permission.READ_MEDIA', 'ohos.permission.WRITE_MEDIA', 'ohos.permission.MEDIA_LOCATION']
const IMAGE_SIZE: number = px2vp(640)
const GAME_TIME: number = 300 // 游戏时长
const TAG: string = 'Index'

@Entry
@Component
struct Index {
  private listener = mediaQuery.matchMediaSync('screen and (min-aspect-ratio: 1.5) or (orientation: landscape)')
  private ImageModel: ImageModel = new ImageModel(getContext(this))
  private game: GameRules = new GameRules()
  @StorageLink('isGameStart') isGameStart: boolean = false
  private timer: number = -1
  private isRefresh: boolean = false
  @State numArray: PictureItem[] = []
  @State imgDatas: Array<mediaLibrary.FileAsset> = []
  @State @Watch("onTimeOver") gameTime: number = GAME_TIME
  @State @Watch("onImageChange") index: number = 0
  @State isLand: boolean = false
  onLand = (mediaQueryResult) => {
    console.info(`[eTSMediaQuery.Index]onLand: mediaQueryResult.matches=${mediaQueryResult.matches}`)
    this.isLand = mediaQueryResult.matches
  }

  async aboutToAppear() {
    this.listener.on('change', this.onLand)
    await abilityAccessCtrl.createAtManager().requestPermissionsFromUser(getContext(this), PERMISSIONS)
    this.imgDatas = await this.ImageModel.getAllImg()
    Logger.info(TAG, `images = ${this.imgDatas.length}`)
    this.numArray = await this.ImageModel.splitPic(this.index)
  }

  onTimeOver() {
    if (this.gameTime == 0) {
      this.isGameStart = false
      AlertDialog.show({ message: 'TimeOver' })
      clearInterval(this.timer)
    }
  }

  async onImageChange() {
    this.isRefresh = true
    this.dialogController.close()
    this.numArray = []
    this.numArray = await this.ImageModel.splitPic(this.index)
    this.init()
    this.isRefresh = false
  }

  init() {
    this.gameTime = GAME_TIME
    clearInterval(this.timer)
  }

  gameOver() {
    let count = 0
    for (let i = 0;i < 8; i++) {
      if (this.numArray[i].index == i) {
        count++
      } else {
        count = 0
        break
      }
    }
    if (count === 8) {
      this.isGameStart = false
      AlertDialog.show({ message: $r('app.string.congratulations') })
      clearInterval(this.timer)
      this.gameTime = GAME_TIME
    }
  }

  start() {
    this.init()
    this.timer = setInterval(() => {
      this.gameTime--
    }, 1000)
  }

  dialogController: CustomDialogController = new CustomDialogController({
    builder: ImagePicker({
      imageDatas: this.imgDatas,
      index: $index
    }),
    autoCancel: true,
    gridCount: 12
  })

  @Builder
  ImageShow() {
    Image(this.imgDatas[this.index].uri)
      .width(IMAGE_SIZE)
      .height(275)
      .objectFit(ImageFit.Fill)
      .onClick(async () => {
        if (this.isRefresh) {
          return
        }
        this.imgDatas = await this.ImageModel.getAllImg()
        setTimeout(() => {
          this.dialogController.open()
        }, 200)
      })
  }

  @Builder
  ImageGrid(leftMargin: number, topMargin: number) {
    Grid() {
      ForEach(this.numArray, (item, index) => {
        GridItem() {
          Image(item.pixelMap)
            .width('99%')
            .objectFit(ImageFit.Fill)
            .height(90)
        }
        .backgroundColor(item.pixelMap === undefined ? "#f5f5f5" : "#ffdead")
        .onClick(() => {
          if (this.isRefresh) {
            return
          }
          if (this.isGameStart) {
            this.isRefresh = true
            this.numArray = this.game.gameInit(index, this.numArray)
            this.gameOver()
            this.isRefresh = false
          }
        })
      })
    }
    .columnsTemplate('1fr 1fr 1fr')
    .columnsGap(2)
    .rowsGap(2)
    .width(IMAGE_SIZE)
    .height(275)
    .margin({ left: leftMargin, top: topMargin })
  }

  build() {
    Column() {
      Row() {
        Text(`Time:0${Math.floor(this.gameTime / 60)}:${this.gameTime % 60 < 10 ? '0' + this.gameTime % 60 : this.gameTime % 60}`)
          .margin({ top: 5, bottom: 5 })
      }

      if (this.imgDatas.length > 0) {
        if (this.isLand) {
          Row() {
            this.ImageShow()
            this.ImageGrid(10, 0)
          }
          .margin({ top: 5 })
        } else {
          Column() {
            this.ImageShow()
            this.ImageGrid(0, 5)
          }
          .margin({ top: 5 })
        }
      }
      Button($r('app.string.start'), { type: ButtonType.Capsule, stateEffect: true })
        .height(50)
        .width('100%')
        .fontSize(18)
        .margin({ top: 5 })
        .backgroundColor(this.isGameStart ? $r('app.color.forbid') : $r('app.color.allow'))
        .enabled(!this.isGameStart)
        .onClick(() => {
          this.isGameStart = true
          this.start()
          this.numArray = this.game.gameBegin(this.numArray)
        })

      Button($r('app.string.restart'), { type: ButtonType.Capsule, stateEffect: true })
        .height(50)
        .width('100%')
        .fontSize(18)
        .margin({ top: 5 })
        .backgroundColor(this.isGameStart ? $r('app.color.allow') : $r('app.color.forbid'))
        .enabled(this.isGameStart)
        .onClick(() => {
          this.isGameStart = true
          this.start()
          this.numArray = this.game.gameBegin(this.numArray)
        })
    }
    .width('100%')
    .height('100%')
    .padding({ left: '1%', right: '1%' })
  }
}