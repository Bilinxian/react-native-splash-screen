package org.devio.rn.splashscreen;

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
    private final ReactApplicationContext reactApplicationContext;

    public SplashScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactApplicationContext = reactContext;
    }

    @Override
    public void hide() {
        SplashScreen.hide(reactApplicationContext.getCurrentActivity());
    }
}
