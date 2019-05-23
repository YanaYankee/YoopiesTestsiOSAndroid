package ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class MainPageObject {
    protected AppiumDriver driver;

    //constructor for all tests
    public MainPageObject(AppiumDriver driver) {
        this.driver = driver;
    }



    public WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds,String found )
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
//        System.out.println(found);
        return  wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
    public WebElement waitForElementClickable(By by, String error_message, long timeoutInSeconds,String found )
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
//        System.out.println(found);
        return  wait.until(
                ExpectedConditions.elementToBeClickable(by)
        );
    }


    public WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds,String found)
    {
        WebElement element = waitForElementPresent( by,  error_message,  timeoutInSeconds, found);
        element.click();

        return element;
    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds,String found)
    {
        WebElement element = waitForElementPresent( by,  error_message, timeoutInSeconds, found);
        element.sendKeys(value);
        return element;
    }



//************************SWIPES******************************
public void swipeUp(int timeOfSwipeInSecs) {
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

    public void swipeElementToLeft(By by, String error_message, String found){
        WebElement element = waitForElementPresent(
                by,
                error_message,
                10,
                found);
        int left_x = element.getLocation().getX(); //the most left point on X
        int right_x = left_x + element.getSize().getWidth();//the most left point on X + element width;
        int upper_y = element.getLocation().getY();
        int lower_y = upper_y + element.getSize().getHeight();
        int middle_y = (upper_y+lower_y) / 2;

        TouchAction action =  new TouchAction(driver);
        action
                .press(PointOption.point(right_x, middle_y))
                .moveTo(PointOption.point(left_x,middle_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
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