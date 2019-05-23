package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.LogOutPageObject;
import ui.android.AndroidLogOutPageObject;
import ui.ios.IOSLogOutPageObject;

public class LogOutPageObjectFactory {
    public static LogOutPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidLogOutPageObject(driver);
        } else {
            return new IOSLogOutPageObject(driver);
        }
    }
}

