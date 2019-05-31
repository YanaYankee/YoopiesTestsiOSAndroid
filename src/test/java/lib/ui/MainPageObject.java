package lib.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class MainPageObject {
    protected static AppiumDriver driver;

    //constructor for all tests
    public MainPageObject(AppiumDriver driver) {
        this.driver = driver;
    }

    public int getAmountOfElements(By by) {
        List elements = driver.findElements(by);
        return elements.size();
    }
    public void assertElementPresent(By by, String error_message){
        int amount_of_elements = getAmountOfElements(by);
        if (amount_of_elements < 1 ) {
            String default_message = "An element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        } else if (amount_of_elements > 1 ) {
            String default_message = "Not more than one element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        }
    }

    public void assertElementNotPresent(By by, String error_message){
        int amount_of_elements = getAmountOfElements(by);
        if (amount_of_elements > 0 ) {
            String default_message = "An element '" + by.toString() + "' supposed to be not present";
            throw new AssertionError(default_message + " " + error_message);
        }
    }

    public WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds,String found )
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");

            System.out.println(found);

        return  wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
    public WebElement waitForElementAndClear(By by, String error_message, long timeoutInSeconds, String found )
    {
        WebElement element = waitForElementPresent( by,  error_message, timeoutInSeconds, found );

        element.clear();
        return element;
    }
    public WebElement waitForElementAndClearAndSendKeys(By by, String value, String error_message, long timeoutInSeconds, String found )
    {
        WebElement element = waitForElementPresent( by,  error_message, timeoutInSeconds, found );

        element.clear();
        element.sendKeys(value);
        return element;

    }

    public WebElement waitForElementClickable(By by, String error_message, long timeoutInSeconds,String found )
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");

        return  wait.until(
                ExpectedConditions.elementToBeClickable(by)
        );
    }


    public WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds,String found)
    {
        WebElement element = waitForElementPresent( by,  error_message,  timeoutInSeconds, found);
        int amount_of_elements = getAmountOfElements(by);
        if (amount_of_elements < 1 ) {
            String default_message = "An element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        } else if (amount_of_elements > 1 ) {
            String default_message = "Not more than one element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        } else {
            System.out.println(found);
        }


        element.click();
        return element;
    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds,String found)
    {
        WebElement element = waitForElementPresent( by,  error_message, timeoutInSeconds, found);

        int amount_of_elements = getAmountOfElements(by);
        if (amount_of_elements < 1 ) {
            String default_message = "An element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        } else if (amount_of_elements > 1 ) {
            String default_message = "Not more than one element '" + by.toString() + "' supposed to be present";
            throw new AssertionError(default_message + " " + error_message);
        } else {
            System.out.println(found);
        }

        element.sendKeys(value);
        return element;
    }



//************************SWIPES******************************
public static void swipeUp(int timeOfSwipeInSecs) {
   TouchAction action = new TouchAction(driver);
 //   TouchAction action = new TouchAction(driver);
    Dimension size = driver.manage().window().getSize();

    int x = size.width / 2;
    int y_start = (int) (size.height * 0.8);
    int y_end = (int) (size.height * 0.2);

    action
            .press(PointOption.point(x, y_start))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeOfSwipeInSecs)))
            .moveTo(PointOption.point(x, y_end))
            .release()
            .perform();
}


    public void swipeUpQuick() {
        swipeUp(2000);
    }


    public void swipeUpToElement(By by, String error_message, int max_swipes, String found){
//        driver.findElements(by);
//        driver.findElements(by).size();
        int already_swiped = 0;

        while(driver.findElements(by).size() == 0) {

            if (already_swiped > max_swipes) {
                waitForElementPresent(by, "Cannot find element by swiping. \n" + error_message, 3, found);
                return;
            }
            swipeUpQuick();
            ++already_swiped;
        }
    }

//    *************************** Swipe on KeyBoard Opened *************************************

    public void swipeUpOnKeyBoardOpened(int timeOfSwipe) {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;
        int y_start = (int) (size.height * 0.3);
        int y_end = (int) (size.height * 0.1);


        action
                .press(PointOption.point(x, y_start))
                .moveTo(PointOption.point(x, y_end))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(timeOfSwipe)))
                .release()
                .perform();
    }

    public void swipeUpQuickOnKeyBoardOpened() {
        swipeUpOnKeyBoardOpened(200);
    }

    public void swipeUpToElementOnKeyBoardOpened(By by, String error_message, int max_swipes, String found){
//        driver.findElements(by);
//        driver.findElements(by).size();
        int already_swiped = 0;

        while(driver.findElements(by).size() == 0) {

            if (already_swiped > max_swipes) {
                waitForElementPresent(by, "Cannot find element by swiping. \n" + error_message, 3, found);
                return;
            }
            swipeUpQuickOnKeyBoardOpened();
            ++already_swiped;
        }
    }

//    ****************************************** Left Swipe *************************************

    public static void swipeElementToLeft(int timeOfSwipeInSecs){
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();

        int right_x =  (int) (size.width * 0.9);
        int left_x =  (int) (size.width * 0.1);
        int middle_y = size.height / 2;

//        action
//                .press(PointOption.point(right_x, middle_y))
//                .moveTo(PointOption.point(left_x,middle_y))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
//                .release()
//                .perform();

//        action.press(new PointOption()
//                .withCoordinates(right_x,middle_y))
//                .waitAction().moveTo(new PointOption()
//                .withCoordinates(left_x,middle_y))
//                .release()
//                .perform();


        action
                .press(PointOption.point(right_x,middle_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeOfSwipeInSecs)))
                .moveTo(PointOption.point(left_x,middle_y))
                .release()
                .perform();

    }


    public int generateRandomForRegisterData(int number) {
        Random rand = new Random();
        int value = rand.nextInt(number);
        return  value;
    }



    public WebElement findElementByName(String str){

        // return driver.findElementByXPath("//*[contains(@text, '"+ str +"')]"); //attention! do not use elementS, casts error
        return driver.findElementByXPath(createXPath(str));
    }
    public String createXPath(String str){

        String str_xpath = "//*[contains(@text, '"+ str +"')]";
        System.out.println(str_xpath);
        return str_xpath;
    }


    public WebElement findElementById(String id){

        // return driver.findElementByXPath("//*[contains(@text, '"+ str +"')]"); //attention! do not use elementS, casts error
        return driver.findElement(By.id(id));
    }

    public WebElement waitForElementPresentByXpath(String xpath, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        By by = By.xpath(xpath);// driver.findElementByXPath("//android.widget.CheckedTextView[@text='Home']").click();

        System.out.println(xpath);

        return  wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
    public WebElement waitForElementPresentById(String id, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        By by = By.id(id);

        System.out.println(id);

        return  wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

}
