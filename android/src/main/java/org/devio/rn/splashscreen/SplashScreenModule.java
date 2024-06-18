package org.devio.rn.splashscreen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/**
 * SplashScreen
 * 启动屏
 * from：http://www.devio.org
 * Author:CrazyCodeBoy
 * GitHub:https://github.com/crazycodeboy
 * Email:crazycodeboy@gmail.com
 */
public class SplashScreenModule extends NativeSplashScreenSpec {
    public SplashScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public void hide(Promise promise) {
        SplashScreen.hide(getCurrentActivity());
        promise.resolve(true);
    }
}
