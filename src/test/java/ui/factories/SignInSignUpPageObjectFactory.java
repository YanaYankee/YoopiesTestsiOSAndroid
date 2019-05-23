package ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import ui.SignInSignUpPageObject;
import ui.android.AndroidSignInSignUpPageObject;
import ui.ios.IOSSignInSignUpPageObject;

public class SignInSignUpPageObjectFactory {
    public static SignInSignUpPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSignInSignUpPageObject(driver);
        } else {
            return new IOSSignInSignUpPageObject(driver);
        }
    }
}
