
package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class IntroPageObject extends MainPageObject {
     protected static  String
            SKIP_INIT_ELEMENT,
            ALLOW_NOTIFICATIONS_INIT_ELEMENT,
             INTRO_NEXT_BUTTON_ID,
             INTRO_FIRST_SLIDE_TITLE_ID,
             INTRO_SECOND_SLIDE_TITLE_ID,
             INTRO_THIRD_SLIDE_TITLE_ID,
             INTRO_LETS_GO_BUTTON_ID,
             INTRO_NEXT_BUTTON = "Next",
             INTRO_FIRST_SLIDE_TITLE = "Find the perfect childcarer",
             INTRO_SECOND_SLIDE_TITLE = "Request an interview",
             INTRO_THIRD_SLIDE_TITLE = "Book online and relax",
             INTRO_LETS_GO_BUTTON = "Let's go!";

    public IntroPageObject(AppiumDriver driver) {
        super(driver);
    }
    public void initSkipIntroAction() {
    // ********************************* tap SKIP btn ************************************
        this.waitForElementAndClick(
            By.id(SKIP_INIT_ELEMENT),
            "Cannot find Skip btn after clicking loging connect init element",
            18,
        "Skip btn on intro scr found");
        }
    public void initAllowNotificationBtnClickAction() {
        // ********************************* tap SKIP btn ************************************
        this.waitForElementAndClick(
                By.xpath(ALLOW_NOTIFICATIONS_INIT_ELEMENT),
                "Cannot find Allow Notifications btn after clicking loging connect init element",
                20,
                "Allow Notifications btn on intro scr found");
    }

    public void initIntroSliderViewAction() {
        this.waitForElementPresent(
            By.id(INTRO_FIRST_SLIDE_TITLE_ID), //"//*[contains(@text, 'Log in')]"
                "Cannot find " + INTRO_FIRST_SLIDE_TITLE + "after initializing first slider",
            5,
                INTRO_FIRST_SLIDE_TITLE + " is found");

        this.waitForElementAndClick(
                By.id(INTRO_NEXT_BUTTON_ID),
                "Cannot find " + INTRO_NEXT_BUTTON + " after initializing last screen",
                7,
                INTRO_NEXT_BUTTON + " is found");

        this.waitForElementPresent(
            By.id(INTRO_SECOND_SLIDE_TITLE_ID),
                "Cannot find " + INTRO_SECOND_SLIDE_TITLE + "after initializing first slider",
            5,
                INTRO_SECOND_SLIDE_TITLE + " is found");

        MainPageObject.swipeElementToLeft(3);

        this.waitForElementPresent(
                By.id(INTRO_THIRD_SLIDE_TITLE_ID), //"//*[contains(@text, 'Log in')]"
                "Cannot find " + INTRO_THIRD_SLIDE_TITLE + "after initializing first slider",
                5,
                INTRO_THIRD_SLIDE_TITLE + " is found");

        this.waitForElementAndClick(
                By.id(INTRO_LETS_GO_BUTTON_ID),
                "Cannot find " + INTRO_LETS_GO_BUTTON + " after initializing last screen",
                5,
                INTRO_LETS_GO_BUTTON + " is found");

    }

}
