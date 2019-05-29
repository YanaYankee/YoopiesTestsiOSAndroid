package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class SignInSignUpPageObject extends MainPageObject {
    protected static  String
            PARENT_INIT_ELEMENT,
            LOGIN_INIT_ELEMENT_ID,
            LOGIN_INIT_ELEMENT,
            REGISTER_INIT_ELEMENT;



    public SignInSignUpPageObject(AppiumDriver driver){
        super(driver);
    }

    public void initSignInSignUpScreen() {
        this.waitForElementAndClick(
                By.id(PARENT_INIT_ELEMENT),
                "Cannot find Parent btn",
                30,
                "Parent btn found");
        this.waitForElementPresent(
                By.xpath(LOGIN_INIT_ELEMENT), //"//*[contains(@text, 'Log in')]"
                "Cannot find Login btn after clicking parent init element",
                5,
                "Login btn is found");
    }

    public void initLoginScreen() {
        // ********************************* tap PASSWORD (login) input ***********************
        this.waitForElementAndClick(
                By.xpath(LOGIN_INIT_ELEMENT), //"//*[contains(@text, 'Log in')]"
                "Cannot find Login btn after clicking parent init element",
                5,
                "Login btn on sign up / sign in screen found");
    }
    public void initLoginScreenById() {
        // ********************************* tap PASSWORD (login) input ***********************
        this.waitForElementAndClick(
                By.id(LOGIN_INIT_ELEMENT_ID), //"//*[contains(@text, 'Log in')]"
                "Cannot find Login btn after clicking parent init element",
                5,
                "Login btn on sign up / sign in screen found");
    }
    public void initLoginScreenID() {
        // ********************************* tap PASSWORD (login) input ***********************
        this.waitForElementAndClick(
                By.xpath(LOGIN_INIT_ELEMENT), //"//*[contains(@text, 'Log in')]"
                "Cannot find Login btn after clicking parent init element",
                5,
                "Login btn on sign up / sign in screen found");
    }

    public void  initRegisterScreen() {
        this.waitForElementAndClick(
                By.xpath(REGISTER_INIT_ELEMENT),
                "Cannot find searched 'Create an account' btn",
                5,
                "'Create an account' btn found");
    }
}
