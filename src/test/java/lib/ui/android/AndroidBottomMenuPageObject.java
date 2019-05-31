package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.BottomMenuPageObject;

public class AndroidBottomMenuPageObject extends BottomMenuPageObject {
    static {
        DASHBOARD_INIT_ELEMENT = "//*[contains(@text, 'Dashboard')]";
        SEARCH_INIT_ELEMENT = "//*[contains(@text, 'Search')]";
        MY_CARERS_INIT_ELEMENT = "//*[contains(@text, 'My carers')]";
        INBOX_INIT_ELEMENT = "//*[contains(@text, 'Inbox')]";
        MORE_INIT_ELEMENT = "//*[contains(@text, 'More')]";//"//*[contains(@text, '44 Rue Ordener')]",
    }
    public AndroidBottomMenuPageObject(AppiumDriver driver){
        super(driver);
    }
}
