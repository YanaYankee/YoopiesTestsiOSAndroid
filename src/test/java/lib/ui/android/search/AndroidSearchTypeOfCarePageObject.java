package lib.ui.android.search;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchTypeOfCarePageObject;

public class AndroidSearchTypeOfCarePageObject extends SearchTypeOfCarePageObject

{
    static {
        CLASSIC_TYPE_OF_CARE_ID = "com.yoopies.babysittingandroid.beta:id/classicTitle";
        INSTANT_TYPE_OF_CARE_ID = "com.yoopies.babysittingandroid.beta:id/instantTitle";
    }
    public AndroidSearchTypeOfCarePageObject(AppiumDriver driver){
        super(driver);
    }


}