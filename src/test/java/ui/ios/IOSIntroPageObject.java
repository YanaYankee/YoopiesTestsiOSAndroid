package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.IntroPageObject;

public class IOSIntroPageObject  extends IntroPageObject {
    static {
        SKIP_INIT_ELEMENT = "Skip";
        ALLOW_NOTIFICATIONS_INIT_ELEMENT = "//XCUIElementTypeAlert[@name='BabySitting Yoopies Would Like to Send You Notifications']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]";

    }
    public IOSIntroPageObject(AppiumDriver driver){
        super(driver);
    }

   // driver.switchTo().alert().accept();
}
