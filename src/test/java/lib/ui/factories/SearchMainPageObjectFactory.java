package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SearchMainPageObject;
import lib.ui.android.AndroidSearchMainPageObject;
import lib.ui.ios.IOSSearchMainPageObject;


public class SearchMainPageObjectFactory {
    public static SearchMainPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSearchMainPageObject(driver);
        } else {
            return new IOSSearchMainPageObject(driver);
        }
    }
}

