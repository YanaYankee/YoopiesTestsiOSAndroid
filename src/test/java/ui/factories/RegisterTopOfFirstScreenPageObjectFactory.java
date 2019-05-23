package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.RegisterTopOfFirstScreenPageObject;
import ui.android.AndroidRegisterTopOfFirstScreenPageObject;
import ui.ios.IOSRegisterTopOfFirstScreenPageObject;

public class RegisterTopOfFirstScreenPageObjectFactory {
    public static RegisterTopOfFirstScreenPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidRegisterTopOfFirstScreenPageObject(driver);
        } else {
            return new IOSRegisterTopOfFirstScreenPageObject(driver);
        }
    }
}

