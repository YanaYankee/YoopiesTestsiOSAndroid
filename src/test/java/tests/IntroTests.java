package tests;

import lib.Platform;
import lib.ui.*;
import lib.ui.CoreTestCase;
import lib.ui.factories.start.DashboardPageObjectFactory;
import lib.ui.factories.start.IntroPageObjectFactory;
import lib.ui.factories.start.LoginPageObjectFactory;
import lib.ui.factories.start.SignInSignUpPageObjectFactory;
import org.junit.Test;

public class IntroTests extends CoreTestCase {

    @Test
    public void testCheckIntroSliderTest()
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
        IntroPageObject.initIntroSliderViewAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();


    }
}
