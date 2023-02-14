package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kurmanjan Temirova
 */
public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='https://nuta1bema.talentlms.com/account/cms_index']")
    public WebElement homepageSettingsLink;

    @FindBy(xpath = "//button[@title='Fullscreen']")
    public WebElement maximizeAndMinimizeVideoWindowButton;

    @FindBy(id = "mep_0")
    public WebElement videoWindow;

    public  boolean isWindowMaximized(WebElement videoWindow) {
        String c = videoWindow.getAttribute("class");
        if (c.contains("mejs__container feature_video mejs__video mejs__container-fullscreen mejs__container-keyboard-inactive")) {
            return true;
        }
        return false;
    }

    public boolean isWindowMinimized(WebElement videoWindow) {
        String c = videoWindow.getAttribute("class");
        if (c.contains("mejs__container feature_video mejs__video")) {
            return true;
        }
        return false;
    }

    @FindBy(xpath = ".//button[@title='Play']")
    public WebElement playVideoButton;

    @FindBy(xpath = ".//button[@title='Pause']")
    public WebElement pauseVideoButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-large']")
    public WebElement upgradeBtn;
}
