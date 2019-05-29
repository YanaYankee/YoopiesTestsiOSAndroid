package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.CountriesSpinnerPageObject;

public class IOSCountriesSpinnerPageObject extends CountriesSpinnerPageObject

{
    //  =========================== IOS TO CHANGE =======================
    static {
        COUNTRIES_SPINNER_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/countriesSpinner";
        FRANCE_COUNTRY_INIT_ELEMENT = "//*[contains(@text, 'FR')]";
        ACCEPT_BUTTON_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/positiveButton";
        FRANCE_COUNTRY_FROM_PICKER_INIT_ELEMENT = "//*[contains(@text, 'France (FR)')]";
    }
    public IOSCountriesSpinnerPageObject(AppiumDriver driver){
        super(driver);
    }
}