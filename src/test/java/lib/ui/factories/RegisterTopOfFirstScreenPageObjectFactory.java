package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.RegisterTopOfFirstScreenPageObject;
import lib.ui.android.AndroidRegisterTopOfFirstScreenPageObject;
import lib.ui.ios.IOSRegisterTopOfFirstScreenPageObject;

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

