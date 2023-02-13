package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.security.auth.x500.X500Principal;

public class UsersAccSetPage extends BasePage {


    @FindBy(xpath = "//*[text()='Users']")  //perenesti v class Account and Settings
    public WebElement userPageBtn;


    public UsersAccSetPage clickUsersPageBtn () {
        elementActions.click(userPageBtn);
        return this;
    }

    @FindBy (xpath = "(//span[@class='select2-arrow'])[1]")
    public WebElement signupArrow;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement dropDownText1;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement dropDownManually;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement dropDownDirect;

    @FindBy (xpath = "(//span[@class='select2-arrow'])[3]")
    public  WebElement userTypeArrow;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement dropDownText2;

    @FindBy (xpath = "(//i[@class='icon-info-circle tl-info-icon'])[7]")
    public WebElement iconText;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[4]")
    public WebElement dropDownLearnerType;

    @FindBy (xpath = "(//span[@class='select2-arrow'])[4]")
    public WebElement defaultGroupArrow;

    @FindBy (xpath = "//div[@class='select2-result-label']")
    public WebElement dropDownSelectGroup;

    @FindBy (xpath = "//input[@id='password_change_x_days']")
    public WebElement passwordChangeAfter;

    @FindBy (xpath = "//input[@id='password_change_days']")
    public WebElement passwordChangeAfterText;

    public UsersAccSetPage clickChangeAfterText() {
        elementActions.click(passwordChangeAfter);
        return this;
    }

    @FindBy (xpath = "//input[@id='password_change']")
    public WebElement passwordChangeOnFirst;

    @FindBy (xpath = "//input[@id='lock_login_retries']")
    public WebElement lockAccountAfter;

    @FindBy (xpath = "//a[@id='show-license-note']")
    public  WebElement termsAndService;

    @FindBy (xpath = "//textarea[@name='license_note']")
    public WebElement textArea;

    @FindBy (xpath = "//a[@id='show-visible-user-format']")
    public WebElement visibleUserFormat;

    @FindBy (xpath = "(//span[@class='select2-arrow'])[5]")
    public WebElement visibleUsersFormatArrow;

    @FindBy (xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement fLastNameBtn;
    @FindBy (xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement firsNameL;
    @FindBy (xpath = "(//div[@class='select2-result-label'])[3]")
    public WebElement firstNameLastName;
    @FindBy (xpath = "(//div[@class='select2-result-label'])[4]")
    public WebElement lastNameF;
    @FindBy (xpath = "(//div[@class='select2-result-label'])[5]")
    public WebElement lastNameFirstName;
    @FindBy (xpath = "(//div[@class='select2-result-label'])[6]")
    public WebElement userName;

    @FindBy (xpath = "//a[@id='show-social-media']")
    public WebElement socialOptions;

    @FindBy (xpath = "//input[@id='social_signup']")
    public WebElement socialOptionsCheckbox;

    @FindBy (xpath = "//input[@name='social_signup_facebook']")
    public WebElement facebook;
    @FindBy (xpath = "//input[@name='social_signup_google']")
    public WebElement google;
    @FindBy (xpath = "//input[@name='social_signup_linkedin']")
    public WebElement linkedIn;
    @FindBy (xpath = "//input[@name='social_catalog']")
    public WebElement allowInteractions;

    @FindBy (xpath = "//input[@name='social_share_certification']")
    public WebElement shareCertificates;

    @FindBy (xpath = "//input[@name='course_rating']")
    public WebElement courseRating;

    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement saveBtn;

    @FindBy (xpath = "//ul[@id='ui-id-1']")
    public WebElement textBoxMsg;

    @FindBy (xpath = "//i[@class='icon-sliders-v tl-icon-stack-content']")
    public WebElement accountAndSettingsBtn;

    public UsersAccSetPage clickAccountAndSettingsBtn() {
        elementActions.click(accountAndSettingsBtn);
        return this;
    }

    public UsersAccSetPage fillUsersPage () {
        elementActions.click(signupArrow).click(dropDownManually)
                .click(userTypeArrow).click(dropDownLearnerType)
                .click(defaultGroupArrow).click(dropDownSelectGroup);
        return this;
    }

    public UsersAccSetPage clickSignupArrow () {
        elementActions.click(signupArrow);
        return this;
    }


    public UsersAccSetPage fillUsersPasswordSettings () {
        elementActions.click(passwordChangeAfter).click(passwordChangeOnFirst).click(lockAccountAfter);
        return this;
    }

    public UsersAccSetPage termsOfService () {
        elementActions.click(termsAndService).sendKeysWithClear(textArea, "Hello World");
        return this;
    }

//    public UsersAccSetPage getVisibleUserFormatList () {
//        elementActions.click(visibleUserFormat).click(visibleUsersFormatArrow);
//        WebElementActions listName = elementActions.getElements("//div[@class='select2-result-label']");
//        return this;
//    }
    public UsersAccSetPage getVisibleUserFormat () {
        elementActions.click(visibleUserFormat).click(visibleUsersFormatArrow);
//        elementActions.pause(5000);

        return this;
    }

    public UsersAccSetPage getSocialOptions () {
        elementActions.click(fLastNameBtn);
        elementActions.click(socialOptions);
        elementActions.click(socialOptionsCheckbox);
        return this;
    }
    public UsersAccSetPage getCheckBoxLast () {

        elementActions.click(allowInteractions)
                .click(shareCertificates).click(courseRating);
//                .click(saveBtn);
        return this;
    }

    public UsersAccSetPage getSaveBtn () {
        elementActions.click(saveBtn);
        return this;
    }



}
