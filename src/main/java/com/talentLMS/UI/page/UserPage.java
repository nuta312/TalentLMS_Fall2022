package com.talentLMS.UI.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {
    @FindBy(xpath = "//th[@class='tl-align-left sorting']")
    public WebElement columnUser;

    @FindBy(xpath = "(//th[@class='tl-align-left hidden-phone sorting'])[1]")
    public WebElement columnEmail;

    @FindBy(xpath = "//th[@aria-label='User type']")
    public WebElement columnUserType;

    @FindBy(xpath = "//th[@class='tl-align-center hidden-phone sorting'][1]")
    public WebElement columnRegistration;

    @FindBy(xpath = "//th[@class='tl-align-center hidden-phone sorting'][text()='Last login']")
    public WebElement columnLastLogin;

    @FindBy(xpath = "//th[@class='tl-align-center tl-table-operations-cell sorting_disabled']")
    public WebElement columnOption;

    @FindBy(xpath = "//a[text()='Add user']")
    public WebElement addUserBtn;


    public UserPage clickAddUserBtn(){
        elementActions.click(addUserBtn);
        return this;
    }



}
