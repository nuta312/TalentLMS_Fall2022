package com.talentLMS.UI.page.userTypes;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.BasePage;
import com.talentLMS.UI.page.LoginPage;
import jdk.jfr.Description;
import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @author Dastan Mirulanov
 */
public class UserTypes extends BasePage {

    public String userTypesURL = "https://nuta1bema.talentlms.com/acl/index";

    @FindBy(xpath = "//a[normalize-space()='User types']")
    public WebElement userTypesTitleLink;

    @FindBy(xpath = "//i[@class='icon-vcard tl-icon-stack-content']")
    public WebElement userTypesIconLink;

    @FindBy(xpath = "//a[normalize-space()='Add user type']")
    public WebElement addUserTypeLink;

    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchUserTypesInput;

    @FindBy(xpath = "//a[@class='dt-button']")
    public WebElement saveUserTypesBtn;

    @FindBy(xpath = "//th[@aria-label='Name']")
    public WebElement sortByName;

    @FindBy(xpath = "//th[@aria-label='Administrator']")
    public WebElement sortByAdministrator;

    @FindBy(xpath = "//th[@aria-label='Instructor']")
    public WebElement sortByInstructor;

    @FindBy(xpath = "//th[@aria-label='Learner']")
    public WebElement sortByLearner;

    @FindBy(xpath = "//span[@title='Admin-Type']")
    public WebElement typeOfAdminInList;

    @FindBy(xpath = "//span[@title='Learner-Type']")
    public WebElement typeOfLearnerInList;

    @FindBy(xpath = "//span[@title='Trainer-Type']")
    public WebElement typeOfTrainerInList;

    @FindBy(xpath = "//div[@class='tl-table-operations-trigger touchable active']//a[@title='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//div[@class='tl-table-operations-trigger touchable active']//a[@title='Delete']")
    public WebElement deleteBtn;


    public void openUserTypesPage() {
        elementActions.click(userTypesTitleLink);
    }

    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();
        AdminHomePage adminHomePage = new AdminHomePage();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();
        elementActions.click(userTypesTitleLink);
        elementActions.pause(3000);
        elementActions.click(adminHomePage.logoLinkToHomePage);
        elementActions.pause(3000);
        elementActions.click(userTypesIconLink);
    }


}
