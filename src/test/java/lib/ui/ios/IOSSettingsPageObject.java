package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SettingsPageObject;

public class IOSSettingsPageObject extends SettingsPageObject

{
    static {

       // ++++++++++++++++++++ EDIT FOR IOS++++++++++++++++++++++++++
        NAME_FIELD_ELEMENT = "com.yoopies.babysittingandroid.beta:id/name";//CHANGE TO XPATH
        ADDRESS_FIELD_ELEMENT = "com.yoopies.babysittingandroid.beta:id/postalAddressInput"; //CHANGE TO XPATH
        SIMULATION_ICON = "My situation";
        HELP_BUTTON_FIND_ELEMENT = "Help";
        SETTING_PAYMENT_ID_INIT_ELEMENT = "Payment method";
        HELP = "//XCUIElementTypeStaticText[@name='Help']";
        SETTING_BUTTON_ID_INIT_ELEMENT = "Settings";
        SETTINGS_ARROW = "com.yoopies.babysittingandroid.beta:id/logOutArrow"; // NO SUCH ELEMENT IN IOS
    }
    public IOSSettingsPageObject(AppiumDriver driver){
        super(driver);
    }


}
