package uiTests.coursesTest;
import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;
public class CoursesTest extends BaseUiTest {
    @BeforeMethod
    public void openLoginPage() {
    }
    @Test
    @Description("Verify that user can login with valid credentials")
    @Feature("Login")
    public void createNewAddTest() {
        // TODO
    }
    @Test(priority = 1,description = "Fill the name")

    public void createNewName() {
        addCoursesPage.clickAddCourses1();
        addCoursesPage.VerifyCourseName();
        String exeptedText = "New Courses Name";
        Assert.assertTrue(exeptedText.contains(addCoursesPage.inputName.getText()));
    }

    @Test(priority = 2,description = "Fill the Category and Sample")
    public void createCategoryAndSample() {
       addCoursesPage.fillCategoryAndSample();
        String exeptedText2 = "dog";
        Assert.assertTrue(exeptedText2.contains(addCoursesPage.sampleCheck.getText()));
    }

    @Test(priority = 3,description = "Create new description")
    public void createNewDescription() {
        addCoursesPage.fillUpDescription();
        String exeptedText1 = "This is the best courses";
        Assert.assertTrue(exeptedText1.contains(addCoursesPage.description.getText()));
    }
    @Test(priority = 4,description = "Fill the code and prise")
    public void createNewCodeAndPrise(){
        Assert.assertEquals(addCoursesPage.activeCheckBox.getText(), "Active");
        addCoursesPage.fillCodeAndPrise();
    }
    @Test(priority = 5,description = "Check the button save new courses")
    public void saveCourseBtnBackToCoursesPage(){
        addCoursesPage.saveCourseBtn().backToCoursesPage();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/course/index");
    }
    @Test(priority = 6,description = "Delete other courses")
    public void deleteCourses(){
//        addCoursesPage.deleteCourses();
    }



    @Test(priority = 8,description = "Click to Add courses button Negative")

    public void createNewCourseNegative() {
        addCoursesPage.openHomePage1();
        addCoursesPage.clickAddCourses1();
        addCoursesPage.VerifyCourseNameNeg();
        addCoursesPage.saveCourseBtn();
        String exeptedText1 = "'Course name' is required";
        Assert.assertTrue(exeptedText1.contains(addCoursesPage.containsEx.getText()));
        addCoursesPage.VerifyCourseName();
        addCoursesPage.fillUpDescription();
        addCoursesPage.fillCodeAndPrise1();
        addCoursesPage.saveCourseBtn();
        String exeptedText2 = "'Course code' cannot exceed 20 characters";
        Assert.assertTrue(exeptedText2.contains(addCoursesPage.containsEx2.getText()));
        driver.close();
}
}
