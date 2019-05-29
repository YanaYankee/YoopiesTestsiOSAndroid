package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.RegisterBottomOfFirstScreenPageObject;
import lib.ui.android.AndroidRegisterBottomOfFirstScreenPageObject;
import lib.ui.ios.IOSRegisterBottomOfFirstScreenPageObject;

public class RegisterBottomOfFirstScreenPageObjectFactory {
    public static RegisterBottomOfFirstScreenPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidRegisterBottomOfFirstScreenPageObject(driver);
        } else {
            return new IOSRegisterBottomOfFirstScreenPageObject(driver);
        }
    }
}
