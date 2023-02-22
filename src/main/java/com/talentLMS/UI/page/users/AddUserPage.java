package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import io.qameta.allure.Epic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Meder
 */
@Epic("Users")
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
    @FindBy(xpath = "(//span[@class='add-on'])[1]")
    public WebElement FirstNameInputFieldCounter;

    @FindBy(xpath = "(//span[@class='add-on'])[2]")
    public WebElement  lastNameInputFieldCounter;

    @FindBy(xpath = "(//span[@class='add-on'])[3]")
    public WebElement emailAddressInputFieldCounter;
    @FindBy(xpath = "(//span[@class='add-on'])[4]")
    public WebElement userNameInputFieldCounter;

    @FindBy(xpath = "(//span[@class='add-on'])[5]")
    public WebElement passwordInputFieldCounter;

    @FindBy(xpath = "//a[text()='cancel']")
    public WebElement canselSubmitBtn;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement bioDescriptions;
    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkedExcludeFromEmailsBox;

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
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkedActiveBox;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement successMessage;
    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement errMessageLimit;
    @FindBy(xpath = "(//span[@class='help-inline'])[3]")
    public WebElement emailErrorMess;
    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    public WebElement selectBtn;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[3]")
    public WebElement selectBtn3;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement selectChosenUserType;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
    public WebElement selectChosenLanguage;

    @FindBy(xpath = "//select[@name='acl_user_type_id']")
    public WebElement usertypeAdmin;
    @FindBy(xpath = "// select[@name='language']")
    public WebElement userLanguage;
    @FindBy(xpath = "//a[text()='Upload profile pic']")
    public WebElement uploadPicture;

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
    public AddUserPage selectAdminType(){
        Select select =new Select(usertypeAdmin);
        select.selectByVisibleText("SuperAdmin");
        return this;
    }
    public AddUserPage selectLanguage(){
        Select select =new Select(userLanguage);
        select.selectByVisibleText("Deutsch (German)");
        return this;
    }
}
