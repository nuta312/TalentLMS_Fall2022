package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * @author Kutbolsun Toktonazarov
 */

public class ReportsPage extends BasePage {
    @FindBy(xpath = "//div[@class='tl-ellipsis']//a[contains(text(),'Course reports')]")
    public WebElement courseReports;



    public ReportsPage clickCourseReportsBtn(){
        elementActions.click(courseReports);
        return this;
    }



}
