package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AddMediaPage extends PageBase {
    public AddMediaPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Media']")
    private WebElement addMediaTitle;


    public boolean isAddMediaTitleDisplayed() {
        waitForVisibility(addMediaTitle);
        return addMediaTitle.isDisplayed();
    }
}
