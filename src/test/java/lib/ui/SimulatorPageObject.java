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
                    MY_SITUATION_OK_XPATH,
                    ONE_CHILD_IN_RELATIONSHIP_INCOME_XPATH,
                    TWO_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH,
                    THREE_CHILDREN_IN_RELATIONSHIP_INCOME_XPATH,
                    ONE_CHILD_SINGLE_INCOME_XPATH,
                    TWO_CHILDREN_SINGLE_INCOME_XPATH,
                    THREE_CHILDREN_SINGLE_INCOME_XPATH,
            INIT_ACCEPT_BTN_BY_ID,

                    BTN_0_3_YEARS ="Between 0 to 3 years section",
                    BTN_3_6_YEARS ="Between 3 to 6 years old section",
                    BTN_MORE_THAN_6_YEARS ="More than 6 years old section",
                    SINGLE_PARENT = "Single parent",
                    IN_RELATIONSHIP = "In a relationship",
                            MY_SITUATION_OK = "OK on Configure your Situation Popup",
            INCOME_VALUE = "My Income value",
            ACCEPT_BTN = "Accept btn"
            ;

            public SimulatorPageObject(AppiumDriver driver){
                super(driver);
            }

            public void initConfigureMySituationPopUp() {
                this.waitForElementAndClick(
                        By.xpath(MY_SITUATION_OK_XPATH),
                        "Cannot find and click" + MY_SITUATION_OK + "on Simulator screen",
                        4,
                         MY_SITUATION_OK + "was found and clicked");
            }

            public void initAddChildren03Years() {
                this.waitForElementAndClick(
                        By.xpath(PLUS_BTN_0_3_YEARS_XPATH),
                        "Cannot find" + BTN_0_3_YEARS + "on Simulator screen",
                        4,
                        "One child added to " + BTN_0_3_YEARS);
            }
            public void initAddChildren36Years() {
                this.waitForElementPresent(
                        By.xpath(PLUS_BTN_3_6_YEARS_XPATH),
                        "Cannot find" + BTN_3_6_YEARS + "on Simulator screen",
                        12,
                        "One child added to " + BTN_3_6_YEARS);
                this.waitForElementAndClick(
                        By.xpath(PLUS_BTN_3_6_YEARS_XPATH),
                        "Cannot find" + BTN_3_6_YEARS + "on Simulator screen",
                        4,
                        "One child added to " + BTN_3_6_YEARS);
            }
            public void initAddChildrenMoreThan6Years() {
                this.waitForElementAndClick(
                        By.xpath(PLUS_BTN_MORE_THAN_6_YEARS_XPATH),
                        "Cannot find" + BTN_MORE_THAN_6_YEARS + "on Simulator screen",
                        4,
                        "One child added to " + BTN_MORE_THAN_6_YEARS);
            }
            public void selectSingleParent() {
                this.waitForElementAndClick(
                        By.xpath(SINGLE_PARENT_BTN_XPATH),
                        "Cannot find" + SINGLE_PARENT + "on Simulator screen",
                        4,
                        SINGLE_PARENT + " option was selected");
            }
            public void selectInRelationship() {
                this.waitForElementAndClick(
                        By.xpath(IN_RELATIONSHIP_BTN_XPATH),
                        "Cannot find" + IN_RELATIONSHIP + "on Simulator screen",
                        4,
                        IN_RELATIONSHIP + " option was selected");
            }
            public void selectMyIncome1ChildInRel() {
                this.waitForElementPresent(
                        By.xpath(ONE_CHILD_IN_RELATIONSHIP_INCOME_XPATH),
                        "Cannot find " + INCOME_VALUE + " on Simulator screen",
                        4,
                        INCOME_VALUE + " option was found");
                this.waitForElementAndClick(
                        By.xpath(ONE_CHILD_IN_RELATIONSHIP_INCOME_XPATH),
                        "Cannot click " + INCOME_VALUE + " on Simulator screen",
                        4,
                        INCOME_VALUE + " option was selected");
            }
            public void initAcceptBtn() {
                this.waitForElementAndClick(
                        By.id(INIT_ACCEPT_BTN_BY_ID),
                        "Cannot find" + ACCEPT_BTN + "on Simulator screen",
                        4,
                        ACCEPT_BTN + " was clicked");
            }


        }