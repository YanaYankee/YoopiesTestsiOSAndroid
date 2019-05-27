package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.BottomMenuPageObject;


    public class IOSBottomMenuPageObject  extends BottomMenuPageObject {
        static {
            MORE_INIT_ELEMENT = "//XCUIElementTypeOther[5]";
            //"/XCUIElementTypeApplication[@name='BabySitting Yoopies']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/
        }
        public IOSBottomMenuPageObject(AppiumDriver driver){
            super(driver);
        }
    }
