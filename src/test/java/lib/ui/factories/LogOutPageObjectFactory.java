package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.LogOutPageObject;
import lib.ui.android.AndroidLogOutPageObject;
import lib.ui.ios.IOSLogOutPageObject;

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

