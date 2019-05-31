package tests;

import lib.Platform;
import lib.ui.*;
import lib.ui.CoreTestCase;
import lib.ui.factories.*;
import lib.ui.factories.search.SearchMainPageObjectFactory;
import lib.ui.factories.start.DashboardPageObjectFactory;
import lib.ui.factories.start.IntroPageObjectFactory;
import lib.ui.factories.start.LoginPageObjectFactory;
import lib.ui.factories.start.SignInSignUpPageObjectFactory;
import org.junit.Test;

public class SearchTests extends CoreTestCase {

    @Test
    public void testInitSearchScreenTestByBottomMenuTest()
    {
        String address_string = "22 Rue Ordener, 75018 Paris, France";

        SignInSignUpPageObject SignInSignUpPageObject = SignInSignUpPageObjectFactory.get(driver);
        SignInSignUpPageObject.initSignInSignUpScreen();

        if (Platform.getInstance().isIOS())
        { SignInSignUpPageObject.initLoginScreen();
        } else { SignInSignUpPageObject.initLoginScreenById(); }

        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.initSendKeysToEmailAction();
        LoginPageObject.initSendKeysToPasswordAction();
        if (Platform.getInstance().isIOS()){
            LoginPageObject.initDoneLAction(); }
        LoginPageObject.initFinishLoginInProcessAction();

        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
        IntroPageObject.initSkipIntroAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

        BottomMenuPageObject.initSearchBtnClickAction();

//SEARCH TESTS ARE STARTING HERE
        SearchMainPageObject SearchMainPageObject = SearchMainPageObjectFactory.get(driver);
        SearchMainPageObject.waitForAddressFieldPresent(address_string); // use TMP for CONST
        SearchMainPageObject.waitForTypeOfCareFieldPresent();
        SearchMainPageObject.waitForNeedFieldPresent();
        SearchMainPageObject.waitForSortingBtnPresent();
        SearchMainPageObject.waitForAddFiltersBtnPresent();

    }
    public void testInitSearchScreenByDashboardBtnTest()
    {
        String address_string = "22 Rue Ordener, 75018 Paris, France";

        SignInSignUpPageObject SignInSignUpPageObject = SignInSignUpPageObjectFactory.get(driver);
        SignInSignUpPageObject.initSignInSignUpScreen();

        if (Platform.getInstance().isIOS())
        { SignInSignUpPageObject.initLoginScreen();
        } else { SignInSignUpPageObject.initLoginScreenById(); }

        LoginPageObject LoginPageObject = LoginPageObjectFactory.get(driver);
        LoginPageObject.initSendKeysToEmailAction();
        LoginPageObject.initSendKeysToPasswordAction();
        if (Platform.getInstance().isIOS()){
            LoginPageObject.initDoneLAction(); }
        LoginPageObject.initFinishLoginInProcessAction();

        IntroPageObject IntroPageObject = IntroPageObjectFactory.get(driver);
        IntroPageObject.initSkipIntroAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

        BottomMenuPageObject.waitMoreBtnPresent();

//SEARCH TESTS ARE STARTING HERE
        SearchMainPageObject SearchMainPageObject = SearchMainPageObjectFactory.get(driver);
        SearchMainPageObject.initStartSearchBtnClickAction();
        SearchMainPageObject.waitForAddressFieldPresent(address_string); // use TMP for CONST
        SearchMainPageObject.waitForTypeOfCareFieldPresent();
        SearchMainPageObject.waitForNeedFieldPresent();
        SearchMainPageObject.waitForSortingBtnPresent();
        SearchMainPageObject.waitForAddFiltersBtnPresent();

    }
}
