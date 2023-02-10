package com.talentLMS.UI.page;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.*;

/**
 * @author Maral Dyushekeeva
 */

public class AdminHomePage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    public WebElement reports;

    public AdminHomePage clickReportsBtn(){
        elementActions.click(reports);
        return this;
    }

}
