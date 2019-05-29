package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.RegisterSecondScreenPageObject;

public class AndroidRegisterSecondScreenPageObject  extends RegisterSecondScreenPageObject

{
    static {
        REGISTER_ADDRESS_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/postalAddressInput";
        REGISTER_ADDRESS_STRING = "47 Davies Street";
        NO_SUCH_ADDRESS_INIT_ELEMENT = "Didn't find what you were looking for?";
        ADDRESS_FROM_SUGGESTED_LIST = "//*[contains(@text, '47 Davies Street')]";
        SELECT_COUNTRY_CODE_ARROW = "com.yoopies.babysittingandroid.beta:id/imageView_arrow";
        REGISTER_PHONE_INIT_ELEMENT = "com.yoopies.babysittingandroid.beta:id/phoneInputCarrier";
        REGISTER_PHONE_NUMBER_STRING = "637333777";
        REGISTER_BUTTON_INIT_ELEMENT = "//*[contains(@text, 'Registration')]"; //
    }
    public AndroidRegisterSecondScreenPageObject(AppiumDriver driver){
        super(driver);
    }


}
