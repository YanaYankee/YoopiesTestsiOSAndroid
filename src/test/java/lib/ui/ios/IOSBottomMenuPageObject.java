package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.BottomMenuPageObject;


    public class IOSBottomMenuPageObject  extends BottomMenuPageObject {
        static {
            DASHBOARD_INIT_ELEMENT = "//XCUIElementTypeTabBar/XCUIElementTypeOther[1]";
            SEARCH_INIT_ELEMENT = "//XCUIElementTypeTabBar/XCUIElementTypeOther[2]";
            MY_CARERS_INIT_ELEMENT ="//XCUIElementTypeTabBar/XCUIElementTypeOther[3]";
            INBOX_INIT_ELEMENT ="//XCUIElementTypeTabBar/XCUIElementTypeOther[4]";
            MORE_INIT_ELEMENT = "//XCUIElementTypeTabBar/XCUIElementTypeOther[5]";

          //  MORE_INIT_ELEMENT = "//XCUIElementTypeApplication[@name='BabySitting Yoopies']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeOther[5]";
        }
        public IOSBottomMenuPageObject(AppiumDriver driver){
            super(driver);
        }
    }
