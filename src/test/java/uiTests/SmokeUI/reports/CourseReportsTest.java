package uiTests.SmokeUI.reports;

import com.talentLMS.UI.dataProviders.ConfigReader;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;
/**
 * @author Kutbolsun Toktonazarov
 */
public class CourseReportsTest extends BaseUiTest {

    @Test(priority = 0)
    @Description("Verify that Admin can click Reports")
    @Feature("Reports")
    public void enterReportTest(){
        adminHomePage.clickReportsBtn();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/index");
    }

    @Test (priority = 1)
    @Description("Verify that Admin can click Course Reports")
    @Feature("Course Reports")
    public void enterCourseReportsTest(){
        reportsPage.clickCourseReportsBtn();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/course");

    }

    @Test(priority = 2)
    @Description("Verify that Admin can see Course Report result")
    @Feature("Check Course Reports")
    public void checkCourseReportsTest(){
        coursePage.listOfCourses();
        coursePage.listOfCategories();
        coursePage.clickReportsBtn();
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/courseinfo/id:187");
        webElementActions.pause(6000);


    }

}
