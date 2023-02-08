package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Aman Omorbekov
 */

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLoginBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;


    public LoginPage fillUpUsernameAndPassword(String userName,String password){
        elementActions.sendKeys(usernameInput,userName)
                .sendKeys(passwordInput,password)
                .click(submitLoginBtn);
        return this;
    }
}
