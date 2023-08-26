/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
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

package ohos.samples.components.slice;

import ohos.samples.components.ResourceTable;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;

/**
 * MainAbilitySlice
 */
public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_main_ability_slice);
        initComponents();
    }

    private void initComponents() {
        Component startShowText = findComponentById(ResourceTable.Id_start_text);
        Component startShowButton = findComponentById(ResourceTable.Id_start_button);
        startShowText.setClickedListener(component -> startText());
        startShowButton.setClickedListener(component -> startButton());
    }

    private void startText() {
        Intent intent = new Intent();
        this.present(new TextAbilitySlice(), intent);
    }

    private void startButton() {
        Intent intent = new Intent();
        this.present(new ButtonAbilitySlice(), intent);
    }
}
