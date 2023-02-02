package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserBtn;


    /**
     *  Courses tab
     */

    @FindBy(xpath = "//th[@class='tl-align-left sorting']")
    public WebElement coursesTab;

    public AddUserPage createNewUser() {
        elementActions.sendKeys(firstNameInput, mock.generateMockFirstname())
                .sendKeys(lastNameInput, mock.generateMockLastName())
                .sendKeys(emailInput, mock.generateMockEmail())
                .sendKeysWithClear(usernameInput, mock.generateMockUsername())
                .sendKeys(passwordInput, mock.generatePassword(8))
                .click(addUserBtn);
        return this;
    }
}
