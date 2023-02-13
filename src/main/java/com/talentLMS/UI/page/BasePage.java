package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.MockDataGenerator;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
<<<<<<< HEAD
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Aman Omorbekov
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Einar Toktogonov
>>>>>>> 1f221acfb2c61a9421fc4a29b13c0c5c4060a5e8
 */
public abstract class BasePage {
    protected WebDriver driver;
   public WebElementActions elementActions = new WebElementActions();
   public MockDataGenerator mock = new MockDataGenerator();
    public Actions action = new Actions(Driver.getDriver());
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Just verify



}
