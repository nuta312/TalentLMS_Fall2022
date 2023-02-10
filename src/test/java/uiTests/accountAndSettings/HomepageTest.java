package uiTests.accountAndSettings;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Kurmanjan Temirova
 */
public class HomepageTest extends BaseUiTest {
    @Test(priority = 1)
    @Description("Verify that user can Enter the Homepage tab in the Account and Settings section.")
    public void goToTheHomepageSettingsTest(){
        webElementActions.click(homepage.homepageSettingsLink);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/account/cms_index");
    }
    @Test(priority = 2)
    @Description("Verify that user can maximize video window")
    public void maximizeVideoWindowTest(){
        webElementActions.click(homepage.maximizeAndMinimizeVideoWindowButton);
        assertTrue(homepage.isWindowMaximized(driver, homepage.videoWindow));
    }
    @Test(priority = 3)
    @Description("Verify that user can minimize video window")
    public void minimizeVideoWindowTest(){
        webElementActions.click(homepage.maximizeAndMinimizeVideoWindowButton);
        assertTrue(homepage.isWindowMinimized(driver, homepage.videoWindow));
    }
    @Test(priority = 4)
    @Description("Verify that user can play video")
    public void playVideoTest(){
        webElementActions.click(homepage.playVideoButton);
        assertTrue(homepage.pauseVideoButton.isEnabled());
    }
    @Test(priority = 5)
    @Description("Verify that user watch video to the end")
    public void watchVideoToTheEndTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(76));
        wait.until(ExpectedConditions.textToBe(By.xpath("//span[@class='mejs__currenttime']"), "01:12"));
        assertEquals(homepage.timeOfWatchedPieceOfVideo.getText(), "01:12");
    }
    @Test(priority = 6)
    @Description("Verify that user can click on Upgrade button")
    public void upgradeTest(){
        webElementActions.click(homepage.upgradeBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/account/subscription_index");
    }
}

