package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Diana
 */

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

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement bioDescriptions;


    @FindBy(xpath = "//select[@name='acl_user_type_id']")
    public WebElement selectOptions;
    @FindBy(xpath = "//label[text()='Active']")
    public WebElement activeCheckBox;
    @FindBy(xpath = "(//label[@class='checkbox inline'])[3]")
    public WebElement excludeFromEmails;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement submitAddUserBtn;

    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement coursePage;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement successMessage;
    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement errMessageLimit;

    public AddUserPage clickHomeBtn(){
        elementActions.click(homeBtn);
        return this;
    }

    public AddUserPage createNewUser() {
        Select select = new Select(selectOptions);
        elementActions.sendKeys(firstNameInput, mock.generateMockFirstname())
                .sendKeys(lastNameInput, mock.generateMockLastName())
                .sendKeys(emailInput, mock.generateMockEmail())
                .sendKeysWithClear(usernameInput, mock.generateMockUsername())
                .sendKeys(passwordInput, "ABaaabb34$")
                .sendKeys(bioDescriptions, mock.generateMockBioDescription());
        select.selectByVisibleText("Admin-Type");
        return this;
    }
    public AddUserPage clickActiveBtn(){
        elementActions.click(activeCheckBox);
        return this;
    }
    public AddUserPage clickExcludeBtn(){
        elementActions.click(excludeFromEmails);
        return this;
    }
    public AddUserPage clickSubmitAddUserBtn(){
        elementActions.click(submitAddUserBtn);
        return this;
    }


}
