package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.IntroPageObject;

public class IOSIntroPageObject  extends IntroPageObject {
    static {
        SKIP_INIT_ELEMENT = "xpath://XCUIElementTypeButton[@name='Skip']";
    }
    public IOSIntroPageObject(AppiumDriver driver){
        super(driver);
    }



   // driver.switchTo().alert().accept();
}
