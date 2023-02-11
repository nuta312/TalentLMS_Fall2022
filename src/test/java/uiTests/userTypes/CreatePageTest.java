package uiTests.userTypes;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import uiTests.BaseUiTest;
import static org.testng.Assert.*;
/**
 *@authorAidai K
 */
public class CreatePageTest extends BaseUiTest {
    @Test(enabled=false)
    @Description("Verify that Administrator can create Administrator")
    @Feature("UserTypes")
    public void createAdministrator(){
        createPage.createAdministrator();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/acl/create");
        for(WebElement e: createPage.userTypesList){
            assertTrue(e.getText().equals(createPage.nameTypesOfUsers.getText()));
        }
    }
    @Test
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
     * Test for negative test cases
     */

    @Test(enabled=false)
    @Description("Verify that user can create Learner and click learner Permissions checkboxes and also can click other Permissions checkboxes")
    @Feature("UserTypes")
    public void combinationCheckBoxes(){
        createPage.combinationsInvalidCheckBox();
        for (WebElement e: createPage.userTypesList){
            assertTrue(e.getText().contains(createPage.roleLearner.getText()));
        }
    }
}

