package com.talentLMS.UI.page.branches;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage extends BasePage {
    @FindBy(xpath = "//a[contains(.,'Add branch')]")
    public WebElement addBranchBtn;

    public BranchesPage clickAddBranchBtn(){
        elementActions.click(addBranchBtn);
        return this;
    }
}
