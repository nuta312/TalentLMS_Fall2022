package uiTests.RegressionUI.users;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddUserTest extends BaseUiTest {
    @BeforeMethod
    public void setUp() {
        userPage.clickAddUserBtn();

    }

    @Test(priority = 1)
    @Description("Verify  first name input field ")
    @Feature("Add user")
    public void FirstNameInputField() {
        webElementActions.pause(5000);
        String firstName = "Meder";
        webElementActions.sendKeys(addUserPage.firstNameInput, "Meder");
        String actualFirstName = addUserPage.firstNameInput.getAttribute("value");
        assertEquals(actualFirstName, "Meder");
        assertEquals(addUserPage.FirstNameInputFieldCounter.getText(), "45");
        addUserPage.clickHomeBtn();

    }

    @Test(priority = 2)
    @Description("Verify last name input field ")
    @Feature("Add user")
    public void lastNameInputField() {
        webElementActions.pause(5000);
        String lastName = "Boobekov";
        webElementActions.sendKeys(addUserPage.lastNameInput, lastName);
        String actualLastName = addUserPage.lastNameInput.getAttribute("value");
        assertEquals(actualLastName, lastName);
        assertEquals(addUserPage.lastNameInputFieldCounter.getText(), "42");
        addUserPage.clickHomeBtn();
    }


    @Test(priority = 3)
    @Description("Verify email address input field valid email ")
    @Feature("Add user")
    public void testValidEmailAddress() {
        webElementActions.pause(3000);
        webElementActions.sendKeys(addUserPage.emailInput, "Toktorov@gmail.com");
        assertEquals(addUserPage.emailAddressInputFieldCounter.getText(), "132");
        addUserPage.clickHomeBtn();

    }

    @Test(priority = 4)
    @Description("Verify email address input field invalid email ")
    @Feature("Add user")
    public void testInvalidEmailAddress() {
        webElementActions.sendKeys(addUserPage.emailInput, "Toktotov@gmailcom");
        webElementActions.pause(3000);
        addUserPage.clickSubmitAddUserBtn();
        String expectedInvalidEmail = "This is not a valid 'Email address'";
        String actualErrorEmailMessage = addUserPage.emailErrorMess.getText();
        assertEquals(actualErrorEmailMessage, expectedInvalidEmail);
        addUserPage.clickHomeBtn();
    }

    @Test(priority = 5)
    @Description("Verify admin can delete and put new user name ")
    @Feature("Add user")
    public void userNameInputField() {
        webElementActions.pause(3000);
        webElementActions.sendKeysWithClear(addUserPage.usernameInput, "BMB500");
        assertEquals(addUserPage.userNameInputFieldCounter.getText(), "144");
        addUserPage.clickHomeBtn();
    }

    @Test(priority = 6)
    @Description("Verify password input field ")
    @Feature("Add user")
    public void passwordInputField() {
        webElementActions.pause(3000);
        webElementActions.sendKeys(addUserPage.passwordInput, "Meder312!");
        assertEquals(addUserPage.passwordInputFieldCounter.getText(), "21");
        addUserPage.clickHomeBtn();

    }

    @Test(priority = 7)
    @Description("Verify that administrator can select user type ")
    @Feature("Add user")
    public void addUserType() {
        addUserPage.createNewUser();
        webElementActions.click(addUserPage.selectBtn);
        addUserPage.selectAdminType();
        webElementActions.pause(3000);
        assertEquals(addUserPage.selectChosenUserType.getText(), "SuperAdmin");
        assertTrue(addUserPage.selectChosenUserType.isDisplayed());
        addUserPage.clickHomeBtn();


    }

    @Test(priority = 8)
    @Description("Verify that administrator can select language ")
    @Feature("Add user")
    public void chooseLanguage() {
        addUserPage.createNewUser();
        webElementActions.click(addUserPage.selectBtn3);
        addUserPage.selectLanguage();
        assertTrue(addUserPage.userLanguage.isDisplayed());
        assertEquals(addUserPage.selectChosenLanguage.getText(), "Deutsch (German)");
        addUserPage.clickHomeBtn();


    }

    @Test(priority = 9)
    @Description(" Check active checkbox ")
    @Feature("Add user")
    public void checkActiveBtn() {
        addUserPage.createNewUser();
        addUserPage.clickActiveBtn();
        assertTrue(addUserPage.checkedActiveBox.isEnabled());
        addUserPage.clickHomeBtn();

    }

    @Test(priority = 10)
    @Description("Verify that administrator can checkbox exclude from emails  on the add user page")
    @Feature("Add user")
    public void checkExcludeFromEmails() {
        addUserPage.createNewUser();
        addUserPage.clickExcludeBtn();
        assertTrue(addUserPage.checkedExcludeFromEmailsBox.isEnabled());
        addUserPage.clickHomeBtn();

    }

    @Test(priority = 11)
    @Description("Verify that administrator can click cancel button  on the add user page")
    @Feature("Add user")
    public void clickCancelButton() {
        webElementActions.click(addUserPage.canselSubmitBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/user/index");

    }

    @Test(priority = 12)
    @Description("Verify upload profile picture ")
    @Feature("Add user")
    public void uploadProfilePicture() {
        assertTrue(addUserPage.uploadPicture.isDisplayed());
        addUserPage.clickHomeBtn();
    }


    @Test(priority = 13)
    @Description("Verify that administrator can create a new user ")
    @Feature("Add user")
    public void AddNewUser() {
        addUserPage.createNewUser();
        webElementActions.click(addUserPage.selectBtn);
        addUserPage.selectAdminType();
        webElementActions.click(addUserPage.selectBtn3);
        webElementActions.pause(3000);
        addUserPage.selectLanguage();
        addUserPage.clickSubmitAddUserBtn();
        webElementActions.pause(3000);

        assertTrue(addUserPage.successMessage.isDisplayed());
        assertEquals(addUserPage.coursePage.getText(), "Courses");

    }
}
