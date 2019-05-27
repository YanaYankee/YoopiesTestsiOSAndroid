package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.DashboardPageObject;

public class AndroidDashboardPageObject  extends DashboardPageObject

{
    static {
        HELLO_ELEMENT_ID = "com.yoopies.babysittingandroid.beta:id/nameTextView";
    }
    public AndroidDashboardPageObject (AppiumDriver driver){
        super(driver);
    }


}