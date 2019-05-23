package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.SettingsPageObject;

public class IOSSettingsPageObject extends SettingsPageObject

{
    static {

       // ++++++++++++++++++++ EDIT FOR IOS++++++++++++++++++++++++++
        NAME_FIELD_ELEMENT = "";
        HELP_BUTTON_FIND_ELEMENT = "com.yoopies.babysittingandroid.beta:id/help";
        SETTING_PAYMENT_ID_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/payment";
        HELP = "//*[contains(@text, 'Help')]";
        SETTING_CLASS_ID_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/cardViewSettings";
    }
    public IOSSettingsPageObject(AppiumDriver driver){
        super(driver);
    }


}
