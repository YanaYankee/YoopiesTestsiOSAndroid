package lib.ui.android.search;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchMainPageObject;

public class AndroidSearchMainPageObject extends SearchMainPageObject

{
    static {
        START_YOUR_FIRST_SEARCH_ID = "com.yoopies.babysittingandroid.beta:id/searchButton";
        ADDRESS_FIELD_TPL = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/address'][@text='{ADDRESS_SEARCH}']";
        TYPE_OF_CARE_FIELD_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/guardType'][@text='Type of care']";
        NEED_FIELD_XPATH = "//*[@resource-id='com.yoopies.babysittingandroid.beta:id/need'][@text='Need']";
        SORTING_BTN_ID = "com.yoopies.babysittingandroid.beta:id/order";
        MORE_FILTERS_BTN_ID = "com.yoopies.babysittingandroid.beta:id/more";
    }
    public AndroidSearchMainPageObject(AppiumDriver driver){
        super(driver);
    }


}