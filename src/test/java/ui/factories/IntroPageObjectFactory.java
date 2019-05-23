package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.IntroPageObject;
import ui.android.AndroidIntroPageObject;
import ui.ios.IOSIntroPageObject;

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
