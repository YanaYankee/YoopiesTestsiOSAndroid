package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchMainPageObject;

public class AndroidSearchMainPageObject extends SearchMainPageObject

{
    static {
        START_YOUR_FIRST_SEARCH_ID = "com.yoopies.babysittingandroid.beta:id/searchButton";
        START_YOUR_FIRST_SEARCH_BUTTON_NAME = "Start your first search";
        SCREEN_NAME = "Search Main";
    }
    public AndroidSearchMainPageObject(AppiumDriver driver){
        super(driver);
    }


}