package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.BottomMenuPageObject;

public class AndroidBottomMenuPageObject extends BottomMenuPageObject {
    static {
        MORE_INIT_ELEMENT = "//*[contains(@text, 'More')]";//"//*[contains(@text, '44 Rue Ordener')]",
    }
    public AndroidBottomMenuPageObject(AppiumDriver driver){
        super(driver);
    }
}
