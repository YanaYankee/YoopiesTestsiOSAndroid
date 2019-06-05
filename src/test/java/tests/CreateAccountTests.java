package tests;

import lib.Platform;
import lib.ui.CoreTestCase;
import lib.ui.factories.register.RegisterBottomOfFirstScreenPageObjectFactory;
import lib.ui.factories.register.RegisterSecondScreenPageObjectFactory;
import lib.ui.factories.register.RegisterTopOfFirstScreenPageObjectFactory;
import lib.ui.factories.search.SearchMainPageObjectFactory;
import lib.ui.factories.start.DashboardPageObjectFactory;
import lib.ui.factories.start.IntroPageObjectFactory;
import lib.ui.factories.start.SignInSignUpPageObjectFactory;
import org.junit.Test;
import lib.ui.*;
import lib.ui.factories.*;

public class CreateAccountTests extends CoreTestCase {

    @Test
    public void testRegisterAndLogOut() {
        String address_string = "22 Rue Ordener, 75018 Paris, France" ;

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
        RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys(address_string);
        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterNoSuchAddressClick();
        }

        CountriesSpinnerPageObject CountriesSpinner = CountriesSpinnerPageObjectFactory.get(driver);
        if (Platform.getInstance().isAndroid()) {
            CountriesSpinner.initCountriesSpinnerObject();
            CountriesSpinner.SelectCountry();
            CountriesSpinner.AcceptButtonClick();
            RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys(address_string);
        }


        RegisterSecondScreenPageObject.initRegisterConfirmAddress();

        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterPhoneCodeSelector();
            CountriesSpinner.SelectCountryCode();
        }


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

    @Test
    public void testRegisterAndMySituationSettings() {
        String address_string = "22 Rue Ordener, 75018 Paris, France" ;


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
        RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys(address_string);
        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterNoSuchAddressClick();
        }

        CountriesSpinnerPageObject CountriesSpinner = CountriesSpinnerPageObjectFactory.get(driver);
        if (Platform.getInstance().isAndroid()) {
            CountriesSpinner.initCountriesSpinnerObject();
            CountriesSpinner.SelectCountry();
            CountriesSpinner.AcceptButtonClick();
            RegisterSecondScreenPageObject.initRegisterAddressInputSendKeys(address_string);
        }

        RegisterSecondScreenPageObject.initRegisterConfirmAddress();

        if (Platform.getInstance().isAndroid()) {
            RegisterSecondScreenPageObject.initRegisterPhoneCodeSelector();
            CountriesSpinner.SelectCountryCode();
        }

        RegisterSecondScreenPageObject.initRegisterPhoneNumberInputSendKeys();
        RegisterSecondScreenPageObject.RegisterButtonClick();

        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
        IntroPageObject.initSkipIntroAction();


        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);
        BottomMenuPageObject.waitMoreBtnPresent();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.initStartYourFirstSearch();

//***************** SEARCH TESTS ARE STARTING HERE ***************************************

        SearchMainPageObject SearchMainPageObject = SearchMainPageObjectFactory.get(driver);
        SearchMainPageObject.waitForStartFirstSearchBtn();
        SearchMainPageObject.initStartSearchBtnClickAction();

        if (Platform.getInstance().isAndroid()) {
            IntroPageObject.tapToCloseHintsOverlay();
        }

        SearchMainPageObject.waitForAddFiltersBtnPresent();
        SearchMainPageObject.waitForSortingBtnPresent();
        SearchMainPageObject.waitForAddressFieldPresent(address_string);
        SearchMainPageObject.waitForNeedFieldPresent();



        SearchMainPageObject.waitForTypeOfCareFieldPresent();
        SearchMainPageObject.initTypeOfCareFieldClick();

        SimulatorPageObject SimulatorPageObject = SimulatorPageObjectFactory.get(driver);
        if (Platform.getInstance().isAndroid()) {
        SimulatorPageObject.initConfigureMySituationPopUp();
        }

//***************** MY SITUATION TESTS ARE STARTING HERE ***************************************

        SimulatorPageObject.initAddChildren36Years();
        SimulatorPageObject.selectInRelationship();
        MainPageObject.swipeUp(6);
        SimulatorPageObject.selectMyIncome1ChildInRel();
        SimulatorPageObject.initAcceptBtn();

    }

}
