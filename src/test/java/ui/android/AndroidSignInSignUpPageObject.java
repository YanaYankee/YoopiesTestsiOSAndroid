package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.SignInSignUpPageObject;

public class AndroidSignInSignUpPageObject extends SignInSignUpPageObject {
    static {
        PARENT_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/btnParent";
        LOGIN_INIT_ELEMENT = "//*[contains(@text, 'Log in')]";
        REGISTER_INIT_ELEMENT = "//*[contains(@text, 'Create an account')]";
    }
    public AndroidSignInSignUpPageObject(AppiumDriver driver){
        super(driver);
    }
}
