package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class LoginPageObject extends MainPageObject {
    protected static String
            LOGIN_EMAIL_INIT_ELEMENT,
            LOGIN_PASSWORD_INIT_ELEMENT,
            LOGIN_CONNECT_INIT_ELEMENT;



    public LoginPageObject(AppiumDriver driver){
        super(driver);
    }
// ********************************* tap EMAIL (login) input ***********************
    public void initSendKeysToEmailAction() {
            this.waitForElementPresent(
                By.xpath(LOGIN_EMAIL_INIT_ELEMENT), //"//*[contains(@text, 'Log in')]"
                "Cannot find email input btn after clicking login init element",
                5,
                    "mailInput is found"
        );

            this.waitForElementAndSendKeys(
                By.xpath(LOGIN_EMAIL_INIT_ELEMENT),
                "yanina+brienne@yoopies.com",
                "Cannot find searched mailInput after clicking login init element",
                7,
                    "Keys are sent to mailInput");
    }

    public void initSendKeysToPasswordAction() {

            this.waitForElementPresent(
                    By.id(LOGIN_PASSWORD_INIT_ELEMENT), //"//*[contains(@text, 'Log in')]"
                    "Cannot find PASSWORD input after clicking login init element",
                    5,
                    "PASSWORD input is found");

// ********************************* tap PASSWORD (login) input ***********************
            this.waitForElementAndSendKeys(
                By.id(LOGIN_PASSWORD_INIT_ELEMENT),
                "Test1234",
                "Cannot find PASSWORD input field after sending keys email init element",
                2,
                    "Keys are sent to PASSWORD input");
    }
    public void initFinishLoginInProcessAction() {
// ********************************* tap CONNECT (login) btn **************************
                this.waitForElementAndClick(
                By.id(LOGIN_CONNECT_INIT_ELEMENT),
                "Cannot find CONNECT! btn after sending keys to login password element",
                2,
                        "CONNECT btn on login screen found");

    }

}
