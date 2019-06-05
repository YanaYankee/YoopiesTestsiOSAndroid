package lib.ui.ios.search;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchMainPageObject;

public class IOSSearchMainPageObject extends SearchMainPageObject

{
    static {
        START_YOUR_FIRST_SEARCH_ID = "Start your first search";

        ADDRESS_FIELD_TPL = "//XCUIElementTypeTextField[1][@value='{ADDRESS_SEARCH}']";
        TYPE_OF_CARE_FIELD_XPATH = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]";
        NEED_FIELD_XPATH = "//XCUIElementTypeTextField[3][@value='Need']";
        SORTING_BTN_ID = "sorting";
        MORE_FILTERS_BTN_ID = "Add filters";

    }
    public IOSSearchMainPageObject(AppiumDriver driver){
        super(driver);
    }


}
