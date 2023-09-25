package login;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {
    @Test
    public void testLoginSuccessfully(){
        var profilePage = homePage.clickProfile_navBar();
        var loginPage = profilePage.clickLoginButton();
        loginPage.setPhoneNumberField("00000111");
        loginPage.setPasswordField("4saleTest");
        loginPage.clickLoginButton_ProfilePage();
        assertTrue(profilePage.isLoginButtonDisplayed(),"there is an error with login");
    }
}
