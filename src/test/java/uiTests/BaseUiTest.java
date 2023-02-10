package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.coursesPage.CoursePage;
import com.talentLMS.UI.page.сategory.CategoryPage;
import com.talentLMS.UI.page.LoginPage;
<<<<<<< HEAD
import com.talentLMS.UI.page.accountAndSettings.BasicSettings;
=======
import com.talentLMS.UI.page.userTypes.CreatePage;
import com.talentLMS.UI.page.coursesPage.ViewCoursesCatalog;
import com.talentLMS.UI.page.accountAndSettings.Homepage;
import com.talentLMS.UI.page.AdminHomePage;
>>>>>>> master
import com.talentLMS.UI.page.users.AddUserPage;
import com.talentLMS.UI.page.users.UserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    public LoginPage loginPage;
    public CoursePage coursePage;
    public AdminHomePage adminHomePage;
    public CategoryPage categoryPage;
    public WebElementActions webElementActions;
    public WebDriver driver;
    public CreatePage createPage;
    public UserPage userPage;

    public AddUserPage addUserPage;
    public Homepage homepage;

    public ViewCoursesCatalog viewCoursesCatalog;

    public BasicSettings basicSettings;



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
        createPage = new CreatePage();
        userPage = new UserPage();
        adminHomePage = new AdminHomePage();
        addUserPage = new AddUserPage();
<<<<<<< HEAD
        basicSettings = new BasicSettings();
=======
        viewCoursesCatalog = new ViewCoursesCatalog();
        homepage = new Homepage();
>>>>>>> master
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
