package tests;

import lib.Platform;
import lib.ui.CoreTestCase;
import lib.ui.factories.start.DashboardPageObjectFactory;
import lib.ui.factories.start.IntroPageObjectFactory;
import lib.ui.factories.start.LoginPageObjectFactory;
import lib.ui.factories.start.SignInSignUpPageObjectFactory;
import org.junit.Test;
import lib.ui.*;
import lib.ui.factories.*;

public class LoginLogoutTests extends CoreTestCase {
//LoginLogoutTests#testLoginLogoutTest
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

        IntroPageObject.initSkipIntroAction();

        DashboardPageObject DashboardPageObject = DashboardPageObjectFactory.get(driver);
        DashboardPageObject.waitForHelloTitleOnDashboardPresent();
        BottomMenuPageObject BottomMenuPageObject = BottomMenuPageObjectFactory.get(driver);

        BottomMenuPageObject.waitMoreBtnPresent();
        BottomMenuPageObject.initMoreBtnClickAction();

        SettingsPageObject SettingsPageObject = SettingsPageObjectFactory.get(driver);
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
