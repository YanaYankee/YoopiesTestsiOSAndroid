package lib.ui.ios.start;

import io.appium.java_client.AppiumDriver;
import lib.ui.DashboardPageObject;

public class IOSDashboardPageObject  extends DashboardPageObject

    {
        static {
        HELLO_ELEMENT_ID = "Hello Brienne!"; // ADD TEMPLATE LATER
        START_YOUR_FIRST_SEARCH_BUTTON_ID = "Start your first search";
    }
    public IOSDashboardPageObject (AppiumDriver driver){
        super(driver);
    }


    }