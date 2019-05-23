

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import lib.Platform;
import org.openqa.selenium.ScreenOrientation;

import java.time.Duration;

public class CoreTestCase extends TestCase {


    protected AppiumDriver driver;

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        driver = Platform.getInstance().getDriver();
//        this.Platform = new Platform();
//        driver = this.Platform.getDriver();
// ****************  Set orientation before each test ***********************
        this.rotateScreenPortrait();

    }

    @Override
    protected void tearDown() throws Exception
    {
        driver.quit();
        super.tearDown();
    }
    protected void rotateScreenPortrait(){driver.rotate(ScreenOrientation.PORTRAIT);}
    protected void rotateScreenLandscape(){driver.rotate(ScreenOrientation.LANDSCAPE);}
    protected void backgroundApp(int seconds){driver.runAppInBackground(Duration.ofSeconds(seconds));}


}