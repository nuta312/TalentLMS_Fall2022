package uiTests.userTypes;
import io.qameta.allure.*;
import org.testng.annotations.*;
import uiTests.BaseUiTest;
import static org.testng.Assert.*;
/**
 *@authorAidaiK
 */
public class CreatePageTest extends BaseUiTest {

    @Test(priority = 1)
    @Description("Verify that Administrator can create Administrator")
    @Feature("UserTypes")
    public void createAdministrator(){
        createPage.createAdministrator();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/acl/create");
//        for(WebElement e: createPage.userTypesList){
//            assertTrue(e.getText().equals(createPage.nameTypesOfUsers.getText()));
//        }
    }
    @Test(priority = 2)
    @Description("Verify that Administrator can create Instructor")
    @Feature("UserTypes")
    public void createInstructor(){
        createPage.clickAddUserBlueBtn();
        createPage.createInstructor();
    }

    @Test(priority = 3)
    @Description("Verify that Administrator can create Learner")
    @Feature("UserTypes")
    public void createLearner(){
        createPage.clickAddUserBlueBtn();
        createPage.createLearner();
    }

    /**
     * Test for negative test cases
     */

    @Test(priority = 5)
    @Description("Verify that user can create Learner and click learner Permissions checkboxes and also can click other Permissions checkboxes")
    @Feature("UserTypes")
    public void combinationCheckBoxes(){
        createPage.clickAddUserBlueBtn();
        createPage.combinationsInvalidCheckBox();
    }
}


