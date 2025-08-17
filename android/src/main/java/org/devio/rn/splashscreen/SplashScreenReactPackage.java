package org.devio.rn.splashscreen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * SplashScreen
 * 启动屏
 * from：http://www.devio.org
 * Author:CrazyCodeBoy
 * GitHub:https://github.com/crazycodeboy
 * Email:crazycodeboy@gmail.com
 */
public class SplashScreenReactPackage extends BaseReactPackage {

    @NonNull
    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return () -> {
            final Map<String, ReactModuleInfo> moduleInfo = new HashMap<>();
            boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            moduleInfo.put(
                    SplashScreenModule.NAME,
                    new ReactModuleInfo(
                            SplashScreenModule.NAME,
                            SplashScreenModule.NAME,
                            false, // canOverrideExistingModule
                            false, // needsEagerInit
                            false, // isCxxModule
                            isTurboModule // isTurboModule
                    ));
            return moduleInfo;
        };
    }

    @Nullable
    @Override
    public NativeModule getModule(@NonNull String name, @NonNull ReactApplicationContext reactApplicationContext) {
        if (name.equals(SplashScreenModule.NAME)) {
            return new SplashScreenModule(reactApplicationContext);
        }
        return null;
    }
}
