package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SettingsPageObject;
import lib.ui.SimulatorPageObject;
import lib.ui.android.AndroidSettingsPageObject;
import lib.ui.android.AndroidSimulatorPageObject;
import lib.ui.ios.IOSSettingsPageObject;
import lib.ui.ios.IOSSimulatorPageObject;

public class SimulatorPageObjectFactory {
    public static SimulatorPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSimulatorPageObject(driver);
        } else {
            return new IOSSimulatorPageObject(driver);
        }
    }
}

