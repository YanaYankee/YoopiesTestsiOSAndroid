package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.By;

abstract public class RegisterSecondScreenPageObject extends MainPageObject {
    public static String
            REGISTER_ADDRESS_INIT_ELEMENT,
            REGISTER_ADDRESS_STRING_TPL,
            NO_SUCH_ADDRESS_INIT_ELEMENT,
            ADDRESS_FROM_SUGGESTED_LIST,
            SELECT_COUNTRY_CODE_ARROW,
            REGISTER_PHONE_INIT_ELEMENT,
            REGISTER_PHONE_NUMBER_STRING,
            REGISTER_BUTTON_INIT_ELEMENT ; //

    private static String getAddressXPathByTitle(String address_string) {
        return REGISTER_ADDRESS_STRING_TPL.replace("{ADDRESS}", address_string);
    }

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
    public void initRegisterAddressInputSendKeys(String address_string) {
        String address = getAddressXPathByTitle(address_string);
        // ********************************* Address input on Create account screen 2 ***********************
        if (Platform.getInstance().isAndroid()) {
            this.waitForElementAndClick(
                    By.id(REGISTER_ADDRESS_INIT_ELEMENT),
                    "Cannot find  address input on Create account screen 2",
                    5,
                    "Address input is found on Create account screen 2"
            );
            this.waitForElementAndSendKeys(
                    By.id(REGISTER_ADDRESS_INIT_ELEMENT),
                    address,
                    "Cannot send keys to address input on Create account screen 2",
                    8,
                    "Keys are sent to Address input on Create account screen 2"
            );
        } else {
            this.waitForElementAndClick(
                    By.xpath(REGISTER_ADDRESS_INIT_ELEMENT),
                    "Cannot find  address input on Create account screen 2",
                    5,
                    "Address input is found on Create account screen 2"
            );
            this.waitForElementAndSendKeys(
                    By.xpath(REGISTER_ADDRESS_INIT_ELEMENT),
                    address,
                    "Cannot send keys to address input on Create account screen 2",
                    5,
                    "Keys are sent to Address input on Create account screen 2"
            );
        }
    }
    public void initRegisterNoSuchAddressClick() {
        // ********** tap Didn't find what you were looking for? btn on Create account screen  ***********************
        this.waitForElementPresent(
                By.id(NO_SUCH_ADDRESS_INIT_ELEMENT),
                "Cannot find 'Didn't find what you were looking for?' ",
                7,
                "Found 'Didn't find what you were looking for?' "
        );
        // ********** tap Didn't find what you were looking for? btn on Create account screen  ***********************
        this.waitForElementAndClick(
                By.id(NO_SUCH_ADDRESS_INIT_ELEMENT),
                "Cannot find 'Didn't find what you were looking for?' ",
                7,
                "'Clicked what you were looking for?' found"
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
        if (Platform.getInstance().isAndroid()) {
            this.waitForElementAndSendKeys(
                    By.id(REGISTER_PHONE_INIT_ELEMENT),
                    REGISTER_PHONE_NUMBER_STRING,
                    "Cannot find searched PhoneNumberInput on Create account screen",
                    5,
                    "Keys are sent to PhoneNumberInput on Create account screen"
            );
        } else {
            this.waitForElementAndSendKeys(
                    By.xpath(REGISTER_PHONE_INIT_ELEMENT),
                    REGISTER_PHONE_NUMBER_STRING,
                    "Cannot find searched PhoneNumberInput on Create account screen",
                    5,
                    "Keys are sent to PhoneNumberInput on Create account screen"
            );
        }
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
    public void cleanPhoneNumberInputandSendKeys() {
        // ********** phone number input on Create account screen 2 ***********************
            this.waitForElementAndClear(
                    By.id(REGISTER_PHONE_INIT_ELEMENT),
                    "Cannot find searched emailInput on Create account screen",
                    5,
                    "Keys are sent to emailInput on Create account screen"
            );
        this.waitForElementAndSendKeys(
                By.xpath(REGISTER_PHONE_INIT_ELEMENT),
                REGISTER_PHONE_NUMBER_STRING,
                "Cannot find searched emailInput on Create account screen",
                5,
                "Keys are sent to emailInput on Create account screen"
        );
    }
    public void insertPhoneNumber(){
    this.waitForElementAndClearAndSendKeys(
            By.id(REGISTER_PHONE_INIT_ELEMENT),
            REGISTER_PHONE_NUMBER_STRING,
            "Cannot find searched Phone on Create account screen",
            5,
            "Keys are sent to Phone on Create account screen"
        );
    }
}
