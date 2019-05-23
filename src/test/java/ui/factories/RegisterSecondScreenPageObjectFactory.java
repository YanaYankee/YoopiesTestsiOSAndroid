package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.RegisterSecondScreenPageObject;
import ui.android.AndroidRegisterSecondScreenPageObject;
import ui.ios.IOSRegisterSecondScreenPageObject;

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

