package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.LogOutPageObject;

public class IOSLogOutPageObject extends LogOutPageObject

{
    static {
        //  =========================== IOS TO CHANGE =======================


        LOG_OUT_TEXT_INIT_ELEMENT = "//XCUIElementTypeStaticText[@name='Logout']"; //Settings
        LOG_OUT_POPUP_TEXT_INIT_ELEMENT = "//*[contains(@text, 'LOGOUT')]";
    }
    public IOSLogOutPageObject(AppiumDriver driver){
        super(driver);
    }
}
