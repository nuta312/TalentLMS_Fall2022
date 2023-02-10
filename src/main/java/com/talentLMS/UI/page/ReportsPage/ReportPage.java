package com.talentLMS.UI.page.ReportsPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Mukashev Atai
 */

public class ReportPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),  'Reports' )]")
    public WebElement reportBtn;

    @FindBy(xpath = "//a[@data-period='yesterday']")
    public WebElement yesterdayBtn;

    @FindBy(xpath = "//a[@data-period='today']")
    public WebElement todayBtn;

    @FindBy(xpath = "//a[@data-period='week']")
    public WebElement weekBtn;

    @FindBy(xpath = "//a[@data-period='month']")
    public WebElement monthBtn;

    @FindBy(xpath = "//a[@data-period='year']")
    public WebElement yearBtn;

    @FindBy(xpath = "//a[@data-period='period']")
    public WebElement periodBtn;

    @FindBy(xpath = "//a[contains(text(), 'Infographics')]")
    public WebElement InfographicsBtn;

    @FindBy(xpath = "//a[contains(text(), 'Training matrix')]")
    public WebElement TrainingMatrixBtn;

    @FindBy(xpath = "//a[contains(text(), 'Overview')]")
    public WebElement OverviewBtn;

    @FindBy(xpath = "//a[contains(text(), 'Timeline')]")
    public WebElement TimelineBtn;



}
