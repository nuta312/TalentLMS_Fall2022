package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage extends BasePage {

    @FindBy(xpath = "//td[contains(text(),'Samples')]")
    public WebElement categoryText;

    @FindBy(xpath = "//span[contains(text(),'New Courses Name ')]")
    public WebElement courseText;

    @FindBy(xpath = "//td[contains(text(),'1')]")
    public WebElement assignedLearnersText;

    @FindBy(xpath = "//td[contains(text(),'-')]")
    public WebElement completedLearnersText;

    @FindBy(xpath = "//i[@alt='Reports']")
    public WebElement reportsBtn;

    public CoursePage clickReportsBtn(){
        elementActions.click(reportsBtn);
        return this;
    }
}

