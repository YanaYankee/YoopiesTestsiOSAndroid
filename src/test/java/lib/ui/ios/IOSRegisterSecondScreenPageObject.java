package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterSecondScreenPageObject;

public class IOSRegisterSecondScreenPageObject   extends RegisterSecondScreenPageObject

{
    static {
        REGISTER_ADDRESS_INIT_ELEMENT = "//XCUIElementTypeTextField[1][@value='Address']"; //"//XCUIElementTypeTextField[2][@value='Last Name']";
        REGISTER_ADDRESS_STRING = "22 Rue Ordener, 75018 Paris, France";
        NO_SUCH_ADDRESS_INIT_ELEMENT = "Didn't find what you were looking for?";
        ADDRESS_FROM_SUGGESTED_LIST = "(//XCUIElementTypeStaticText[@name='22 Rue Ordener'])[1]";
        SELECT_COUNTRY_CODE_ARROW = "com.yoopies.babysittingandroid.beta:id/imageView_arrow";
        REGISTER_PHONE_INIT_ELEMENT = "//XCUIElementTypeTextField[3][@value='Phone']";
        REGISTER_PHONE_NUMBER_STRING = "0791112345";
        REGISTER_BUTTON_INIT_ELEMENT = "//XCUIElementTypeButton[@name='Registration']"; //
    }
    public IOSRegisterSecondScreenPageObject(AppiumDriver driver){
        super(driver);
    }

}

