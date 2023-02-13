package uiTests.category;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;
/**
 * @author Farrukh Ashirbaev
 */

public class ActionsWithCategory extends BaseUiTest {

    @Test (priority = 1)
    @Description("Open Category From Admin page Using Title Link.")
    @Feature("Category")
    public void openCategoryPageFromHomepageUsingTitleLink() {
        adminHomePage.clickCategoriesTxtLink();
        categoryPage.checkURLCategoryPage();
        categoryPage.checkCategoriesTitle();
        categoryPage.checkCategoryTxt();
        categoryPage.clickOnAddYourFirstCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
    }

    @Test (priority = 2)
    @Description("Create Category With Using Hard Code Category Name.")
    @Feature("Category")
    public void createCategoryWithUsingOnlyCategoryName() {
        createCategoryPage.fillInFieldNameWithUsingHardName();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test (priority = 3)
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

    @Test (priority = 4)
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

    @Test (priority = 5)
    @Description("Create Category With Admin Page.")
    @Feature("Category")
    public void createCategoryWithMainPage() {
        adminHomePage.clickAddCategoryBtn();
        createCategoryPage.checkUrlCreateCategory();
        createCategoryPage.fillInFieldNameWithUseGenerateRandomName();
        createCategoryPage.clickAddCategoryBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test (priority = 6)
    @Description("Remove All Categories After Test Case.")
    @Feature("Category")
    public void removeAllCategoriesAfterTest() {
        categoryPage.removeAllCategory();
    }
}
