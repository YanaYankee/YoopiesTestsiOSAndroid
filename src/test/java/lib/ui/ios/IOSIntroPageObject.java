package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.IntroPageObject;

public class IOSIntroPageObject  extends IntroPageObject {
    static {
        SKIP_INIT_ELEMENT = "Skip";
        ALLOW_NOTIFICATIONS_INIT_ELEMENT = "//XCUIElementTypeAlert[@name='BabySitting Yoopies Would Like to Send You Notifications']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]";
        INTRO_NEXT_BUTTON_ID = "Next";
        INTRO_FIRST_SLIDE_TITLE_ID = "Find the perfect childcarer";
        INTRO_SECOND_SLIDE_TITLE_ID = "Request an interview";
        INTRO_THIRD_SLIDE_TITLE_ID ="Book online and relax";
        INTRO_LETS_GO_BUTTON_ID = "Let's go!";
    }
    public IOSIntroPageObject(AppiumDriver driver){
        super(driver);
    }

   // driver.switchTo().alert().accept();
}
