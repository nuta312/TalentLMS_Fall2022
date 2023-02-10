package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.ConfigReader;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nursultan Musakunov
 */

public class LoginPage extends BasePage {
String loginURLPage = "https://nuta1bema.talentlms.com/index";
    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLoginBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;

    public LoginPage fillUpUsernameAndPassword(){
        elementActions.sendKeys(usernameInput,ConfigReader.getProperty("username"))
                .sendKeys(passwordInput,ConfigReader.getProperty("password"))
                .click(submitLoginBtn);
        return this;
    }

    public LoginPage checkLoginUrlPage(){
        elementActions.assertUrlPage(loginURLPage);
        return this;
    }
}
