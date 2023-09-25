package postandadd;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PostAnAddTests extends TestBase {
    @Test
    public void testValidationMessageDisplayedForRequiredFields(){
        var loginPage = homePage.clickPostAnAdd_navBar();
        loginPage.setPhoneNumberField("00000111");
        loginPage.setPasswordField("4saleTest");
        var postAnAddPage =loginPage.clickLoginButton();
        postAnAddPage.acceptAlert();
        var categoryPage = postAnAddPage.clickChooseCategoryButton();
        categoryPage.clickAutomotiveCategoryDropDown();
        categoryPage.clickClassicCarsSubCategoryLink();
        postAnAddPage.clickNextButton();
        assertTrue(postAnAddPage.isRequiredValidationMessageDisplayed(),
                "validation message doesn't displayed");
    }
    @Test
    public void testAddAnAddSuccessfully(){
        var loginPage = homePage.clickPostAnAdd_navBar();
        loginPage.setPhoneNumberField("00000111");
        loginPage.setPasswordField("4saleTest");
        var postAnAddPage =loginPage.clickLoginButton();
        postAnAddPage.acceptAlert();
        var categoryPage = postAnAddPage.clickChooseCategoryButton();
        categoryPage.clickAutomotiveCategoryDropDown();
        categoryPage.clickClassicCarsSubCategoryLink();
        var chooseLocationPage = postAnAddPage.clickChooseListingLocationButton();
        chooseLocationPage.clickChooseDistrictButton();
        chooseLocationPage.selectCity_popUp("Kuwait City");
        chooseLocationPage.clickDoneButton_cityPopUp();
        chooseLocationPage.clickDoneButton();
        postAnAddPage.setTitleField("automation is interesting");
        postAnAddPage.setPriceField("100");
        var addMediaPage = postAnAddPage.clickNextButtonAfterEnterRequiredFields();
        assertTrue(addMediaPage.isAddMediaTitleDisplayed(),
                "addMediaPage is not opened");

    }
}
