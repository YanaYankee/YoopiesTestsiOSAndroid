package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.NextBtnPageObject;

public class IOSNextBtnPageObject  extends NextBtnPageObject

{
    static {
        //_______________________IOS CHANGE______________________________

        NEXT_BUTTON_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/nextButton";

    }
    public IOSNextBtnPageObject(AppiumDriver driver){
        super(driver);
    }


}