package lib.ui.android.register;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterTopOfFirstScreenPageObject;

public class AndroidRegisterTopOfFirstScreenPageObject  extends RegisterTopOfFirstScreenPageObject

{
    static {
        REGISTER_EMAIL_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/mailInput";
        REGISTER_NAME = "autotestParent";
        REGISTER_NAME_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/firstnameInput";
        REGISTER_LAST_NAME_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/lastnameInput";

    }
    public AndroidRegisterTopOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}