package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.DashboardPageObject;
import lib.ui.android.AndroidDashboardPageObject;
import lib.ui.ios.IOSDashboardPageObject;

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