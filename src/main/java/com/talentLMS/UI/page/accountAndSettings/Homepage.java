package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kurmanjan Temirova
 */
public class Homepage extends BasePage {
    @FindBy(xpath = "//a[@href='https://kjtest01.talentlms.com/account/cms_index']")
    public WebElement homepageSettingsLink;

    @FindBy(xpath = "//button[@title='Fullscreen']")
    public WebElement maximizeAndMinimizeVideoWindowButton;

    @FindBy(xpath = ".//button[@title='Play']")
    public WebElement playVideoButton;

    @FindBy(xpath = ".//span[@class='mejs__currenttime']")
    public WebElement timeOfWatchedPieceOfVideo;
}
