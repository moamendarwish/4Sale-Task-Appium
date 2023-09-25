package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CategoryPage extends PageBase {
    public CategoryPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Automotive']")
    private WebElement automotiveCategoryDropDown;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Classic Cars']")
    private WebElement classicCarsSubCategoryLink;


    public void clickAutomotiveCategoryDropDown() {
        waitForVisibility(automotiveCategoryDropDown);
        click(automotiveCategoryDropDown);
    }

    public PostAnAddPage clickClassicCarsSubCategoryLink() {
        waitForVisibility(classicCarsSubCategoryLink);
        click(classicCarsSubCategoryLink);
        return new PostAnAddPage(driver);
    }

}
