package lib.ui.ios.start;

import io.appium.java_client.AppiumDriver;
import lib.ui.SignInSignUpPageObject;

public class IOSSignInSignUpPageObject  extends SignInSignUpPageObject {
    static {
        PARENT_INIT_ELEMENT = "I am a parent";
        LOGIN_INIT_ELEMENT = "//XCUIElementTypeButton[@name='Log in']";
        LOGIN_INIT_ELEMENT_ID = "";
        REGISTER_INIT_ELEMENT = "//XCUIElementTypeButton[@name='Create an account']";
    }
    public IOSSignInSignUpPageObject(AppiumDriver driver){
        super(driver);
    }

}
