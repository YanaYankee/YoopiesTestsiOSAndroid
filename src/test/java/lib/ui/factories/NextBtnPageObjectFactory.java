package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.NextBtnPageObject;
import lib.ui.android.AndroidNextBtnPageObject;
import lib.ui.ios.IOSNextBtnPageObject;

public class NextBtnPageObjectFactory {
    public static NextBtnPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidNextBtnPageObject(driver);
        } else {
            return new IOSNextBtnPageObject(driver);
        }
    }
}

