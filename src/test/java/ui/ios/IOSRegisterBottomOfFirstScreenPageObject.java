package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.RegisterBottomOfFirstScreenPageObject;

public class IOSRegisterBottomOfFirstScreenPageObject  extends RegisterBottomOfFirstScreenPageObject

{
    static {

        //++++++++++++++++++++++ CHANGE IOS ++++++++++++++++++++++++++++++=

        REGISTER_PASSWORD_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/passInput";
        REGISTER_PASSWORD_STRING = "Test1234";
    }
    public IOSRegisterBottomOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}
