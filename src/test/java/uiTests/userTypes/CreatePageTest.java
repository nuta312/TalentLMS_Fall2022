package uiTests.userTypes;
import com.talentLMS.UI.dataProviders.ConfigReader;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import uiTests.BaseUiTest;
import static org.testng.Assert.*;

public class CreatePageTest extends BaseUiTest {
    @BeforeMethod
    public void openHomePage(){
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/acl/create");
    }

    @Test(enabled=false)
    @Description("Verify that Administrator can create Administrator")
    @Feature("UserTypes")
    public void createAdministrator(){
        createPage.createAdministrator();
        for(WebElement e: createPage.userTypesList){
            assertTrue(e.getText().contains(createPage.nameTypesOfUsers.getText()));
        }
    }

    @Test(enabled=false)
    @Description("Verify that Administrator can create Instructor")
    @Feature("UserTypes")
    public void createInstructor(){
        createPage.createInstructor();
    }

    @Test(enabled=false)
    @Description("Verify that Administrator can create Learner")
    @Feature("UserTypes")
    public void createLearner(){
        createPage.createLearner();
    }

    /**
     * Tests for negative test cases
     */
    @Test(enabled=false)
    @Description("Verify that user can create name using numbers")
    @Feature("UserTypes")
    public void createUserTypeWithInvalidName(){
        createPage.createNegativeUserTypesName("5");
        for(WebElement e: createPage.userTypesList){
            assertTrue(e.getText().contains(createPage.nameTypesOfUsers.getText()));
        }
    }

    @Test
    @Description("Verify that user can create Learner and click learner Permissions checkboxes and also can click other Permissions checkboxes")
    @Feature("UserTypes")
    public void combinationCheckBoxes(){
        createPage.combinationsInvalidCheckBox();
        for (WebElement e: createPage.userTypesList){
            assertTrue(e.getText().contains(createPage.roleLearner.getText()));
        }
    }
}
