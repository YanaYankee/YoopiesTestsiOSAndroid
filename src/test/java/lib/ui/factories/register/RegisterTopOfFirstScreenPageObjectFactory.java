package lib.ui.factories.register;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.RegisterTopOfFirstScreenPageObject;
import lib.ui.android.register.AndroidRegisterTopOfFirstScreenPageObject;
import lib.ui.ios.register.IOSRegisterTopOfFirstScreenPageObject;

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

