package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.RegisterBottomOfFirstScreenPageObject;
import ui.android.AndroidRegisterBottomOfFirstScreenPageObject;
import ui.ios.IOSRegisterBottomOfFirstScreenPageObject;

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
