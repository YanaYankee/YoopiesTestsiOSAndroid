package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.CountriesSpinnerPageObject;
import lib.ui.android.AndroidCountriesSpinnerPageObject;
import lib.ui.ios.IOSCountriesSpinnerPageObject;

public class CountriesSpinnerPageObjectFactory {
    public static CountriesSpinnerPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidCountriesSpinnerPageObject(driver);
        } else {
            return new IOSCountriesSpinnerPageObject(driver);
        }
    }
}
