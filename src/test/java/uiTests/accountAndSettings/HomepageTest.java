package uiTests.accountAndSettings;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
/**
 * @author Kurmanjan Temirova
 */
public class HomepageTest extends BaseUiTest {
    private static String validUserName = "kurmanjantemirova";
    private static String validPassword = "kurma100203";

    @Test(priority = 1, description = "Verify that user can login with valid credentials")
    public void openAdminHomePage(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword(validUserName, validPassword);
        assertEquals(driver.getCurrentUrl(),"https://kjtest01.talentlms.com/dashboard");
    }
    @Test(priority = 2, description = "Verify that user can Enter the Homepage tab in the Account and Settings section.")
    public void goToTheHomepageSettings(){
        webElementActions.click(homepage.homepageSettingsLink);
        assertEquals(driver.getCurrentUrl(),"https://kjtest01.talentlms.com/account/cms_index");
    }
    @Test(priority = 3, description = "Verify that user can maximize video window")
    public void maximizeVideoWindow(){
        webElementActions.click(homepage.maximizeAndMinimizeVideoWindowButton);
    }
    @Test(priority = 4, description = "Verify that user can play video")
    public void playVideo(){
        webElementActions.click(homepage.playVideoButton);
    }
    @Test(priority = 5, description = "Verify that user watch video to the end")
    public void watchVideoToTheEnd(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(79));
        wait.until(ExpectedConditions.textToBePresentInElement(homepage.timeOfWatchedPieceOfVideo, "01:15"));
    }
    @Test(priority = 6, description = "Verify that user can minimize video window")
    public void minimizeVideoWindow(){
        webElementActions.click(homepage.maximizeAndMinimizeVideoWindowButton);
        webElementActions.pause(3000);
    }
}

