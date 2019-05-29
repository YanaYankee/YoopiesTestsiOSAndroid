package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class CountriesSpinnerPageObject extends MainPageObject {
    protected static String
            COUNTRIES_SPINNER_INIT_ELEMENT,
            FRANCE_COUNTRY_INIT_ELEMENT,
            ACCEPT_BUTTON_INIT_ELEMENT,
            FRANCE_COUNTRY_FROM_PICKER_INIT_ELEMENT;


    public CountriesSpinnerPageObject(AppiumDriver driver){
        super(driver);
    }

    public void initCountriesSpinnerObject() {
        // ********** tap Didn't find what you were looking for? btn on Create account screen  ***********************
        this.waitForElementAndClick(
                By.id(COUNTRIES_SPINNER_INIT_ELEMENT),
                "Cannot find 'Didn't find what you were looking for?' ",
                3,
                "'Didn't find what you were looking for?' found"
        );
    }
    public void SelectCountry() {
        // ********** tap FR text on select country screen ***********************
        this.waitForElementAndClick(
                By.xpath(FRANCE_COUNTRY_INIT_ELEMENT),
                "Cannot find FR on select country screen ",
                3,
                " FR on select country found"
        );
    }
    public void AcceptButtonClick() {
        // ********** tap ACCEPT btn on select country screen ***********************
        this.waitForElementAndClick(
                By.id(ACCEPT_BUTTON_INIT_ELEMENT),
                "Cannot find ACCEPT btn on select country screen ",
                7,
                "ACCEPT btn on select country screen found"
        );
    }

    public void SelectCountryCode() {
        // ********** tap FR text on select country screen ***********************
        this.waitForElementAndClick(
                By.xpath(FRANCE_COUNTRY_FROM_PICKER_INIT_ELEMENT),
                "Cannot find "+ FRANCE_COUNTRY_FROM_PICKER_INIT_ELEMENT + " on select country screen ",
                3,
                FRANCE_COUNTRY_FROM_PICKER_INIT_ELEMENT + " on select country screen found"
        );
    }
}

