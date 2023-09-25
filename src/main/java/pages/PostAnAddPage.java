package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PostAnAddPage extends PageBase {

    public PostAnAddPage(AppiumDriver driver) {
        super(driver);
    }



    @AndroidFindBy(id = "android:id/button1")
    private WebElement alert_okButton;
    @AndroidFindBy(id = "chooseCategoryField")
    private WebElement chooseCategoryButton;
    @AndroidFindBy(id = "chooseDistrictField")
    private WebElement chooseListingButton;
    @AndroidFindBy(id = "adTitleField")
    private WebElement titleField;
    @AndroidFindBy(id = "adPriceField")
    private WebElement priceField;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Next']")
    private WebElement nextButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Required']")
    private WebElement requiredValidationMessage;



    public void acceptAlert() {
        waitForVisibility(alert_okButton);
        click(alert_okButton);
    }

    public CategoryPage clickChooseCategoryButton() {
        waitForVisibility(chooseCategoryButton);
        click(chooseCategoryButton);
        return new CategoryPage(driver);
    }

    public ChooseLocationPage clickChooseListingLocationButton() {
        waitForVisibility(chooseListingButton);
        click(chooseListingButton);
        return new ChooseLocationPage(driver);
    }

    public void clickNextButton() {
        waitForVisibility(nextButton);
        click(nextButton);
    }

    public AddMediaPage clickNextButtonAfterEnterRequiredFields() {
        waitForVisibility(nextButton);
        click(nextButton);
        return new AddMediaPage(driver);
    }

    public boolean isRequiredValidationMessageDisplayed() {
        waitForVisibility(requiredValidationMessage);
        return requiredValidationMessage.isDisplayed();
    }

    public void setTitleField(String text) {
        waitForVisibility(titleField);
        sendText(titleField, text);
    }

    public void setPriceField(String text) {
        waitForVisibility(priceField);
        sendText(priceField, text);
    }
}
