package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchMainPageObject;

public class IOSSearchMainPageObject extends SearchMainPageObject

{
    static {
        START_YOUR_FIRST_SEARCH_ID = "Start your first search";
        START_YOUR_FIRST_SEARCH_BUTTON_NAME = "Start your first search";
        SCREEN_NAME = "Search Main";

    }
    public IOSSearchMainPageObject(AppiumDriver driver){
        super(driver);
    }


}
