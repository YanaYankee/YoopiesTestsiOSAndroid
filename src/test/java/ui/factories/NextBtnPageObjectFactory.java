package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.NextBtnPageObject;
import ui.android.AndroidNextBtnPageObject;
import ui.ios.IOSNextBtnPageObject;

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

