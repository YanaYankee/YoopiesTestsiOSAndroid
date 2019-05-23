package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.LoginPageObject;

public class AndroidLoginPageObject extends LoginPageObject

    {
        static {
            LOGIN_EMAIL_INIT_ELEMENT = "//*[contains(@text, 'Email')]";
            LOGIN_PASSWORD_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/passInput";
            LOGIN_CONNECT_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/connect";
    }
    public AndroidLoginPageObject(AppiumDriver driver){
        super(driver);
    }


    }
