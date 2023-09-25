package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;




public class ProfilePage extends PageBase {

    public ProfilePage(AppiumDriver driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement loginButton;
    @AndroidFindBy(accessibility = "Profile")
    private WebElement profile_navbar;


    public LoginPage clickLoginButton() {
        waitForVisibility(loginButton);
        click(profile_navbar);
        click((loginButton));
        return new LoginPage(driver);
    }

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }

}
