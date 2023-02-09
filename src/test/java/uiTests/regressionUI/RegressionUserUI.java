package uiTests.regressionUI;

import com.talentLMS.UI.dataProviders.ConfigReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegressionUserUI extends BaseUiTest {
    @BeforeMethod
    public void openLoginPage(){
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("alibinali", "alibinali");
        adminHomePage.clickAdminUserBtn();
    }

    @Test(description = "C44")
    public void createNewUserInActive(){
        addUserPage.clickHomeBtn();
        userPage.clickAddUserBtn();
        addUserPage.createNewUser();
        addUserPage.clickActiveBtn();
        addUserPage.clickSubmitAddUserBtn();
        assertTrue(addUserPage.successMessage.isDisplayed());
        assertEquals(addUserPage.coursePage.getText(),"Courses");
    }
    @Test(description = "C44")
    public void createNewUser(){
        userPage.clickAddUserBtn();
        try {
            int i = 1;
            do {

                addUserPage.createNewUser()
                        .clickExcludeBtn()
                        .clickSubmitAddUserBtn()
                        .clickHomeBtn();
                adminHomePage.clickAdminAddUserBtn();

                ++i;
            } while(i <= 5);
        } catch (Exception e){

            String except = "You have just reached your active users limit. To add more users, ";
            assertTrue(addUserPage.errMessageLimit.getText().contains(except));

        }
    }
    @Test
    public void testVerifyColumnsOfUserList(){
        assertEquals(userPage.columnUser.getText(),"USER");
        assertEquals(userPage.columnEmail.getText(),"EMAIL");
        assertEquals(userPage.columnUserType.getText(),"USER TYPE");
        assertEquals(userPage.columnRegistration.getText(),"REGISTRATION");
        assertEquals(userPage.columnLastLogin.getText(),"LAST LOGIN");
        assertEquals(userPage.columnOptions.getText(),"OPTIONS");
    }
}
