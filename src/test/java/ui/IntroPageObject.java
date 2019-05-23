
package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class IntroPageObject extends MainPageObject {
     protected static  String
            SKIP_INIT_ELEMENT;


    public IntroPageObject(AppiumDriver driver) {
        super(driver);
    }
    public void initSkipIntroAction() {
    // ********************************* tap SKIP btn ************************************
        this.waitForElementAndClick(
            By.id(SKIP_INIT_ELEMENT),
            "Cannot find Skip btn after clicking loging connect init element",
            7,
        "Skip btn on intro scr found");
        }
}
