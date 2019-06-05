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
        MY_SITUATION_OK_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/positiveButton'][@text='OK']";
        ONE_CHILD_IN_RELATIONSHIP_INCOME_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/incomeRowContainer']//*[@text='Less than €20.8K']";
                TWO_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/incomeRowContainer']//*[@text='Between €23.7K and €52.7K']";
                THREE_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH = "";
                ONE_CHILD_SINGLE_INCOME_XPATH = "";
                TWO_CHILDREN_SINGLE_INCOME_XPATH = "";
                THREE_CHILDREN_SINGLE_INCOME_XPATH  = "";
        INIT_ACCEPT_BTN_BY_ID="com.yoopies.babysittingandroid.beta:id/btnValid";


    }
    public AndroidSimulatorPageObject(AppiumDriver driver){
        super(driver);
    }


}