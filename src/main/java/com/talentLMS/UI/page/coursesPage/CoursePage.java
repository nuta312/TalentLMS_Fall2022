package com.talentLMS.UI.page.coursesPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage extends BasePage {

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
    public WebElement clickBtnCourse;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement clickCheckBoxBtn;

    @FindBy(xpath = "(//div[@class='btn-group'])[2]")
    public WebElement clickMassActionsBtn;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement clickBtnSearch;

    @FindBy(xpath = "//i[@class='icon-filter']")
    public WebElement clickBtnFilter;

    @FindBy(xpath = "//i[@class='icon-download tl-icon19']")
    public WebElement clickBtnDownload;

    @FindBy(xpath = "(//i[@class='icon-ellipsis-h tl-table-operations-icon'])[1]")
    public WebElement clickBtnOptions;

    @FindBy(xpath = "(//div[@class='tl-table-operations touchable'])[1]")
    public WebElement clickOptions;

    @FindBy(xpath = "(//i[@title='Reports'])[1]")
    public WebElement clickReportBtn;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement goToBack;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[3]")
    public WebElement goBackToCourse;

    @FindBy(xpath = "(//i[@title='Edit'])[1]")
    public WebElement clickEditBtn;

    @FindBy(xpath = "//a[@title='Courses']")
    public WebElement backCourses;

    @FindBy(xpath = "(//i[@title='Delete'])[1]")
    public WebElement clickDeleteBtn;

    @FindBy(xpath = "(//a[@class='btn btn-danger'])[1]")
    public WebElement confirmDelete;

    @FindBy(xpath = "(//i[@title='Go to course'])[1]")
    public WebElement clickGoToCourseBtn;

    @FindBy(xpath = "//a[contains(text(),'Add course')]")
    public WebElement addCourseBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement addCourseName;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement addSelect;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public WebElement addSamples;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement addDescription;

    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveSubmit;

    public CoursePage createAddCourse(){
        elementActions.sendKeys(addCourseName,"ItHelper").click(addSelect).click(addSamples)
                .sendKeys(addDescription,"Hello world").click(saveSubmit);
        return this;
    }




}
