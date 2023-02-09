package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.coursesPage.AddCoursesPage;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {


    /**
     * @author Aman Omorbekov
     */

    public AddCoursesPage addCoursesPage = new AddCoursesPage();
    public LoginPage loginPage;
    public WebElementActions webElementActions;
    public WebDriver driver;
    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword();

    }
//    @AfterClass
//    public void tearDown() {
//        Driver.closeDriver();
//    }
}
