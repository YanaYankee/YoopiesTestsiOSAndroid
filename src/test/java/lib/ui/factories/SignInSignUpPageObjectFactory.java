package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SignInSignUpPageObject;
import lib.ui.android.AndroidSignInSignUpPageObject;
import lib.ui.ios.IOSSignInSignUpPageObject;

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
