package lib.ui.android.start;

import io.appium.java_client.AppiumDriver;
import lib.ui.DashboardPageObject;

public class AndroidDashboardPageObject  extends DashboardPageObject

{
    static {
        HELLO_ELEMENT_ID = "com.yoopies.babysittingandroid.beta:id/nameTextView";
        START_YOUR_FIRST_SEARCH_BUTTON_ID = "com.yoopies.babysittingandroid.beta:id/searchButton";
    }
    public AndroidDashboardPageObject (AppiumDriver driver){
        super(driver);
    }


}