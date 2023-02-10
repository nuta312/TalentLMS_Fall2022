package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoursePage extends BasePage {

    @FindBy(xpath = "//tr[@role='row']")
    public List<WebElement> categoryText;

//    @FindBy(xpath = "//span[contains(text(),'New Courses Name ')]")
//    public WebElement courseText;
//
//    @FindBy(xpath = "//td[contains(text(),'1')]")
//    public WebElement assignedLearnersText;
//
//    @FindBy(xpath = "//td[contains(text(),'-')]")
//    public WebElement completedLearnersText;

    @FindBy(xpath = "//i[@alt='Reports']")
    public WebElement reportsBtn;

    public CoursePage getListOfCourse(){
        for (WebElement listOfCourses:categoryText) {
            elementActions.moveToElement(listOfCourses);
        }
        return getListOfCourse();
    }

    public CoursePage clickReportsBtn(){
        elementActions.click(reportsBtn);
        return this;
    }
}

