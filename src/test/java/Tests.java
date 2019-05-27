import lib.Platform;
import org.junit.Test;
import ui.*;
import ui.factories.*;

public class Tests extends CoreTestCase {


private ui.MainPageObject MainPageObject;
protected void setUp() throws Exception{
    super.setUp();
    MainPageObject = new MainPageObject(driver);
}
//// ++++++++++++++++++++++++++++++++  SKIP +++++++++++++++++++++++++++++++++++++++
////        if (this.Platform.isAndroid()){
////            return;
////        }

    // Test: User logins and then logs out.
    @Test
    public void testRegisterAndMySituationSettings() {
        SignInSignUpPageObject SignInSignUpPageObject = SignInSignUpPageObjectFactory.get(driver); //USE FACTORY!!!!!!
        SignInSignUpPageObject.initSignInSignUpScreen();
        SignInSignUpPageObject.initRegisterScreen();


        RegisterTopOfFirstScreenPageObject RegisterTopOfFirstScreenPageObject = RegisterTopOfFirstScreenPageObjectFactory.get(driver);
        RegisterTopOfFirstScreenPageObject.initRegisterEmailInputSendKeys();
        RegisterTopOfFirstScreenPageObject.initRegisterNameInputSendKeys();


        RegisterBottomOfFirstScreenPageObject RegisterBottomOfFirstScreenPageObject = RegisterBottomOfFirstScreenPageObjectFactory.get(driver);
        RegisterBottomOfFirstScreenPageObject.swipeToInitRegisterBottomScreen();


        RegisterTopOfFirstScreenPageObject.initRegisterLastNameInputSendKeys();
        RegisterBottomOfFirstScreenPageObject.initRegisterPasswordInputSendKeys();

        NextBtnPageObject NextBtnPageObject = NextBtnPageObjectFactory.get(driver);
        NextBtnPageObject.nextButtonClick();


        RegisterSecondScreenPageObject RegisterSecondScreenPageObject = RegisterSecondScreenPageObjectFactory.get(driver);
      //  RegisterSecondScreenPageObject.waitAddressInputAndClick();
        RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys();
        RegisterSecondScreenPageObject.initRegisterNoSuchAddressClick();



        CountriesSpinnerPageObject CountriesSpinner = CountriesSpinnerPageObjectFactory.get(driver);
        CountriesSpinner.initCountriesSpinnerObject();
        CountriesSpinner.SelectCountry();
        CountriesSpinner.AcceptButtonClick();

        RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys();
        RegisterSecondScreenPageObject.initRegisterConfirmAddress();
        RegisterSecondScreenPageObject.initRegisterPhoneCodeSelector();
        CountriesSpinner.SelectCountryCode();
        RegisterSecondScreenPageObject.initRegisterPhoneNumberInputSendKeys();
        RegisterSecondScreenPageObject.RegisterButtonClick();

        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
        IntroPageObject.initSkipIntroAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

//        MainPageObject.scrollDown();
        //      this.backgroundApp(2);

        BottomMenuPageObject.waitMoreBtnPresent();
        BottomMenuPageObject.initMoreBtnClickAction();

        SettingsPageObject SettingsPageObject = SettingsPageObjectFactory.get(driver);
        //   //     SettingsPageObject.waitForNameFieldPresent();
        SettingsPageObject.help();
////      SettingsPageObject.initPaymentBtnClickAction();
// //     SettingsPageObject.swipeUpShit();
//        SettingsPageObject.waitForNameFieldPresent();
//        SettingsPageObject.waitForAddressFieldPresent();
//        SettingsPageObject.waitForSimulationIconPresent();
//        MainPageObject.swipeUp(6);
//        SettingsPageObject.initSettingsArrowClickAction();
//
//        LogOutPageObject LogOutPageObject = LogOutPageObjectFactory.get(driver);
//
//        LogOutPageObject.initLogoutClickAction();
//
//        LogOutPageObject.initLOGOUTPopupClickAction();

    }


    // Test: User logins and then logs out.
    @Test
    public void testLoginLogoutTest()
    {
        SignInSignUpPageObject SignInSignUpPageObject = SignInSignUpPageObjectFactory.get(driver);
        SignInSignUpPageObject.initSignInSignUpScreen();

                if (Platform.getInstance().isIOS())
                {
            SignInSignUpPageObject.initLoginScreen();
            } else {
                    SignInSignUpPageObject.initLoginScreenById();
                }

        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.initSendKeysToEmailAction();
        LoginPageObject.initSendKeysToPasswordAction();
                if (Platform.getInstance().isIOS()){
                    LoginPageObject.initDoneLAction();
                }
        LoginPageObject.initFinishLoginInProcessAction();
        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
//        if (Platform.getInstance().isIOS()){
//            IntroPageObject.initAllowNotificationBtnClickAction();
//            }

        IntroPageObject.initSkipIntroAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

//        MainPageObject.scrollDown();
  //      this.backgroundApp(2);

        BottomMenuPageObject.waitMoreBtnPresent();
        BottomMenuPageObject.initMoreBtnClickAction();

        SettingsPageObject SettingsPageObject = SettingsPageObjectFactory.get(driver);
        //   SettingsPageObject.waitForNameFieldPresent();
     //   SettingsPageObject.help();

      //  SettingsPageObject.waitForNameFieldPresent();
//        SettingsPageObject.waitForAddressFieldPresent();
        SettingsPageObject.waitForSimulationIconPresent();

        MainPageObject.swipeUp(6);
        SettingsPageObject.initSettingsBtnClickAction();

        LogOutPageObject LogOutPageObject = LogOutPageObjectFactory.get(driver);

        LogOutPageObject.initLogoutClickAction();
        if (Platform.getInstance().isAndroid()){
            LogOutPageObject.initLOGOUTPopupClickAction();
        }


    }
}