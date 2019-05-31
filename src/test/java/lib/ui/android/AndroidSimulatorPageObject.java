package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.SimulatorPageObject;

public class AndroidSimulatorPageObject extends SimulatorPageObject

{
    static {
        PLUS_BTN_0_3_YEARS_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/childRow1']//*[@resource-id='com.yoopies.babysittingandroid.beta:id/addIcon']";
        PLUS_BTN_3_6_YEARS_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/childRow2']//*[@resource-id='com.yoopies.babysittingandroid.beta:id/addIcon']";
        PLUS_BTN_MORE_THAN_6_YEARS_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/childRow3']//*[@resource-id='com.yoopies.babysittingandroid.beta:id/addIcon']";
        SINGLE_PARENT_BTN_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/title'][@text='Single parent']";
        IN_RELATIONSHIP_BTN_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/title'][@text='In a relationship']";
    }
    public AndroidSimulatorPageObject(AppiumDriver driver){
        super(driver);
    }


}