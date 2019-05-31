package lib.ui.ios.register;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterBottomOfFirstScreenPageObject;

public class IOSRegisterBottomOfFirstScreenPageObject  extends RegisterBottomOfFirstScreenPageObject

{
    static {

        //++++++++++++++++++++++ CHANGE IOS ++++++++++++++++++++++++++++++=

        REGISTER_PASSWORD_INIT_ELEMENT = "//XCUIElementTypeSecureTextField[@value='Password']";
        REGISTER_PASSWORD_STRING = "Test1234";
    }
    public IOSRegisterBottomOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}
