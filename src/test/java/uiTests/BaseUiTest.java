package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.coursesPage.CoursePage;
import com.talentLMS.UI.page.сategory.CategoryPage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.reports.ReportsPage;
import com.talentLMS.UI.page.accountAndSettings.Homepage;
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
    public ReportsPage reportsPage;
    public UserPage userPage;
    public AddUserPage addUserPage;
    public Actions actions;
    public Homepage homepage;



    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        coursePage = new CoursePage();
        webElementActions = new WebElementActions();
        adminHomePage = new AdminHomePage();
        categoryPage = new CategoryPage();
        driver = Driver.getDriver();
        adminHomePage = new AdminHomePage();
        reportsPage = new ReportsPage();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();
        userPage = new UserPage();
        adminHomePage = new AdminHomePage();
        addUserPage = new AddUserPage();
        coursePage = new CoursePage();
        actions = new Actions(driver);
        homepage = new Homepage();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
