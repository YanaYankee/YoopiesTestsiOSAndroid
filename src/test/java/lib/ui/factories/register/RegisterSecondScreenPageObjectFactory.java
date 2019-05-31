package lib.ui.factories.register;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.RegisterSecondScreenPageObject;
import lib.ui.android.register.AndroidRegisterSecondScreenPageObject;
import lib.ui.ios.register.IOSRegisterSecondScreenPageObject;

public class RegisterSecondScreenPageObjectFactory {
    public static RegisterSecondScreenPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidRegisterSecondScreenPageObject(driver);
        } else {
            return new IOSRegisterSecondScreenPageObject(driver);
        }
    }
}

