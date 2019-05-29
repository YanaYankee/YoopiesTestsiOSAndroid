package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.BottomMenuPageObject;
import lib.ui.android.AndroidBottomMenuPageObject;
import lib.ui.ios.IOSBottomMenuPageObject;

public class BottomMenuPageObjectFactory {
    public static BottomMenuPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidBottomMenuPageObject(driver);
        } else {
            return new IOSBottomMenuPageObject(driver);
        }
    }
}
