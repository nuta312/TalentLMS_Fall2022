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
import com.talentLMS.UI.page.userTypes.UserTypes;
import com.talentLMS.UI.page.сategory.CategoryPage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.coursesPage.CoursesBuyCourseFunc;
import com.talentLMS.UI.page.userTypes.CreatePage;
import com.talentLMS.UI.page.coursesPage.ViewCoursesCatalog;
import com.talentLMS.UI.page.accountAndSettings.Homepage;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.users.AddUserPage;
import com.talentLMS.UI.page.users.UserPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    public LoginPage loginPage;
    public CoursePage coursePage;
    public AdminHomePage adminHomePage;
    public CategoryPage categoryPage;
    public WebElementActions webElementActions;
    public WebDriver driver;
    public CoursesBuyCourseFunc coursesBuyCourseFunc;
    public CreatePage createPage;
    public UserPage userPage;
    public AddUserPage addUserPage;
    public Homepage homepage;
    public ViewCoursesCatalog viewCoursesCatalog;
    public ReportsPage reportsPage;
    public ReportsCoursePage reportsCoursePage;
    public AddGroupsPage addGroupsPage;
    public GamificationPage gamificationPage;
    public GroupPageFunctionality groupPageFunctionality;
    public UserTypes userTypes;






    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        coursePage = new CoursePage();
        webElementActions = new WebElementActions();
        adminHomePage = new AdminHomePage();
        categoryPage = new CategoryPage();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();

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
        gamificationPage = new GamificationPage();
        groupPageFunctionality = new GroupPageFunctionality();
        userTypes = new UserTypes();

    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
