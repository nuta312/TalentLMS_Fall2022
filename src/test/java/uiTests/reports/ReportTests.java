package uiTests.reports;


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
        webElementActions.click(reportsPage.reportBtn);
        webElementActions.pause(3000);
    }

    @Test(priority = 1, description = "Verify that Admin can click yesterday button ")
    @Feature("report")
    public void clickYesterday() {
        webElementActions.click(reportsPage.yesterdayBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 2, description = "Verify that Admin can click today button ")
    @Feature("report")
    public void clickToday() {
        webElementActions.click(reportsPage.todayBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 3, description = "Verify that Admin can click week button ")
    @Feature("report")
    public void clickWeek() {
        webElementActions.click(reportsPage.weekBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");

    }

    @Test(priority = 4, description = "Verify that Admin can click month button ")
    @Feature("report")
    public void clickMonth() {
        webElementActions.click(reportsPage.monthBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 5, description = "Verify that Admin can click year button ")
    @Feature("report")
    public void clickYear() {
        webElementActions.click(reportsPage.yearBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 6, description = "Verify that Admin can click period button ")
    @Feature("report")
    public void clickPeriod() {
        webElementActions.click(reportsPage.periodBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 7, description = "Verify that Admin can click Infographics button ")
    @Feature("report")
    public void clickInfographics() {
        webElementActions.click(reportsPage.InfographicsBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/infographics");
    }

    @Test(priority = 8, description = "Verify that Admin can click Overview button ")
    @Feature("report")
    public void clickOverview() {
        webElementActions.click(reportsPage.OverviewBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/index");
    }

    @Test(priority = 9, description = "Verify that Admin can click Training Matrix button ")
    @Feature("report")
    public void clickTrainingMatrix() {
        webElementActions.click(reportsPage.TrainingMatrixBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/trainingmatrix");
    }

    @Test(priority = 10, description = "Verify that Admin can click Timeline button ")
    @Feature("report")
    public void clickTimeline() {
        webElementActions.click(reportsPage.TimelineBtn);
        webElementActions.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/reports/timeline");
    }
}