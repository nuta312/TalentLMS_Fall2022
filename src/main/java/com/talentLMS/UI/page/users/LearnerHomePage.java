package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Gulzat
 */


public class LearnerHomePage extends BasePage {

    @FindBy(xpath = "//i[@class='icon-th tl-icon17']")
    public WebElement asTableBtn;

    @FindBy(xpath = "(//b[@class='caret'])[1]")
    public WebElement dropDownBtn;

    @FindBy(xpath = "(//i[@class='tl-select-icon'])[2]")
    public WebElement learnerType;

    @FindBy(xpath = "//b[contains(text(),'Learner')]")
    public WebElement learnerTypeText;


    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement homeBtn;

    @FindBy(xpath = "//input[@placeholder='Search my courses']")
    public WebElement inputFields;

    @FindBy(xpath = "(//img[@class='avatar-square'])[5]")
    public WebElement picture;

    @FindBy(xpath = "(//div[@class='item-caption'])[1]")
    public WebElement coursesInProgress;

    @FindBy(xpath = "(//div[@class='item-caption'])[2]")
    public WebElement completedCourses;

    @FindBy(xpath = "(//div[@class='item-caption'])[3]")
    public WebElement trainingTime;

    @FindBy(xpath = "(//div[@class='item-caption'])[4]")
    public WebElement badges;

    @FindBy(xpath = "(//div[@class='item-caption'])[5]")
    public WebElement pointsTwo;

    @FindBy(xpath = "//h3[@class='font-weight-bold']")
    public WebElement myAchievements;

//   //h3[text()='My achievements']

    @FindBy(xpath = "//h3[text()='Leaderboard']")
    public WebElement leaderBoard;
    @FindBy(xpath = "//a[text()='Course catalog']")
    public WebElement coursesCatalogBtn;

    @FindBy(xpath = "//a[contains(text(),'Progress')]")
    public WebElement progressBtn;

    @FindBy(xpath = "//a[@title='Join group']")
    public WebElement joinGroupBtn;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[text()='Join group']")
    public WebElement popUpWindow;

    @FindBy(xpath = "(//a[@class='close'])[1]")
    public WebElement iconClose;

    @FindBy(xpath = "//a[contains(text(),'Discussions')]")
    public WebElement discussionBtn;

    @FindBy(xpath = "//button[text()='Create your first discussion']")
    public WebElement discussionAssert;

    @FindBy(xpath = "//a[text()='Calendar']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//a[contains(text(),'Calendar')]")
    public WebElement calendarAssert;

    //iconPlay

    @FindBy(xpath = "(//i[@class='icon-play'])[1]")
    public WebElement iconPlayNewCourses;

    @FindBy(xpath = "(//i[@class='icon-play'])[2]")
    public WebElement iconPlayItHelper;

    @FindBy(xpath = "(//i[@class='icon-play'])[3]")
    public WebElement iconPlayItHelperTwo;

    @FindBy(xpath = "(//i[@class='icon-play'])[4]")
    public WebElement iconPlayWillSchool;

    @FindBy(xpath = "//a[@class='dropdown-toggle tl-dashboard-sorting pull-right btn']")
    public WebElement nameBtn;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]")
    public WebElement allMenu;
    @FindBy(xpath = "//i[@class='icon-info-circle tl-icon20']")
    public WebElement iconInfoBox;

    @FindBy(xpath = "//span[@title='New Courses Name (143241)']")
    public WebElement iconPicture;

    @FindBy(xpath = "(//i[@class='icon-remove'])[4]")
    public WebElement iconX;

    @FindBy(xpath = "//i[@class='icon-th-list tl-icon17']")
    public WebElement iconButtonOne;

    @FindBy(xpath = "//a[contains(text(),'will school')]")
    public WebElement iconAssert1;


    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement iconBtnTwo;

    @FindBy(xpath = "(//img[@class='avatar-square'])[1]")
    public WebElement clickBack;




}
