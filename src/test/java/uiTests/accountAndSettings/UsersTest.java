package uiTests.accountAndSettings;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class UsersTest extends BaseUiTest {
//    @BeforeMethod
//    public void openLoginPage () {
//        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//    }

    @Test (priority = 1, description = "can i go to Account and Settings page")
    public void gotoAccountAndSettingsPage () {
//        loginPage.fillUpUsernameAndPassword();
        usersAccSetPage.clickAccountAndSettingsBtn();
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/account/basic_index");
    }
    @Test (priority = 2, description = "ckeck sign up drop down menu")
    public void checkDropDownBtns () {
        usersAccSetPage.clickUsersPageBtn();
        usersAccSetPage.clickSignupArrow();
        assertEquals(usersAccSetPage.dropDownText1.getText(), "Direct");
        usersAccSetPage.elementActions.click(usersAccSetPage.dropDownManually);

    }
    @Test (priority = 3, description = "ckeck default user type drop down menu")
    public void checkDropDownBtn () {
        usersAccSetPage.elementActions.click(usersAccSetPage.userTypeArrow);
        assertEquals(usersAccSetPage.dropDownText2.getText(), "Learner-Type");
        usersAccSetPage.elementActions.click(usersAccSetPage.dropDownText2);
    }

    @Test (priority = 4, description = "check the number of days")
    public void checkboxEnable () {
        usersAccSetPage.clickChangeAfterText();
        Assert.assertTrue(usersAccSetPage.passwordChangeAfter.isEnabled());
    }

    @Test (priority = 5, description = "checkbox in password settings is selected")
    public void checkPasswordSettings () {
        usersAccSetPage.fillUsersPasswordSettings();
        Assert.assertFalse(usersAccSetPage.passwordChangeAfter.isSelected());
        Assert.assertFalse(usersAccSetPage.passwordChangeOnFirst.isSelected());
        Assert.assertFalse(usersAccSetPage.lockAccountAfter.isSelected());
    }

    @Test (priority = 6, description = "check the textBox functions")
    public void checkTermsOfService () {
        usersAccSetPage.termsOfService();
        Assert.assertFalse(usersAccSetPage.textArea.isDisplayed());
        assertEquals(usersAccSetPage.textArea.getText(), "Hello World");
    }

    @Test (priority = 7, description = "check the visible user format")
    public void checkVisibleUserFormat () {
        usersAccSetPage.getVisibleUserFormat();
        Assert.assertTrue(usersAccSetPage.firsNameL.isEnabled());
        Assert.assertTrue(usersAccSetPage.firstNameLastName.isEnabled());
        Assert.assertTrue(usersAccSetPage.lastNameF.isEnabled());
        Assert.assertTrue(usersAccSetPage.lastNameFirstName.isEnabled());
        Assert.assertTrue(usersAccSetPage.userName.isEnabled());
    }

    @Test (priority = 8, description = "check the social media checkbox selection")
    public void checkSignUpSocialMedia () {
        usersAccSetPage.getSocialOptions();
        Assert.assertTrue(usersAccSetPage.facebook.isSelected());
        Assert.assertTrue(usersAccSetPage.google.isSelected());
        Assert.assertTrue(usersAccSetPage.linkedIn.isSelected());
    }

    @Test (priority = 9, description = "asd")
    public void checkboxLast () {
        usersAccSetPage.getCheckBoxLast();
        Assert.assertTrue(usersAccSetPage.allowInteractions.isEnabled());
        Assert.assertTrue(usersAccSetPage.shareCertificates.isEnabled());
        Assert.assertTrue(usersAccSetPage.courseRating.isEnabled());
    }

    @Test (priority = 10, description = "Verify save button")
    public void checkTextBoxMsg () {
        usersAccSetPage.getSaveBtn();
        Assert.assertTrue(usersAccSetPage.saveBtn.isEnabled());
    }


}
