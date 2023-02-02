package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseUiTest{

    @BeforeMethod
    public void openLoginPage(){
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }
    @Test(description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials(){
        loginPage.fillUpUsernameAndPassword("zharkynai0611","myFutureJob");
        assertEquals(adminHomePage.users.getText(),"USERS");
        assertEquals(driver.getCurrentUrl(),"https://digitalnomadstest312.talentlms.com/dashboard");
    }

    @Test(description = "Verify user can not login with invalid username and valid password")
    public void loginWithInvalidUsernameTest(){
        loginPage.fillUpUsernameAndPassword("testName","myFutureJob");
        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.1";
        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
    }

    @Test(description = "Verify that user can not login with valid username and invalid password")
    public void loginWithInvalidPasswordAndValidUsernameTest(){
        loginPage.fillUpUsernameAndPassword("zharkynai0611","WrongPassword");
        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
    }

    @Test(description = "Verify that Admin can create new user in TalentLMS")
    public void createNewUserTest(){
        loginPage.fillUpUsernameAndPassword("zharkynai0611","myFutureJob");
        adminHomePage.clickAddUserBtn();
        assertEquals(driver.getCurrentUrl(),"https://digitalnomadstest312.talentlms.com/user/create");
        addUserPage.createNewUser();
        assertEquals(addUserPage.coursesTab.getText(),"COURSE");
        webElementActions.pause(5000);
    }
}
