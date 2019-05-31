package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SimulatorPageObject;

public class IOSSimulatorPageObject extends SimulatorPageObject

{
    static {

                PLUS_BTN_0_3_YEARS_XPATH = "(//XCUIElementTypeButton[@name='+'])[1]";
                PLUS_BTN_3_6_YEARS_XPATH = "(//XCUIElementTypeButton[@name='+'])[2]";
                PLUS_BTN_MORE_THAN_6_YEARS_XPATH = "(//XCUIElementTypeButton[@name='+'])[3]";
                SINGLE_PARENT_BTN_XPATH = "//XCUIElementTypeStaticText[@name='Single parent']";
                IN_RELATIONSHIP_BTN_XPATH = "//XCUIElementTypeStaticText[@name='In a relationship']";
    }
    public IOSSimulatorPageObject(AppiumDriver driver){
        super(driver);
    }


}
