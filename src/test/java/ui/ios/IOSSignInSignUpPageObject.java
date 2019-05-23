package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.SignInSignUpPageObject;

public class IOSSignInSignUpPageObject  extends SignInSignUpPageObject {
    static {
        PARENT_INIT_ELEMENT = "id:I am a parent";
        LOGIN_INIT_ELEMENT = "xpath://XCUIElementTypeButton[@name='Log in']";
        REGISTER_INIT_ELEMENT = "xpath://XCUIElementTypeButton[@name='Create an account']";
    }
    public IOSSignInSignUpPageObject(AppiumDriver driver){
        super(driver);
    }

}
