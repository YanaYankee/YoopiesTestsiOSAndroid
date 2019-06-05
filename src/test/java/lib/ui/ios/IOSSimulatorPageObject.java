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

                ONE_CHILD_IN_RELATIONSHIP_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='More than €46123']";
                TWO_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='Between 23701€ and 52670€']";
                THREE_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='More than 59217€']";

                ONE_CHILD_SINGLE_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='Between 29056€ and 64572€']";
                TWO_CHILDREN_SINGLE_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='Less than 33181€']";
                THREE_CHILDREN_SINGLE_INCOME_XPATH = "//XCUIElementTypeStaticText[@name='More than 82903€']";

                INIT_ACCEPT_BTN_BY_ID = "Accept";
    }
    public IOSSimulatorPageObject(AppiumDriver driver){
        super(driver);
    }
}
