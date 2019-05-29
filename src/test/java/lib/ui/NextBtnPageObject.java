package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class NextBtnPageObject extends MainPageObject {
protected static String
        NEXT_BUTTON_INIT_ELEMENT;


public NextBtnPageObject(AppiumDriver driver){
    super(driver);
}

public void nextButtonClick() {

    // ********************************* tap Next btn on Create account screen  ***********************
    this.waitForElementAndClick(
            By.id(NEXT_BUTTON_INIT_ELEMENT),
            "Cannot find Next btn on Register",
            8,
            "Next btn found"
    );
}
}
