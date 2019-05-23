package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class SettingsButtonPageObject extends MainPageObject {

    public static String
SETTING_CLASS_ID_INIT_ELEMENT;

    public SettingsButtonPageObject(AppiumDriver driver){
        super(driver);
    }

    public void waitSettingsBtnPresent() {
        this.waitForElementPresent(
                By.xpath( SETTING_CLASS_ID_INIT_ELEMENT),
                "Cannot find Settings btn",
                3,
                "Settings btn found");
    }

    public void initSettingsBtnClickAction() {
        this.waitForElementAndClick(
                By.id( SETTING_CLASS_ID_INIT_ELEMENT),
                "Cannot click Settings btn",
                5,
                "Settings btn clicked");
    }
}
