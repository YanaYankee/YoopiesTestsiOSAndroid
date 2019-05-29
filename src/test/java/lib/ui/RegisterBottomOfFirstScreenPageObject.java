package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.By;

abstract public class RegisterBottomOfFirstScreenPageObject  extends MainPageObject {
    protected static String
    REGISTER_PASSWORD_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/passInput",
    REGISTER_PASSWORD_STRING = "Test1234";


    public RegisterBottomOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


    public void swipeToInitRegisterBottomScreen() {
// ***************** swipe for Password and password input on Create account screen ************************************
        this.swipeUpToElementOnKeyBoardOpened(
                By.id(REGISTER_PASSWORD_INIT_ELEMENT),
                //          By.xpath("//*[@text='View page in browser1']"), //to check if test works
                "Cannot find the Password input on register screen. Swipe failed",
                1,
                "Swipe on register screen is executed");

    }
    public void initRegisterPasswordInputSendKeys() {
        // ********************************* password on Create account screen ***********************
        if (Platform.getInstance().isAndroid()) {
            this.waitForElementAndSendKeys(
                    By.id(REGISTER_PASSWORD_INIT_ELEMENT),
                    REGISTER_PASSWORD_STRING,
                    "Cannot find searched Password input on Create account screen",
                    3,
                    REGISTER_PASSWORD_STRING + "Keys sent to emailInput"
            );

    } else {
            if (Platform.getInstance().isIOS()) {
                this.waitForElementAndSendKeys(
                        By.xpath(REGISTER_PASSWORD_INIT_ELEMENT),
                        REGISTER_PASSWORD_STRING,
                        "Cannot find searched Password input on Create account screen",
                        3,
                        REGISTER_PASSWORD_STRING + "Keys sent to emailInput"
                );

        }

        }
    }
}