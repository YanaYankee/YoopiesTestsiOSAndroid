package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.LoginPageObject;

public class IOSLoginPageObject extends LoginPageObject

{
    static {
        LOGIN_EMAIL_INIT_ELEMENT = "//XCUIElementTypeTextField[@value='Email']";
        DONE_INIT_ELEMENT = "//XCUIElementTypeButton[@name='done']";
        LOGIN_PASSWORD_INIT_ELEMENT = "//XCUIElementTypeSecureTextField[@value='Password']";
        LOGIN_CONNECT_INIT_ELEMENT = "CONNECT!";
    }
    public IOSLoginPageObject(AppiumDriver driver){
        super(driver);
    }

}
