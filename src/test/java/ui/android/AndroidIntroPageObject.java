package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.IntroPageObject;

public class AndroidIntroPageObject extends IntroPageObject {
    static {
    SKIP_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/skip";
        ALLOW_NOTIFICATIONS_INIT_ELEMENT = "";
}
    public AndroidIntroPageObject(AppiumDriver driver){
        super(driver);
    }


}
