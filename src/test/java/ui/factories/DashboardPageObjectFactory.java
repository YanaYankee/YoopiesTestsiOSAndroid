package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.DashboardPageObject;
import ui.android.AndroidDashboardPageObject;
import ui.ios.IOSDashboardPageObject;

public class DashboardPageObjectFactory {
    public static DashboardPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidDashboardPageObject(driver);
        } else {
            return new IOSDashboardPageObject(driver);
        }
    }
}