        package ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

        abstract  public class SettingsPageObject extends MainPageObject {
            public static String
                    NAME_FIELD_ELEMENT,
                    ADDRESS_FIELD_ELEMENT,
                    SIMULATION_ICON,
                    HELP_BUTTON_FIND_ELEMENT,
                    SETTING_PAYMENT_ID_INIT_ELEMENT,
                    SETTINGS_ARROW,
                    HELP,
                    SETTING_BUTTON_ID_INIT_ELEMENT;

            public SettingsPageObject(AppiumDriver driver){
                super(driver);
            }
            public void swipeUpShit() {
                swipeUpToElement(By.id(SETTING_BUTTON_ID_INIT_ELEMENT),"shit",1,"shit");
            }

            public void initPaymentBtnClickAction() {
                this.waitForElementAndClick(
                        By.id(SETTING_PAYMENT_ID_INIT_ELEMENT),
                        "Cannot find Name Field on Settings screen",
                        4,
                        "Settings btn clicked");
            }
            public void waitForNameFieldPresent() {
                this.waitForElementPresent(
                        By.id(NAME_FIELD_ELEMENT),
                        "Cannot find Name field  on Settings screen",
                        7,
                        "Help btn id found");
            }
            public void waitForAddressFieldPresent() {
                this.waitForElementPresent(
                        By.id(ADDRESS_FIELD_ELEMENT),
                        "Cannot find Address field  on Settings screen",
                        3,
                        "Help btn id found");
            }
            public void waitForSimulationIconPresent() {
                this.waitForElementPresent(
                        By.id(SIMULATION_ICON),
                        "Cannot find Simulation icon on Settings screen",
                        3,
                        "Help btn id found");
            }


            public void waitForHelpBtnPresent() {
                this.waitForElementPresent(
                        By.id(HELP_BUTTON_FIND_ELEMENT),
                        "Cannot find Help btn arrow",
                        7,
                        "Help btn id found");
            }

            public void help() {
                this.waitForElementAndClick(
                        By.id(HELP_BUTTON_FIND_ELEMENT),
                        "Cannot find Help btn arrow",
                        7,
                        "Help btn HELP found");
            }

            public void waitSettingsBtnPresent() {
                this.waitForElementPresent(
                        By.xpath(SETTING_BUTTON_ID_INIT_ELEMENT),
                        "Cannot find Settings btn",
                        5,
                        "Settings btn found");
            }

            public void initSettingsBtnClickAction() {
                this.waitForElementAndClick(
                        By.id(SETTING_BUTTON_ID_INIT_ELEMENT),
                        "Cannot click Settings btn",
                        12,
                        "Settings btn clicked");
            }
            public void initSettingsArrowClickAction() {
                this.waitForElementAndClick(
                        By.id( SETTINGS_ARROW),
                        "Cannot click Settings btn",
                        5,
                        "Settings btn clicked");
            }


        }