package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class RegisterSecondScreenPageObject extends MainPageObject {
    public static String
            REGISTER_ADDRESS_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/postalAddressInput",
            REGISTER_ADDRESS_STRING = "47 Davies Street",
            NO_SUCH_ADDRESS_INIT_ELEMENT = "Didn't find what you were looking for?",
            ADDRESS_FROM_SUGGESTED_LIST = "//*[contains(@text, '47 Davies Street')]",
            SELECT_COUNTRY_CODE_ARROW = "com.yoopies.babysittingandroid.beta:id/imageView_arrow",
            REGISTER_PHONE_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/phoneInputCarrier",
            REGISTER_PHONE_NUMBER_STRING = "637333777",
            REGISTER_BUTTON_INIT_ELEMENT = "//*[contains(@text, 'Registration')]"; //


    public RegisterSecondScreenPageObject(AppiumDriver driver){
        super(driver);
    }

    public void waitAddressInputAndClick() {
        // ********** tap Didn't find what you were looking for? btn on Create account screen  ***********************
        this.waitForElementAndClick(
                By.id(REGISTER_ADDRESS_INIT_ELEMENT),
                "Cannot find 'Didn't find what you were looking for?' ",
                4,
                "'Didn't find what you were looking for?' found"
        );

    }
    public void initRegisterAddressInputSendKeys() {
        // ********************************* Address input on Create account screen 2 ***********************
        this.waitForElementAndSendKeys(
                By.id(REGISTER_ADDRESS_INIT_ELEMENT),
                REGISTER_ADDRESS_STRING,
                "Cannot send keys to addres input",
                3,
                "Keys are sent to Address input on Create account screen 2"
        );
    }
    public void initRegisterNoSuchAddressClick() {
        // ********** tap Didn't find what you were looking for? btn on Create account screen  ***********************
        this.waitForElementAndClick(
                By.xpath(NO_SUCH_ADDRESS_INIT_ELEMENT),
                "Cannot find 'Didn't find what you were looking for?' ",
                4,
                "'Didn't find what you were looking for?' found"
        );
    }

    public void initRegisterConfirmAddress(){
        // ********** tap 44 Rue Ordener on select address screen ***********************
        this.waitForElementAndClick(
                By.xpath(ADDRESS_FROM_SUGGESTED_LIST),
                "Cannot find " + ADDRESS_FROM_SUGGESTED_LIST + " on select address screen ",
                7,
                ADDRESS_FROM_SUGGESTED_LIST + " on select address screen found"
        );
    }

    public void initRegisterPhoneCodeSelector() {
        // ******************* select phone Code arrow on Create account screen 2 ***********************
        this.waitForElementAndClick(
                By.id(SELECT_COUNTRY_CODE_ARROW),
                "Cannot find select phone Code arrow on Create account screen 2",
                3,
                "select phone Code arrow on Create account screen 2 found"
        );
    }
    public void initRegisterPhoneNumberInputSendKeys() {
        // ********** phone number input on Create account screen 2 ***********************

        this.waitForElementAndSendKeys(
                By.id(REGISTER_PHONE_INIT_ELEMENT),
                REGISTER_PHONE_NUMBER_STRING,
                "Cannot find searched emailInput on Create account screen",
                5,
                "Keys are sent to emailInput on Create account screen"
        );
    }
    public void RegisterButtonClick() {
        // ********************************* tap Next btn on Create account screen 2 ***********************
        this.waitForElementAndClick(
                By.xpath(REGISTER_BUTTON_INIT_ELEMENT),
                "Cannot find Registration btn on Register",
                7,
                "Registration btn on Register found"
        );
    }
}
