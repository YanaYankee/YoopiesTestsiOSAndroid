package tests;

import lib.Platform;
import lib.ui.CoreTestCase;
import org.junit.Test;
import lib.ui.*;
import lib.ui.factories.*;

public class CreateAccountTests extends CoreTestCase {

    @Test
    public void testRegisterAndMySituationSettings() {
        SignInSignUpPageObject SignInSignUpPageObject = SignInSignUpPageObjectFactory.get(driver); //USE FACTORY!!!!!!
        SignInSignUpPageObject.initSignInSignUpScreen();
        SignInSignUpPageObject.initRegisterScreen();

// ********** First form
        RegisterTopOfFirstScreenPageObject RegisterTopOfFirstScreenPageObject = RegisterTopOfFirstScreenPageObjectFactory.get(driver);
        // ********** Name
        RegisterTopOfFirstScreenPageObject.initRegisterNameInputSendKeys();
        // ********** Email
        RegisterTopOfFirstScreenPageObject.initRegisterEmailInputSendKeys();
        // ********** Swipe up
        RegisterBottomOfFirstScreenPageObject RegisterBottomOfFirstScreenPageObject = RegisterBottomOfFirstScreenPageObjectFactory.get(driver);
        if (Platform.getInstance().isAndroid()) {
            RegisterBottomOfFirstScreenPageObject.swipeToInitRegisterBottomScreen();
        }
        // ********** Last Name
        RegisterTopOfFirstScreenPageObject.initRegisterLastNameInputSendKeys();
        // ********** Password
        RegisterBottomOfFirstScreenPageObject.initRegisterPasswordInputSendKeys();
        // ********** Next
        NextBtnPageObject NextBtnPageObject = NextBtnPageObjectFactory.get(driver);
        NextBtnPageObject.nextButtonClick();

//************************** Second screen **********************************************

        RegisterSecondScreenPageObject RegisterSecondScreenPageObject = RegisterSecondScreenPageObjectFactory.get(driver);
        //  RegisterSecondScreenPageObject.waitAddressInputAndClick();
        RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys();
        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterNoSuchAddressClick();
        }

        CountriesSpinnerPageObject CountriesSpinner = CountriesSpinnerPageObjectFactory.get(driver);
        if (Platform.getInstance().isAndroid()) {
            CountriesSpinner.initCountriesSpinnerObject();
            CountriesSpinner.SelectCountry();
            CountriesSpinner.AcceptButtonClick();
        }

        //  RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys();
        RegisterSecondScreenPageObject.initRegisterConfirmAddress();

        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterPhoneCodeSelector();
            CountriesSpinner.SelectCountryCode();
        }
//        else {
//            RegisterSecondScreenPageObject.insertPhoneNumber();
//        }

        RegisterSecondScreenPageObject.initRegisterPhoneNumberInputSendKeys();
        RegisterSecondScreenPageObject.RegisterButtonClick();

        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
        IntroPageObject.initSkipIntroAction();

//        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver); // NEED TEMPLATE TO BE ADDED (USER NAME ON HELLO USER
//        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

        BottomMenuPageObject.waitMoreBtnPresent();
        BottomMenuPageObject.initMoreBtnClickAction();

        SettingsPageObject SettingsPageObject = SettingsPageObjectFactory.get(driver);
        SettingsPageObject.waitForSimulationIconPresent();

        MainPageObject.swipeUp(6);
        SettingsPageObject.initSettingsBtnClickAction();

        LogOutPageObject LogOutPageObject = LogOutPageObjectFactory.get(driver);

        LogOutPageObject.initLogoutClickAction();
        if (Platform.getInstance().isAndroid()) {
            LogOutPageObject.initLOGOUTPopupClickAction();
        }
    }

    // Test: User logins and then logs out.
}
