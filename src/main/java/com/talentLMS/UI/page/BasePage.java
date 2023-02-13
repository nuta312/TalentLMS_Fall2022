package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.MockDataGenerator;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Einar Toktogonov
 */
public abstract class BasePage {
    protected WebDriver driver;
   public WebElementActions elementActions = new WebElementActions();
   public MockDataGenerator mock = new MockDataGenerator();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Just verify



}
