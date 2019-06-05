package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


abstract  public class SearchMainPageObject extends MainPageObject {
    public static String
            START_YOUR_FIRST_SEARCH_ID,
            ADDRESS_FIELD_TPL,
            ADDRESS_FIELD_ID,
            ADDRES_FIELD_XPATH,
            TYPE_OF_CARE_FIELD_ID,
            TYPE_OF_CARE_FIELD_XPATH,
            NEED_FIELD_ID,
            NEED_FIELD_XPATH,
            SORTING_BTN_ID,
            SORTING_BTN_XPATH,
            MORE_FILTERS_BTN_ID,
            MORE_FILTERS_BTN_XPATH,

            START_YOUR_FIRST_SEARCH_BUTTON_NAME = "Start your first search",
            SCREEN_NAME = "Search Main screen",
            ADDRESS_FIELD = "Address field",
            TYPE_OF_CARE_FIELD = "Type of care",
            NEED_FIELD = "Need",
            SORTING_BTN = "Sorting btn",
            MORE_FILTERS_BTN = "More filters btn";

    private static String getAddressByTitle(String address_string_search) {
        return ADDRESS_FIELD_TPL.replace("{ADDRESS_SEARCH}", address_string_search);
    }

    public SearchMainPageObject(AppiumDriver driver){
        super(driver);
    }

    public void waitForStartFirstSearchBtn() {
        this.waitForElementPresent(
                By.id(START_YOUR_FIRST_SEARCH_ID),
                "Cannot find "+ START_YOUR_FIRST_SEARCH_ID +" on " + SCREEN_NAME,
                4,
                START_YOUR_FIRST_SEARCH_BUTTON_NAME + " btn found");

    }
        public void initStartSearchBtnClickAction() {
        this.waitForElementAndClick(
                By.id(START_YOUR_FIRST_SEARCH_ID),
                "Cannot click "+ START_YOUR_FIRST_SEARCH_ID +" on " + SCREEN_NAME,
                4,
                START_YOUR_FIRST_SEARCH_BUTTON_NAME + " btn clicked");
    }

    public void waitForAddressFieldPresent(String address_string) {

        String address_xpath = getAddressByTitle(address_string);

        this.waitForElementPresent(
                By.xpath(address_xpath),
                "Cannot find " + ADDRESS_FIELD + " on " + SCREEN_NAME,
                4,
                ADDRESS_FIELD + " btn found");
        System.out.println(address_xpath);
    }
        public void waitForTypeOfCareFieldPresent() {
            this.waitForElementPresent(
                    By.xpath(TYPE_OF_CARE_FIELD_XPATH),
                    "Cannot find " + TYPE_OF_CARE_FIELD + " on " + SCREEN_NAME,
                    4,
                    TYPE_OF_CARE_FIELD + " btn found");
        }
    public void initTypeOfCareFieldClick() {
        this.waitForElementAndClick(
                By.xpath(TYPE_OF_CARE_FIELD_XPATH),
                "Cannot click " + TYPE_OF_CARE_FIELD + " on " + SCREEN_NAME,
                4,
                TYPE_OF_CARE_FIELD + " btn clicked");
    }
     public void waitForNeedFieldPresent() {
                this.waitForElementPresent(
                        By.xpath(NEED_FIELD_XPATH),
                        "Cannot find " + NEED_FIELD + " on " + SCREEN_NAME,
                        4,
                        NEED_FIELD + " btn found");
            }
    public void waitForSortingBtnPresent() {
                this.waitForElementPresent(
                     By.id(SORTING_BTN_ID),
                    "Cannot find " + SORTING_BTN + " on " + SCREEN_NAME,
                    4,
                    SORTING_BTN + " btn found");
                }
    public void waitForAddFiltersBtnPresent() {
        this.waitForElementPresent(
                By.id(MORE_FILTERS_BTN_ID),
                "Cannot find " + MORE_FILTERS_BTN + " on " + SCREEN_NAME,
                4,
                MORE_FILTERS_BTN + " btn found");
    }
}