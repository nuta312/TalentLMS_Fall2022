package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import io.qameta.allure.Epic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Maral Dyushekeeva
 */

@Epic("Users")
public class AdminHomePage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Users')])[1]")
    public WebElement usersBtn;

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement addUserBtn;

    public AdminHomePage clickUserBtn(){
        elementActions.click(usersBtn);
        return this;
    }
    public AdminHomePage clickAddUserBtn(){
        elementActions.click(addUserBtn);
        return this;
    }
  

}
