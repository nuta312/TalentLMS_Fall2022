package uiTests.login;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.page.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class CoursesTest extends BaseUiTest { @BeforeMethod
public void openLoginPage(){



}


    @Test
    @Description("Verify that user can login with valid credentials")
    @Feature("Login")
    public void createNewUserTest(){

        // TODO
    }

    @Test(description = "Click to Add coreses button")

    public void  createNewCourse(){
//        loginPage.fillUpUsernameAndPassword("amanzadr", "amanzadr");
        addCoursesPage.clickAddCourses1();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://justtestforaman.talentlms.com/course/create");
        addCoursesPage.VerifyCourseName().fillCategoryAndSample().fillUpDescription();
        Assert.assertEquals(addCoursesPage.activeCheckBox.getText(), "Active");
        addCoursesPage.saveCourseBtn();



    }
}
