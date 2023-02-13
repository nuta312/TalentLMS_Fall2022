package com.talentLMS.UI.page;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.*;

/**
 * @author Maral Dyushekeeva
 */

public class AdminHomePage extends BasePage {

    String adminHomePageURL = "https://nuta1bema.talentlms.com/dashboard";
    @FindBy(xpath = "(//a[contains(text(),'Users')])[1]")
    public WebElement adminUsersBtn;

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement adminAddUserBtn;

    @FindBy(xpath = "//i[@title='Log out']")
    private WebElement logOutBtn;

    @FindBy(xpath = "//a[contains(text(),'Categories')]")
    private WebElement categoriesTxtBtn;

    @FindBy(xpath = "//i[@class='icon-menu tl-icon-stack-content']")
    private WebElement categoriesIconBtn;

    @FindBy(xpath = "//a[contains(text(),'Add category')]")
    private WebElement addCategoryBtn;
    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    public WebElement reports;

    public AdminHomePage clickCategoriesTxtLink() {
        elementActions.click(categoriesTxtBtn);
        return this;
    }

    public AdminHomePage clickCategoriesIconBtn() {
        elementActions.click(categoriesIconBtn);
        return this;
    }

    public AdminHomePage clickLogoutBtn() {
        elementActions.click(logOutBtn);
        return this;
    }

    public AdminHomePage backToAdminPage() {
        elementActions.moveToUrlPage(adminHomePageURL);
        return this;
    }

    public AdminHomePage clickAddCategoryBtn() {
        elementActions.click(addCategoryBtn);
        return this;
    }

    public AdminHomePage clickAdminUserBtn() {
        elementActions.click(adminUsersBtn);
        return this;
    }

    public AdminHomePage clickAdminAddUserBtn() {
        elementActions.click(adminAddUserBtn);
        return this;
    }

    public AdminHomePage clickReportsBtn() {
        elementActions.click(reports);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-bold-link']//a[contains(text(),'Groups')]")
    public WebElement groupsBtn;

    public AdminHomePage clickGroupsBtn() {
        elementActions.click(groupsBtn);
        return this;

    }

}
