package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

    abstract public class DashboardPageObject  extends MainPageObject {
        protected static  String
                HELLO_ELEMENT_ID;

        public DashboardPageObject(AppiumDriver driver) {
            super(driver);
        }
        public void waitForHelloTitleOnDashboardPresent() {
            this.waitForElementPresent(
                    By.id(HELLO_ELEMENT_ID),
                    "Cannot find Hello title on dashboard screen btn arrow",
                    7,
                    "Help btn id found");
        }
    }

