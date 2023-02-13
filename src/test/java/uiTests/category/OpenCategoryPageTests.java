package uiTests.category;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

/**
 * @author Farrukh Ashirbaev
 */

public class OpenCategoryPageTests extends BaseUiTest {

    @Test(priority = 1)
    @Description("Open Category From Home page Using Title Link.")
    @Feature("Category")
    public void openCategoryFromHomepageUsingTitleLink() {
        adminHomePage.clickCategoriesTxtLink();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 2)
    @Description("Open Category From Home Page Using Icon Button.")
    @Feature("Category")
    public void openCategoryFromHomePageUsingIconButton() {
        adminHomePage.backToAdminPage();
        adminHomePage.clickCategoriesIconBtn();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 3)
    @Description("Open Category From Home Page Using Category URL, User should be Authorized.")
    @Feature("Category")
    public void openCategoryWithUsingURLIfUserAuthorized() {
        categoryPage.backToCategoryPage();
        categoryPage.checkURLCategoryPage();
    }

    @Test(priority = 4)
    @Description("Open Category From Home Page Using Category URL, User should be AnAuthorized.")
    @Feature("Category")
    public void openCategoryWithUsingURLIfUserUnauthorized() {
        adminHomePage.clickLogoutBtn();
        categoryPage.backToCategoryPage();
        loginPage.checkLoginUrlPage();
    }
}
