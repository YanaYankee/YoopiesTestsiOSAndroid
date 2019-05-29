package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class LogOutPageObject extends MainPageObject {
    public static String

     LOG_OUT_TEXT_INIT_ELEMENT, //Settings
     LOG_OUT_POPUP_TEXT_INIT_ELEMENT;

    public LogOutPageObject(AppiumDriver driver){
        super(driver);
    }

    public void waitForElementLogoutPresent() {
        this.waitForElementPresent(
                By.xpath( LOG_OUT_TEXT_INIT_ELEMENT),
                "Cannot find Logout btn",
                5,
                "logout btn is found");
    }

    public void initLogoutClickAction() {
        this.waitForElementAndClick(
                By.xpath( LOG_OUT_TEXT_INIT_ELEMENT),
                "Cannot find Logout btn",
                4,
                "Logout btn is clicked");

    }
    public void initLOGOUTPopupClickAction() {
        this.waitForElementAndClick(
                By.xpath( LOG_OUT_POPUP_TEXT_INIT_ELEMENT),
                "Cannot find Logout btn",
                3,
               "LOGOUT popup button is clicked");

    }
}