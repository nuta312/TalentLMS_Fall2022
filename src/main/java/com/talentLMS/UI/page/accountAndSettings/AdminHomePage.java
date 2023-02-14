package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage {



    @FindBy (xpath = "//*[@id=\"tl-admin-users\"]/div[2]/a")
    public WebElement addUserBtn;



    public AdminHomePage clickAddUserBtn () {
        elementActions.click(addUserBtn);
        return this;
    }

}
