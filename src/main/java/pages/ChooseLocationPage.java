package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChooseLocationPage extends PageBase {
    public ChooseLocationPage(AppiumDriver driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.forsale.forsale:id/locationSelectorText")
    private WebElement chooseDistrictButton;
    private String city_popUp = "//android.widget.TextView[@text='%s']";
    @AndroidFindBy(id = "btnProceed")
    private WebElement doneButton_cityPopUp;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose Area']")
    private WebElement chooseAreaButton;
    private String area_popUp = "//android.widget.TextView[@text='%s']";
    @AndroidFindBy(id = "btnProceed")
    private WebElement doneButton_areaPopUp;
    @AndroidFindBy(xpath = "//*[@text='Done']")
    private WebElement doneButton;


    public void clickChooseDistrictButton() {
        waitForVisibility(chooseDistrictButton);
        click(chooseDistrictButton);
    }

    public void clickChooseAreaButton() {
        waitForVisibility(chooseAreaButton);
        click(chooseAreaButton);
    }

    public void clickDoneButton_areaPopUp() {
        waitForVisibility(doneButton_areaPopUp);
        click(doneButton_areaPopUp);
    }

    public void clickDoneButton_cityPopUp() {
        waitForVisibility(doneButton_cityPopUp);
        click(doneButton_cityPopUp);
    }

    public void clickDoneButton() {
        waitForVisibility(doneButton);
        click(doneButton);
    }

    public void selectCity_popUp(String city) {
        //"Kuwait City"
        waitForVisibility(driver.findElement(By.xpath(String.format(city_popUp, city))));
        driver.findElement(By.xpath(String.format(city_popUp, city))).click();
    }

    public void selectArea_popUp(String area) {
        //Sharq
        waitForVisibility(driver.findElement(By.xpath(String.format(area_popUp, area))));
        driver.findElement(By.xpath(String.format(area_popUp, area))).click();
    }
}
