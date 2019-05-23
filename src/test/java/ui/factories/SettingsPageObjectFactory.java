package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.SettingsPageObject;
import ui.android.AndroidSettingsPageObject;
import ui.ios.IOSSettingsPageObject;

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

