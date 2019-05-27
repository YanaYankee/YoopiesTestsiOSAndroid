package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.DashboardPageObject;

public class IOSDashboardPageObject  extends DashboardPageObject

    {
        static {
        HELLO_ELEMENT_ID = "Hello Brienne!"; // ADD TEMPLATE LATER
    }
    public IOSDashboardPageObject (AppiumDriver driver){
        super(driver);
    }


    }