package uiTests;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {

    public LoginPage loginPage;
    public WebElementActions webElementActions;
    public WebDriver driver;

    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();
        driver = Driver.getDriver();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
