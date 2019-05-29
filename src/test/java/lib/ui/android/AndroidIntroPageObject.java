package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.IntroPageObject;

public class AndroidIntroPageObject extends IntroPageObject {
    static {
    SKIP_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/skip";
        ALLOW_NOTIFICATIONS_INIT_ELEMENT = "";
                INTRO_NEXT_BUTTON_ID = "com.yoopies.babysittingandroid.beta:id/button";
                INTRO_FIRST_SLIDE_TITLE_ID = "com.yoopies.babysittingandroid.beta:id/title";
                INTRO_SECOND_SLIDE_TITLE_ID = "com.yoopies.babysittingandroid.beta:id/title";
                INTRO_THIRD_SLIDE_TITLE_ID ="com.yoopies.babysittingandroid.beta:id/title";
                INTRO_LETS_GO_BUTTON_ID = "com.yoopies.babysittingandroid.beta:id/button";
}
    public AndroidIntroPageObject(AppiumDriver driver){
        super(driver);
    }


}
