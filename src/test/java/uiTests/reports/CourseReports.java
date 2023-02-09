package uiTests.reports;

import com.talentLMS.UI.dataProviders.ConfigReader;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import static org.testng.Assert.*;
git
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
            driver.navigate().to(ConfigReader.getProperty("qa_env"));
            loginPage.fillUpUsernameAndPassword("kutbolsunt", "mansata11");
            adminHomePage.clickReportsBtn();
            assertEquals(driver.getCurrentUrl(),"https://nomadtest123.talentlms.com/reports/index");
        }

        @Test (priority = 1)
        @Description("Verify that Admin can click Course Reports")
        @Feature("Course Reports")
        public void enterCourseReportsTest(){
            reportsPage.clickCourseReportsBtn();
            assertEquals(driver.getCurrentUrl(),"https://nomadtest123.talentlms.com/reports/course");

        }


    }

}
