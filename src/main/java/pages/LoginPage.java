package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    public LoginPage(AppiumDriver driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    //locate by ID not working @AndroidFindBy(id = "phoneNumberField")

    private WebElement phoneNumberField;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")

    private WebElement passwordField;
    @AndroidFindBy(xpath = "//*[@resource-id='loginBtn']")

    private WebElement loginButton;




    public void setPhoneNumberField(String number) {
        clear(phoneNumberField);
        sendText(phoneNumberField, number);
    }

    public void setPasswordField(String password) {
        clear(passwordField);
        sendText(passwordField, password);
    }

    public ProfilePage clickLoginButton_ProfilePage() {
        click(loginButton);
        return new ProfilePage(driver);
    }

    public PostAnAddPage clickLoginButton() {
        click(loginButton);
        return new PostAnAddPage(driver);
    }
}
