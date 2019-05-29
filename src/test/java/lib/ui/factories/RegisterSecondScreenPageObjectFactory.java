package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.RegisterSecondScreenPageObject;
import lib.ui.android.AndroidRegisterSecondScreenPageObject;
import lib.ui.ios.IOSRegisterSecondScreenPageObject;

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

