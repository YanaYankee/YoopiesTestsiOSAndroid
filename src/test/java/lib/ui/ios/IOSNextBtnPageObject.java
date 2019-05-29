package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.NextBtnPageObject;

public class IOSNextBtnPageObject  extends NextBtnPageObject

{
    static {
        //_______________________IOS CHANGE______________________________

        NEXT_BUTTON_INIT_ELEMENT = "Next";

    }
    public IOSNextBtnPageObject(AppiumDriver driver){
        super(driver);
    }


}