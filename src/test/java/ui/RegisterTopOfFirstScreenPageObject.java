package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

abstract public class RegisterTopOfFirstScreenPageObject extends MainPageObject {
    public static String
            REGISTER_EMAIL_INIT_ELEMENT,
            REGISTER_NAME,
            REGISTER_NAME_INIT_ELEMENT,
            REGISTER_LAST_NAME_INIT_ELEMENT;

    int j = this.generateRandomForRegisterData(444);
    String email_for_new_account  = "yanina+autotest" + j + "@yoopies.com" ;

    public RegisterTopOfFirstScreenPageObject(AppiumDriver driver){
        super(driver);
    }


    public void initRegisterEmailInputSendKeys() {
// ********************************* emailInput on Create account screen ***********************
        this.waitForElementAndSendKeys(
                By.id(REGISTER_EMAIL_INIT_ELEMENT),
                email_for_new_account,
            "Cannot find searched emailInput on Create account screen",
            7,
                "Keys are sent to emailInput on Create account screen"
            );
    }
    public void initRegisterNameInputSendKeys() {

        this.waitForElementAndSendKeys(
                By.id(REGISTER_NAME_INIT_ELEMENT),
                REGISTER_NAME,
                "Cannot find searched nameInput on Create account screen",
                7,
                "Keys are sent to nameInput on Create account screen"
        );

    }
    public void initRegisterLastNameInputSendKeys() {

        // ************************ lastnameInput on Create account screen ***********************

        this.waitForElementAndSendKeys(
                By.id(REGISTER_LAST_NAME_INIT_ELEMENT),
                REGISTER_NAME,
                "Cannot find searched lastNameInput on Create account screen",
                3,
                "Keys are sent to lastNameInput on Create account screen"

        );
    }

}
