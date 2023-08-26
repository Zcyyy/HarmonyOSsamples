/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.All rights reserved.
 * Licensed under the Apache License,Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ohos.samples.tictactoegame.data.mode;

import ohos.distributedschedule.interwork.DeviceInfo;

/**
 * DeviceData class
 */
public class DeviceData {
    private boolean isChecked;
    private final DeviceInfo deviceInfo;

    /**
     * DeviceData
     *
     * @param isChecked the device is checked
     * @param deviceInfo device info
     */
    public DeviceData(boolean isChecked, DeviceInfo deviceInfo) {
        this.isChecked = isChecked;
        this.deviceInfo = deviceInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isCheck) {
        isChecked = isCheck;
    }
}