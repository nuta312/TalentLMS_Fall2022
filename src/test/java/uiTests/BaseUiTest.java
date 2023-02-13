package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.accountAndSettings.GamificationPage;
import com.talentLMS.UI.page.coursesPage.CoursePage;
import com.talentLMS.UI.page.groupsPage.AddGroupsPage;
import com.talentLMS.UI.page.groupsPage.GroupPageFunctionality;
import com.talentLMS.UI.page.reports.ReportsCoursePage;
import com.talentLMS.UI.page.reports.ReportsPage;
import com.talentLMS.UI.page.reports.UserReportsPage;
import com.talentLMS.UI.page.сategory.CategoryPage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.coursesPage.CoursesBuyCourseFunc;
import com.talentLMS.UI.page.userTypes.CreatePage;
import com.talentLMS.UI.page.coursesPage.ViewCoursesCatalog;
import com.talentLMS.UI.page.accountAndSettings.Homepage;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.users.AddUserPage;
import com.talentLMS.UI.page.users.UserPage;
import com.talentLMS.UI.page.сategory.CreateCategoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    public LoginPage loginPage;
    public CoursePage coursePage;
    public AdminHomePage adminHomePage;
    public CategoryPage categoryPage;
    public CreateCategoryPage createCategoryPage;
    public WebElementActions webElementActions;
    public WebDriver driver;
    public Actions actions;
    public CoursesBuyCourseFunc coursesBuyCourseFunc;
    public CreatePage createPage;
    public UserPage userPage;
    public AddUserPage addUserPage;
    public Homepage homepage;
    public ViewCoursesCatalog viewCoursesCatalog;
    public ReportsPage reportsPage;
    public ReportsCoursePage reportsCoursePage;
    public UserReportsPage userReportsPage;
    public AddGroupsPage addGroupsPage;
    public GamificationPage gamificationPage;
    public GroupPageFunctionality groupPageFunctionality;

    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        coursePage = new CoursePage();
        webElementActions = new WebElementActions();
        adminHomePage = new AdminHomePage();
        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();
        categoryPage = new CategoryPage();
        createCategoryPage = new CreateCategoryPage();
        coursesBuyCourseFunc = new CoursesBuyCourseFunc();
        createPage = new CreatePage();
        userPage = new UserPage();
        adminHomePage = new AdminHomePage();
        addUserPage = new AddUserPage();
        viewCoursesCatalog = new ViewCoursesCatalog();
        homepage = new Homepage();
        addGroupsPage = new AddGroupsPage();
        reportsPage = new ReportsPage();
        reportsCoursePage = new ReportsCoursePage();
        userReportsPage = new UserReportsPage();
        gamificationPage = new GamificationPage();
        groupPageFunctionality = new GroupPageFunctionality();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
