package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTests extends BaseUiTest{


    @Test(description = "Verify user can not login with invalid username")
    public void loginWithInvalidUsernameTest(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("testName","HelloAAAAsds");
        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
        webElementActions.pause(5000);
    }
}
