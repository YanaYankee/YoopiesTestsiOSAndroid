package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.SignInSignUpPageObject;

public class IOSSignInSignUpPageObject  extends SignInSignUpPageObject {
    static {
        PARENT_INIT_ELEMENT = "I am a parent";
        LOGIN_INIT_ELEMENT = "//XCUIElementTypeButton[@name='Log in']";
        REGISTER_INIT_ELEMENT = "//XCUIElementTypeButton[@name='Create an account']";
    }
    public IOSSignInSignUpPageObject(AppiumDriver driver){
        super(driver);
    }

}
