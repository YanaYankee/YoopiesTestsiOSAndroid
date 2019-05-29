package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SettingsPageObject;
import lib.ui.android.AndroidSettingsPageObject;
import lib.ui.ios.IOSSettingsPageObject;

public class SettingsPageObjectFactory {
    public static SettingsPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSettingsPageObject(driver);
        } else {
            return new IOSSettingsPageObject(driver);
        }
    }
}

