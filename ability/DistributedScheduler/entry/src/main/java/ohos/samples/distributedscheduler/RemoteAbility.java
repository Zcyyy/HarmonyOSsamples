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

package ohos.samples.distributedscheduler;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.window.dialog.ToastDialog;
import ohos.app.Context;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.rpc.IRemoteObject;

/**
 * RemoteAbility
 */
public class RemoteAbility extends Ability {
    private static final String TAG = RemoteAbility.class.getSimpleName();

    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0xD000F00, TAG);

    private static final String DESCRIPTOR = "ohos.samples.distributedscheduler.RemoteAbility";


    RemoteAgentStub remoteAgentStub = new RemoteAgentStub(DESCRIPTOR) {
        @Override
        public void setRemoteObject(String param) {
            if(isConnected) {
                showTips(RemoteAbility.this, param);
            }
        }
    };

    private boolean isConnected = false;
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        HiLog.info(LABEL_LOG, "%{public}s", "onStart");
        showTips(this, "RemoteService onStart");
    }

    @Override
    protected void onCommand(Intent intent, boolean restart, int startId) {
        super.onCommand(intent, restart, startId);
        showTips(this, "RemoteService onCommand");
    }

    @Override
    protected IRemoteObject onConnect(Intent intent) {
        showTips(RemoteAbility.this, "RemoteService onConnect");
        isConnected = true;
        return remoteAgentStub;
    }

    @Override
    protected void onDisconnect(Intent intent) {
        super.onDisconnect(intent);
        isConnected = false;
        showTips(RemoteAbility.this, "RemoteService onDisconnect");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showTips(this, "RemoteService onStop");
    }

    private void showTips(Context context, String msg) {
        getUITaskDispatcher().asyncDispatch(()->
            new ToastDialog(context).setText(msg).show()
        );
    }
}
