package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class HomePage extends PageBase {
    public HomePage(AppiumDriver driver) {
        super(driver);
    }


    @AndroidFindBy(accessibility = "Profile")
    private WebElement profile_navbar;
    @AndroidFindBy(accessibility = "Post an Ad")
    private WebElement postAnAdd_navbar;


    public ProfilePage clickProfile_navBar() {
        try {
            Thread.sleep(Duration.ofSeconds(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
        waitForVisibility(profile_navbar);
        click(profile_navbar);
        return new ProfilePage(driver);
    }

    public LoginPage clickPostAnAdd_navBar() {
        try {
            Thread.sleep(Duration.ofSeconds(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
        waitForVisibility(postAnAdd_navbar);
        click(postAnAdd_navbar);
        return new LoginPage(driver);
    }
}
