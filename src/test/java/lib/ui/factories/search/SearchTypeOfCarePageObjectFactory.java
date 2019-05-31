package lib.ui.factories.search;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SearchTypeOfCarePageObject;
import lib.ui.android.search.AndroidSearchTypeOfCarePageObject;
import lib.ui.ios.search.IOSSearchTypeOfCarePageObject;


public class SearchTypeOfCarePageObjectFactory {
    public static SearchTypeOfCarePageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSearchTypeOfCarePageObject(driver);
        } else {
            return new IOSSearchTypeOfCarePageObject(driver);
        }
    }
}

