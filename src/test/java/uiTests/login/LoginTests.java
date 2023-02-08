package uiTests.login;

import com.talentLMS.UI.dataProviders.ConfigReader;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

@Epic("Login")
public class LoginTests extends BaseUiTest {


    @Test
    @Description("Verify that user can login with valid credentials")
    @Feature("Login")
    public void createNewUserTest(){
        // TODO
    }
}
