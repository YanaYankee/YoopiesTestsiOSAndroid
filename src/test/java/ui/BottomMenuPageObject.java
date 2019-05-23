        package ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

    abstract public class BottomMenuPageObject extends MainPageObject {
            protected static  String
            MORE_INIT_ELEMENT ;

    public BottomMenuPageObject(AppiumDriver driver){
        super(driver);
    }

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
