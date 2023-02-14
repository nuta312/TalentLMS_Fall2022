package com.talentLMS.UI.page.reports;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * @author Belek Baratov
 */

public class UserReportsPage extends BasePage {
    @FindBy(xpath = "//a[@title='User reports']")
    public WebElement userReportsBtn;

    @FindBy(xpath = "//a[@title='Filter']")
    public WebElement filterBtn;

    @FindBy(xpath = "//tr[@role='row']")
    public List<WebElement> quantityOfUsers;

    @FindBy(xpath = "(//div[@class='item-value hide'])[1]")
    public WebElement sumOfUsersOnInfoBar;

    @FindBys({
            @FindBy(xpath = "//ul[@class='dropdown-menu']"),
            @FindBy(xpath = "//a[@class='tl-cursor-pointer']")
    })
    public List<WebElement> filterMenu;

    public WebElement getFilterValue() {
        WebElement b = null;
        for(WebElement e:filterMenu){
            b = e;
        }
        return b;
    }

    public Integer getSumOfUsers(){
        return quantityOfUsers.size() - 1;
        //here we can take sum of users on users report page
    }

    public Integer getSumOfUsersOnInfoBar(){
        return Integer.parseInt(sumOfUsersOnInfoBar.getAttribute("text"));
        // here we can take info bar
    }

    public UserReportsPage clickUserReportsBtn(){
        elementActions.click(userReportsBtn);
        return this;
    }

    public UserReportsPage clickFilterBtn(){
        elementActions.click(filterBtn);
        return this;
    }

    public UserReportsPage chooseFilterParam(){
        elementActions.click(filterBtn)
                .click(getFilterValue());
        return this;
    }
}
