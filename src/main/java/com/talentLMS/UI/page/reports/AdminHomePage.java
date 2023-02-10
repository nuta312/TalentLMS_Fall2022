package com.talentLMS.UI.page.reports;


import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Kutbolsun Toktonazarov
 */

public class AdminHomePage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    public WebElement reports;

    public AdminHomePage clickReportsBtn(){
        elementActions.click(reports);
        return this;
    }
}
