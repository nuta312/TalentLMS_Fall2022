package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import io.qameta.allure.Epic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Begaiym Matissakova
 */

@Epic("Users")

public class InstructorHomePage extends BasePage {

    @FindBy(xpath = "(//b[@class='caret'])[1]")
    public WebElement dropDownBtn;
    @FindBy(xpath = "(//i[@class='tl-select-icon'])[1]")
    public WebElement instructorType;

    @FindBy(xpath = "//b[contains(text(),'Instructor')]")
    public WebElement instructorTypeText;

    // IconPlays
    @FindBy(xpath = "(//i[@class='icon-info-circle tl-course-info'])[1]")
    public WebElement newCoursesInfo;

    @FindBy(xpath = "//span[@title='New Courses Name (143241)']")
    public WebElement newCoursesNameBtn;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-course-info'])[2]")
    public WebElement itHelperInfoOne;

    @FindBy(xpath = "(//span[@title='ItHelper'])[1]")
    public WebElement itHelperOneBtn;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-course-info'])[3]")
    public WebElement itHelperInfoTwo;

    @FindBy(xpath = "(//span[@title='ItHelper'])[2]")
    public WebElement itHelperTwoBtn;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-course-info'])[4]")
    public WebElement willSchoolInfo;

    @FindBy(xpath = "//div[@id='tl-course-info-modal-description']")
    public WebElement willSchoolAssert;

    @FindBy(xpath = "//a[text()='Close']")
    public WebElement popUpClose;

    @FindBy(xpath = "(//span[text()='will school']")
    public WebElement willSchoolBtn;

    @FindBy(xpath = "//input[@placeholder='Search my courses']")
    public WebElement inputFields;

    @FindBy(xpath = "(//i[@class='icon-remove'])[4]")
    public WebElement iconX;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeButton;
    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement coursesBtn;

    @FindBy(xpath = "//a[contains(text(), 'Add course')]")
    public WebElement addCoursesTextBtn;

    @FindBy(xpath = "//i[@class='icon-book tl-icon-stack-content']")
    public WebElement coursesSignIcon;

    @FindBy(xpath = "//a[contains(text(),'Groups')]")
    public WebElement groupsSignBtn;

    @FindBy(xpath = "//a[contains(text(), 'Add group')]")
    public WebElement addGroupText;

    @FindBy(xpath = "//i[@class='icon-users tl-icon-stack-content']")
    public WebElement groupsBtnIcon;

    @FindBy(xpath = "//i[@class='icon-monitor tl-icon-stack-content']")
    public WebElement conferencesBtnIcon;

    @FindBy(xpath = "//a[contains(text(),'Conferences')]")
    public WebElement conferencesSignBtn;

    @FindBy(xpath = "//a[contains(text(), 'Add conference')]")
    public WebElement addConferenceText;

    @FindBy(xpath = "//a[contains(text(),'Discussions')]")
    public WebElement discussionsSignBtn;

    @FindBy(xpath = "//a[contains(text(), 'Add discussion')]")
    public WebElement addDiscussionText;

    @FindBy(xpath = "//i[@class='icon-comment tl-icon-stack-content']")
    public WebElement discussionsBtnIcon;
    @FindBy(xpath = "//a[contains(text(),'Calendar')]")
    public WebElement calendarSignBtn;

    @FindBy(xpath = "//a[contains(text(), 'Add event')]")
    public WebElement addEventText;

    @FindBy(xpath = "//i[@class='icon-calendar tl-icon-stack-content']")
    public WebElement calendarBtnIcon;

    @FindBy(xpath = "//a[@class='brand']//img[@class='avatar-square']")
    public WebElement talentLMSImg;

    @FindBy(xpath = "//input[@placeholder='Search my courses']")
    public WebElement searchField;

    @FindBy(xpath = "//i[@class='icon-layers tl-icon20']")
    public WebElement iconName;

    @FindBy(xpath = "//a[@class ='dropdown-toggle tl-dashboard-sorting pull-right btn']//span[contains(text(),'Name')]")
    public WebElement nameTextBtn;

    @FindBy(xpath = "//a[text()='Last updated']")
    public WebElement lastUpdated;

    @FindBy(xpath = "//i[@class='icon-th-list tl-icon17']")
    public WebElement asListBtn;

    @FindBy(xpath = "//a[contains(text(),'General')]")
    public WebElement generalAssertForList;

    @FindBy(xpath = "//i[@class='icon-th tl-icon17']")
    public WebElement asTableBtn;

}

