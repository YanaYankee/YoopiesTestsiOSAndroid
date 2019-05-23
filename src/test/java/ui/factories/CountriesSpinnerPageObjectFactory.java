package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.CountriesSpinnerPageObject;
import ui.android.AndroidCountriesSpinnerPageObject;
import ui.ios.IOSCountriesSpinnerPageObject;

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
