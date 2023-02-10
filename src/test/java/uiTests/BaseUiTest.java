package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.accountAndSettings.BasicSettings;
import com.talentLMS.UI.page.users.AddUserPage;
import com.talentLMS.UI.page.users.AdminHomePage;
import com.talentLMS.UI.page.users.UserPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {

    public LoginPage loginPage;
    public WebElementActions webElementActions;
    public WebDriver driver;
    public UserPage userPage;

    public AdminHomePage adminHomePage;
    public AddUserPage addUserPage;

    public BasicSettings basicSettings;



    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();
        userPage = new UserPage();
        adminHomePage = new AdminHomePage();
        addUserPage = new AddUserPage();
        basicSettings = new BasicSettings();
    }

//    @AfterClass
//    public void tearDown() {
//        Driver.closeDriver();
//    }
}
