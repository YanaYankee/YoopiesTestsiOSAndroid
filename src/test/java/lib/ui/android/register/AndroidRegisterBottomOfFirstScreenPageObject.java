package lib.ui.android.register;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterBottomOfFirstScreenPageObject;

public class AndroidRegisterBottomOfFirstScreenPageObject extends RegisterBottomOfFirstScreenPageObject

{
    static {
        REGISTER_PASSWORD_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/passInput";
        REGISTER_PASSWORD_STRING = "Test1234";
    }
    public AndroidRegisterBottomOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}
