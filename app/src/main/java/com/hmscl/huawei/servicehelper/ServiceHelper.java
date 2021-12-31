/*
 *   Copyright 2021. Explore in HMS. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.hmscl.huawei.servicehelper;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.unity3d.player.UnityPlayer;

public class ServiceHelper {

    public static boolean isGMSAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(UnityPlayer.currentActivity)
                == ConnectionResult.SUCCESS;
    }

    public static boolean isHMSAvailable() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(UnityPlayer.currentActivity)
                == com.huawei.hms.api.ConnectionResult.SUCCESS;
    }
}
