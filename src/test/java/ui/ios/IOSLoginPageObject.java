package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.LoginPageObject;

public class IOSLoginPageObject extends LoginPageObject

{
    static {
        LOGIN_EMAIL_INIT_ELEMENT = "xpath://XCUIElementTypeTextField[@value='Email']";
        LOGIN_PASSWORD_INIT_ELEMENT = "xpath://XCUIElementTypeTextField[@value='Password']";
        LOGIN_CONNECT_INIT_ELEMENT = "id:CONNECT!";
    }
    public IOSLoginPageObject(AppiumDriver driver){
        super(driver);
    }

}
