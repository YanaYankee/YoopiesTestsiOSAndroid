package lib.ui.factories.search;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SearchMainPageObject;
import lib.ui.android.search.AndroidSearchMainPageObject;
import lib.ui.ios.search.IOSSearchMainPageObject;


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

