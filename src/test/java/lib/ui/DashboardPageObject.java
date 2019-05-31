package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

    abstract public class DashboardPageObject  extends MainPageObject {
        protected static  String
                HELLO_ELEMENT_ID,
        START_YOUR_FIRST_SEARCH_BUTTON_ID,

        START_YOUR_FIRST_SEARCH_BUTTON = "Start your first search btn",
        SCREEN_NAME = "Dashboard screen";

        public DashboardPageObject(AppiumDriver driver) {
            super(driver);
        }
        public void waitForHelloTitleOnDashboardPresent() {
            this.waitForElementPresent(
                    By.id(HELLO_ELEMENT_ID),
                    "Cannot find Hello title on " + SCREEN_NAME,
                    7,
                    START_YOUR_FIRST_SEARCH_BUTTON +" is found");
        }
        public void initStartYourFirstSearch() {
            this.waitForElementPresent(
                    By.id(START_YOUR_FIRST_SEARCH_BUTTON_ID),
                    "Cannot find " + START_YOUR_FIRST_SEARCH_BUTTON + " on " + SCREEN_NAME,
                    7,
                    START_YOUR_FIRST_SEARCH_BUTTON +" is found");
        }
    }

