package lib.ui.ios.search;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchTypeOfCarePageObject;

public class IOSSearchTypeOfCarePageObject extends SearchTypeOfCarePageObject

{
    static {
        CLASSIC_TYPE_OF_CARE_ID = "Classic";
        INSTANT_TYPE_OF_CARE_ID = "Instant";

    }
    public IOSSearchTypeOfCarePageObject(AppiumDriver driver){
        super(driver);
    }


}
