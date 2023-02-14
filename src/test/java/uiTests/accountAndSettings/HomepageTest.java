package uiTests.accountAndSettings;

import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;


import static org.testng.Assert.*;
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
        assertTrue(homepage.isWindowMaximized(homepage.videoWindow));
    }
    @Test(priority = 3)
    @Description("Verify that user can play video")
    public void playVideoTest(){
        webElementActions.click(homepage.playVideoButton);
        assertTrue(homepage.pauseVideoButton.isEnabled());
    }
    @Test(priority = 4)
    @Description("Verify that user can minimize video window")
    public void minimizeVideoWindowTest(){
        actions.moveToElement(homepage.videoWindow).moveToElement(homepage.maximizeAndMinimizeVideoWindowButton).click().build().perform();
        assertTrue(homepage.isWindowMinimized(homepage.videoWindow));
    }
    @Test(priority = 5)
    @Description("Verify that user can click on Upgrade button")
    public void upgradeTest(){
        webElementActions.click(homepage.upgradeBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/account/subscription_index");
    }
}

