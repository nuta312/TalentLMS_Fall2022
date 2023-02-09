package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Maral Dyushekeeva
 */

public class AdminHomePage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Users')])[1]")
    public WebElement adminUsersBtn;

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement adminAddUserBtn;

    public AdminHomePage clickAdminUserBtn(){
        elementActions.click(adminUsersBtn);
        return this;
    }
    public AdminHomePage clickAdminAddUserBtn(){
        elementActions.click(adminAddUserBtn);
        return this;
    }
}
