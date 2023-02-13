package uiTests.reports;
/**
 * @author Belek Baratov
 */
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class userReportsTest extends BaseUiTest {
    @Test(priority = 1)
    @Description("Verify that reports button clickable")
    @Feature("Reports")
    public void clickReportsBtn(){
        adminHomePage.clickReportsBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/index");
        webElementActions.pause(2000);
    }

    @Test(priority = 2)
    @Description("Verify that userReports button clickable")
    @Feature("Reports")
    public void clickUserReportsBtn(){
        userReportsPage.clickUserReportsBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/user");
    }

}
