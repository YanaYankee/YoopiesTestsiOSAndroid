package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.LogOutPageObject;

public class AndroidLogOutPageObject  extends LogOutPageObject

{
    static {
        LOG_OUT_TEXT_INIT_ELEMENT = "//*[contains(@text, 'Logout')]"; //Settings
        LOG_OUT_POPUP_TEXT_INIT_ELEMENT = "//*[contains(@text, 'LOGOUT')]";
    }
    public AndroidLogOutPageObject(AppiumDriver driver){
        super(driver);
    }
}