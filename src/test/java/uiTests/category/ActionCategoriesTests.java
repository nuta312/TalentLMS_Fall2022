package uiTests.category;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import java.util.NoSuchElementException;

/**
 * @author Farrukh Ashirbaev
 */

public class ActionCategoriesTests extends BaseUiTest {

    @Test(priority = 1)
    @Description("Preconditions for start Test")
    @Feature("Category")
    public void removeAllCategoriesForStartAutoTest() {
        adminHomePage.clickCategoriesTxtLink();
        categoryPage.checkURLCategoryPage();
        try {
            categoryPage.removeAllCategory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        webElementActions.refreshPage();
    }


    @Test(priority = 2)
    @Description("Check Title When Category Table is Empty")
    @Feature("Category")
    public void openCategoryPageFromHomepageUsingTitleLink() {
        categoryPage.checkURLCategoryPage();
        categoryPage.checkCategoriesTitle();
        categoryPage.checkCategoryTxt();
        categoryPage.clickOnAddYourFirstCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
    }

    @Test(priority = 3)
    @Description("Create Category With Using Hard Code Category Name.")
    @Feature("Category")
    public void createCategoryWithUsingOnlyCategoryName() {
        createCategoryPage.fillInFieldNameWithUsingHardName();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 4)
    @Description("Create Category With Using Existing Parent Name.")
    @Feature("Category")
    public void createCategoryWithUsingOnlyCategoryHardName() {
        categoryPage.clickAddCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
        createCategoryPage.fillInFieldNameWithUseGenerateRandomName();
        createCategoryPage.openParentCategoryDDL();
        createCategoryPage.chooseExistingParentInListOfParentCategory();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 5)
    @Description("Create Category With Using Price Field.")
    @Feature("Category")
    public void createCategoryWithUsingPriceField() {
        categoryPage.clickAddCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
        createCategoryPage.fillInFieldNameWithUseGenerateRandomName();
        createCategoryPage.clickPriceIcon();
        createCategoryPage.fillInFieldPrice();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkPriceTitle();
    }

    @Test(priority = 6)
    @Description("Create Category With Admin Page.")
    @Feature("Category")
    public void createCategoryWithMainPage() {
        adminHomePage.clickAddCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
        createCategoryPage.fillInFieldNameWithUseGenerateRandomName();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 7)
    @Description("Remove All Categories After Test Case.")
    @Feature("Category")
    public void removeAllCategoriesAfterTest() {
        categoryPage.removeAllCategory();
    }
}
