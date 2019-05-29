package tests;

import lib.Platform;
import lib.ui.*;
import lib.ui.CoreTestCase;
import lib.ui.factories.*;
import org.junit.Test;

public class SearchTests extends CoreTestCase {

    @Test
    public void testInitSearchScreenTestByBottomMenuTest()
    {
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

        SearchMainPageObject SearchMainPageObject = SearchMainPageObjectFactory.get(driver);

    }
}
