package lib.ui.android.start;

import io.appium.java_client.AppiumDriver;
import lib.ui.LoginPageObject;

public class AndroidLoginPageObject extends LoginPageObject

    {
        static {
            LOGIN_EMAIL_INIT_ELEMENT = "//*[contains(@text, 'Email')]";
            LOGIN_PASSWORD_INIT_ELEMENT = "//*[contains(@text, 'Password')]";
            LOGIN_CONNECT_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/connect";
    }
    public AndroidLoginPageObject(AppiumDriver driver){
        super(driver);
    }


    }
