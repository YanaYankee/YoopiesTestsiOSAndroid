package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.IntroPageObject;
import lib.ui.android.AndroidIntroPageObject;
import lib.ui.ios.IOSIntroPageObject;

public class IntroPageObjectFactory {
    public static IntroPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidIntroPageObject(driver);
        } else {
            return new IOSIntroPageObject(driver);
        }
    }
}

