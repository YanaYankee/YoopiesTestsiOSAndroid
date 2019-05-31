package lib.ui.factories.start;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.DashboardPageObject;
import lib.ui.android.start.AndroidDashboardPageObject;
import lib.ui.ios.start.IOSDashboardPageObject;

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