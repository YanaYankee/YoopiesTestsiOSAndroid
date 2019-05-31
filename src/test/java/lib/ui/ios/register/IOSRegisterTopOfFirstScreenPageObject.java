package lib.ui.ios.register;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterTopOfFirstScreenPageObject;

public class IOSRegisterTopOfFirstScreenPageObject extends RegisterTopOfFirstScreenPageObject

{
    static {

        //+++++++++++++++++++++++++++++++ CHANGE FOR IOS+++++++++++++++++++++++++++++

        REGISTER_EMAIL_INIT_ELEMENT = "//XCUIElementTypeTextField[3][@value='Email']";
        REGISTER_NAME = "iOSautotestParent";
        REGISTER_NAME_INIT_ELEMENT = "//XCUIElementTypeTextField[2][@value='Last Name']";
        REGISTER_LAST_NAME_INIT_ELEMENT = "//XCUIElementTypeTextField[1][@value='Name']";
    }
    public IOSRegisterTopOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}