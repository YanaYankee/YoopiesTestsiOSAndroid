        package ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

    abstract public class BottomMenuPageObject extends MainPageObject {
            protected static  String
                    DASHBOARD_INIT_ELEMENT,
                    SEARCH_INIT_ELEMENT,
                    MY_CARERS_INIT_ELEMENT,
                    INBOX_INIT_ELEMENT,
                    MORE_INIT_ELEMENT;

    public BottomMenuPageObject(AppiumDriver driver){
        super(driver);
    }

        //************************************* DashBoard BTN ********************************
        public void waitDashBoardBtnPresent() {
            this.waitForElementPresent(
                    By.xpath( DASHBOARD_INIT_ELEMENT),
                    "Cannot find DashBoard btn",
                    7,
                    "DashBoard btn found");
        }

        public void initDashBoardBtnClickAction() {
            this.waitForElementAndClick(
                    By.xpath( DASHBOARD_INIT_ELEMENT),
                    "Cannot click DashBoard btn",
                    1,
                    "DashBoard btn clicked");
        }
        //************************************* Search BTN ********************************
        public void waitSearchBtnPresent() {
            this.waitForElementPresent(
                    By.xpath( SEARCH_INIT_ELEMENT),
                    "Cannot find Search btn",
                    7,
                    "Search btn found");
        }

        public void initSearchBtnClickAction() {
            this.waitForElementAndClick(
                    By.xpath( SEARCH_INIT_ELEMENT),
                    "Cannot click Search btn",
                    1,
                    "Search btn clicked");
        }

//************************************* CARER BTN ********************************
        public void waitCarerBtnPresent() {
            this.waitForElementPresent(
                    By.xpath( MY_CARERS_INIT_ELEMENT),
                    "Cannot find My Carers btn",
                    7,
                    "My Carers btn found");
        }

        public void initCarerBtnClickAction() {
            this.waitForElementAndClick(
                    By.xpath( MY_CARERS_INIT_ELEMENT),
                    "Cannot click My Carers btn",
                    1,
                    "My Carers btn clicked");
        }

//************************************* INBOX BTN ********************************
        public void waitInboxBtnPresent() {
            this.waitForElementPresent(
                    By.xpath( INBOX_INIT_ELEMENT),
                    "Cannot find Inbox btn",
                    7,
                    "Inbox btn found");
        }

        public void initInboxBtnClickAction() {
            this.waitForElementAndClick(
                    By.xpath( INBOX_INIT_ELEMENT),
                    "Cannot click Inbox btn",
                    1,
                    "Inbox btn clicked");
        }

//************************************* MORE BTN ********************************
    public void waitMoreBtnPresent() {
        this.waitForElementPresent(
                By.xpath( MORE_INIT_ELEMENT),
                "Cannot find More btn",
                7,
                "More btn found");
    }

    public void initMoreBtnClickAction() {
        this.waitForElementAndClick(
                By.xpath( MORE_INIT_ELEMENT),
                "Cannot click More btn",
                1,
                "More btn clicked");
    }

}
