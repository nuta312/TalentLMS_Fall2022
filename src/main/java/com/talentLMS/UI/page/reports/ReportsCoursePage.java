package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * @author Kutbolsun Toktonazarov
 */

public class ReportsCoursePage extends BasePage {

    @FindBy(xpath = "//td[@class=' tl-align-left hidden-phone']")
    public List<WebElement> webTableOfCategory;

    @FindBy(xpath = "//span[contains(text(),'New Courses Name ')]")
    public WebElement courseText;

    @FindBy(xpath = "//td[contains(text(),'1')]")
    public WebElement assignedLearnersText;

    @FindBy(xpath = "//td[contains(text(),'-')]")
    public WebElement completedLearnersText;

    @FindBy(xpath = "//i[@alt='Reports']")
    public WebElement reportsBtn;

    @FindBy(xpath = "//td[@class=' tl-align-left']")
    public List<WebElement> webTableOfCourse;

    public ReportsCoursePage clickReportsBtn(){
        elementActions.click(reportsBtn);
        return this;
    }
    public ReportsCoursePage listOfCourses() {

        for (WebElement list : webTableOfCourse) {
            System.out.println(list.getText());
            if(list.getText().equals("ItHelper")) {
                Assert.assertEquals(list.getText(), "ItHelper");
            }
        }
        return this;
    }
    public  ReportsCoursePage listOfCategories() {
        for (WebElement list : webTableOfCategory) {
            System.out.println(list.getText());
            if (list.getText().equals("Samples")) {
                Assert.assertEquals(list.getText(), "Samples");
            }
        }
        return this;
    }
}