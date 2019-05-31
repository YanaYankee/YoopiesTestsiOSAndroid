package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


abstract  public class SearchTypeOfCarePageObject extends MainPageObject {
    public static String
            CLASSIC_TYPE_OF_CARE_ID,
            INSTANT_TYPE_OF_CARE_ID,

            CLASSIC_TYPE_OF_CARE = "Classic btn",
            INSTANT_TYPE_OF_CARE = "Instant btn",
            SCREEN_NAME = "Choose Type Of Care Screen";



    public SearchTypeOfCarePageObject(AppiumDriver driver){
        super(driver);
    }


        public void initClassicTypeOfCareScreen() {
        this.waitForElementAndClick(
                By.id(CLASSIC_TYPE_OF_CARE_ID),
                "Cannot find "+ CLASSIC_TYPE_OF_CARE +" on " + SCREEN_NAME,
                4,
                CLASSIC_TYPE_OF_CARE + " btn clicked");

    }


        public void initInstantTypeOfCareScreen() {
            this.waitForElementPresent(
                    By.xpath(INSTANT_TYPE_OF_CARE_ID),
                    "Cannot find " + INSTANT_TYPE_OF_CARE + " on " + SCREEN_NAME,
                    4,
                    INSTANT_TYPE_OF_CARE + " btn found");
        }

}