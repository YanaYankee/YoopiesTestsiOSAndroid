package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.RegisterTopOfFirstScreenPageObject;

public class IOSRegisterTopOfFirstScreenPageObject extends RegisterTopOfFirstScreenPageObject

{
    static {

        //+++++++++++++++++++++++++++++++ CHANGE FOR IOS+++++++++++++++++++++++++++++

        REGISTER_EMAIL_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/mailInput";
        REGISTER_NAME = "autotestParent";
        REGISTER_NAME_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/firstnameInput";
        REGISTER_LAST_NAME_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/lastnameInput";

    }
    public IOSRegisterTopOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}