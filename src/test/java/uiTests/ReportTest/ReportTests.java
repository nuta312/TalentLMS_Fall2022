package uiTests.ReportTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;
/**
 * @author Mukashev Atai
 */
@Epic("report")
public class ReportTests extends BaseUiTest {

    @Test

    public void clickReports(){
        webElementActions.click(reportPage.reportBtn);
        webElementActions.pause(3000);
    }

    @Test(priority = 1, description = "Verify that Admin can click yesterday button ")
    @Feature("report")
    public void clickYesterday() {
        webElementActions.click(reportPage.yesterdayBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 2, description = "Verify that Admin can click today button ")
    @Feature("report")
    public void clickToday() {
        webElementActions.click(reportPage.todayBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 3, description = "Verify that Admin can click week button ")
    @Feature("report")
    public void clickWeek() {
        webElementActions.click(reportPage.weekBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");

    }

    @Test(priority = 4, description = "Verify that Admin can click month button ")
    @Feature("report")
    public void clickMonth() {
        webElementActions.click(reportPage.monthBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 5, description = "Verify that Admin can click year button ")
    @Feature("report")
    public void clickYear() {
        webElementActions.click(reportPage.yearBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 6, description = "Verify that Admin can click period button ")
    @Feature("report")
    public void clickPeriod() {
        webElementActions.click(reportPage.periodBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 7, description = "Verify that Admin can click Infographics button ")
    @Feature("report")
    public void clickInfographics() {
        webElementActions.click(reportPage.InfographicsBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/infographics");
    }

    @Test(priority = 8, description = "Verify that Admin can click Overview button ")
    @Feature("report")
    public void clickOverview() {
        webElementActions.click(reportPage.OverviewBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 9, description = "Verify that Admin can click Training Matrix button ")
    @Feature("report")
    public void clickTrainingMatrix() {
        webElementActions.click(reportPage.TrainingMatrixBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/trainingmatrix");
    }

    @Test(priority = 10, description = "Verify that Admin can click Timeline button ")
    @Feature("report")
    public void clickTimeline() {
        webElementActions.click(reportPage.TimelineBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/timeline");
    }
}