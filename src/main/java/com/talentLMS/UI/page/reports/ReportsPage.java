package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Belek Baratov
 */
public class ReportsPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(), 'Reports')]")
    public WebElement reportsBtn;

    public ReportsPage openReportsPage(){
        elementActions.click(reportsBtn);
        return this;
    }
}
