package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.LoginPageObject;
import ui.android.AndroidLoginPageObject;
import ui.ios.IOSLoginPageObject;

public class LoginPageObjectFactory {
    public static LoginPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidLoginPageObject(driver);
        } else {
            return new IOSLoginPageObject(driver);
        }
    }
}

