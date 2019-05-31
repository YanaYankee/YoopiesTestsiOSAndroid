package lib.ui.factories.start;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.LoginPageObject;
import lib.ui.android.start.AndroidLoginPageObject;
import lib.ui.ios.start.IOSLoginPageObject;

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

