package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

/**
 * @author Kurmanjan Temirova
 */
public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='https://nuta1bema.talentlms.com/account/cms_index']")
    public WebElement homepageSettingsLink;

    @FindBy(xpath = "//button[@title='Fullscreen']")
    public WebElement maximizeAndMinimizeVideoWindowButton;

    @FindBy(xpath = ".//div[@class='mejs__overlay mejs__layer mejs__overlay-play']")
    public WebElement videoWindow;

    public  boolean isWindowMaximized(WebDriver driver, WebElement videoWindow) {
        int windowWidth = (int) ((Long) ((JavascriptExecutor) driver).executeScript("return window.innerWidth")).longValue();
        int windowHeight = (int) ((Long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight")).longValue();
        int videoWindowWidth = videoWindow.getSize().getWidth();
        int videoWindowHeight = videoWindow.getSize().getHeight();

        if (windowWidth == videoWindowWidth && windowHeight == videoWindowHeight) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWindowMinimized(WebDriver driver, WebElement videoWindow) {
        int windowWidth = (int) ((Long) ((JavascriptExecutor) driver).executeScript("return window.outerWidth")).longValue();
        int windowHeight = (int) ((Long) ((JavascriptExecutor) driver).executeScript("return window.outerHeight")).longValue();
        int videoWindowWidth = videoWindow.getSize().getWidth();
        int videoWindowHeight = videoWindow.getSize().getHeight();

        if (windowWidth > videoWindowWidth || windowHeight > videoWindowHeight) {
            return true;
        } else {
            return false;
        }
    }

    @FindBy(xpath = ".//button[@title='Play']")
    public WebElement playVideoButton;

    @FindBy(xpath = ".//span[@class='mejs__currenttime']")
    public WebElement timeOfWatchedPieceOfVideo;

    @FindBy(xpath = ".//button[@title='Pause']")
    public WebElement pauseVideoButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-large']")
    public WebElement upgradeBtn;

}
