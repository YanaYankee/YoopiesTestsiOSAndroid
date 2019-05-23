package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.NextBtnPageObject;

public class AndroidNextBtnPageObject  extends NextBtnPageObject

{
    static {
        NEXT_BUTTON_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/nextButton";

    }
    public AndroidNextBtnPageObject(AppiumDriver driver){
        super(driver);
    }


}

