package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Platform {
    private static final String
            PLATFORM_IOS = "ios",
            PLATFORM_ANDROID = "android",
            APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    private static Platform instance;
    private Platform() {}

    public static Platform getInstance()
    {
            if (instance == null) {
                instance = new Platform();
            }
            return instance;
    }


    public AppiumDriver getDriver() throws Exception {
        URL URL = new URL(APPIUM_URL);
        if (this.isAndroid()) {
            return new AndroidDriver(URL, this.getAndroidDesiredCapabilities());
        } else if (this.isIOS()) {
            return new IOSDriver(URL, this.getIOSDesiredCapabilities());
        } else {
            throw new Exception("Cannot detect type of the driver. Platform value:   " + this.getPlatformVar());
        }
    }

    public boolean isAndroid(){ return isPlatform(PLATFORM_ANDROID); }

    public boolean isIOS(){ return isPlatform(PLATFORM_IOS); }

    private DesiredCapabilities getAndroidDesiredCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8");
      // capabilities.setCapability("automationName", "Appium"); //Original error: Could not find a driver for automationName 'Appium' and platformName 'Android'. Please check your desired capabilities.
        capabilities.setCapability("appPackage", "com.yoopies.babysittingandroid.beta");
        capabilities.setCapability("appActivity", "com.yoopies.loginmodule.activities.splash.SplashActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("language", "en");
        capabilities.setCapability("locale", "FR");
        capabilities.setCapability("app", "/Users/yaninapavlyk/Tests/YoopiesIosAndrTests/apks/app-beta-debug.apk");
        return capabilities;
    }
    private DesiredCapabilities getIOSDesiredCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone Xr");
        capabilities.setCapability("platformVersion", "12.2");
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("language", "en");
        capabilities.setCapability("locale", "fr_FR");
        capabilities.setCapability("app", "/Users/yaninapavlyk/Yoopies_APP/iOS-App-Childcare-Development.app");

        return capabilities;
    }
    private boolean isPlatform(String my_platform){
        String platform = this.getPlatformVar();
        return  my_platform.equals(platform);
    }

    private String getPlatformVar() {  return System.getenv("PLATFORM");  }

    private DesiredCapabilities getCapabilitiesByPlatformEnv() throws Exception {
        String platform = System.getenv("PLATFORM");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (platform.equals(PLATFORM_ANDROID)) {

        } else if (platform.equals(PLATFORM_IOS)){

        } else {
            throw new Exception("Cannot get run platform from env variable. Platform value " + platform);
        }
        return capabilities;
    }

}
