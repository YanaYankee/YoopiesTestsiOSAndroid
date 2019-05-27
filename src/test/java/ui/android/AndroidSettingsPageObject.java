package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.SettingsPageObject;

public class AndroidSettingsPageObject extends SettingsPageObject

{
    static {
        NAME_FIELD_ELEMENT = "com.yoopies.babysittingandroid.beta:id/name";
        ADDRESS_FIELD_ELEMENT = "com.yoopies.babysittingandroid.beta:id/postalAddressInput";
                SIMULATION_ICON = "com.yoopies.babysittingandroid.beta:id/simulationIcon";
        HELP_BUTTON_FIND_ELEMENT = "com.yoopies.babysittingandroid.beta:id/help";
        SETTINGS_ARROW = "com.yoopies.babysittingandroid.beta:id/logOutArrow";
        SETTING_PAYMENT_ID_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/payment";
        HELP = "//*[contains(@text, 'Help')]";
        SETTING_BUTTON_ID_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/cardViewSettings";
    }
    public AndroidSettingsPageObject(AppiumDriver driver){
        super(driver);
    }


}