        package lib.ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

        abstract  public class SimulatorPageObject extends MainPageObject {
            public static String
                    PLUS_BTN_0_3_YEARS_XPATH,
                    PLUS_BTN_3_6_YEARS_XPATH,
                    PLUS_BTN_MORE_THAN_6_YEARS_XPATH,
                    SINGLE_PARENT_BTN_XPATH,
                    IN_RELATIONSHIP_BTN_XPATH,


                    BTN_0_3_YEARS ="Between 0 to 3 years section",
                    BTN_3_6_YEARS ="Between 3 to 6 years old section",
                    BTN_MORE_THAN_6_YEARS ="More than 6 years old section",
                    SINGLE_PARENT = "Single parent",
                    IN_RELATIONSHIP = "In a relationship"
            ;

            public SimulatorPageObject(AppiumDriver driver){
                super(driver);
            }

            public void initAddChildren03Years() {
                this.waitForElementAndClick(
                        By.id(PLUS_BTN_0_3_YEARS_XPATH),
                        "Cannot find Name Field on Settings screen",
                        4,
                        "One child added to "+ BTN_0_3_YEARS);
            }
            public void initAddChildren36Years() {
                this.waitForElementAndClick(
                        By.id(PLUS_BTN_3_6_YEARS_XPATH),
                        "Cannot find Name Field on Settings screen",
                        4,
                        "One child added to "+ BTN_3_6_YEARS);
            }
            public void initAddChildrenMoreThan6Years() {
                this.waitForElementAndClick(
                        By.id(PLUS_BTN_MORE_THAN_6_YEARS_XPATH),
                        "Cannot find Name Field on Settings screen",
                        4,
                        "One child added to "+ BTN_MORE_THAN_6_YEARS);
            }
            public void selectSingleParent() {
                this.waitForElementAndClick(
                        By.id(SINGLE_PARENT_BTN_XPATH),
                        "Cannot find Name Field on Settings screen",
                        4,
                        SINGLE_PARENT + " option was selected");
            }
            public void selectInRelationship() {
                this.waitForElementAndClick(
                        By.id(IN_RELATIONSHIP_BTN_XPATH),
                        "Cannot find Name Field on Settings screen",
                        4,
                        IN_RELATIONSHIP + " option was selected");
            }


        }