package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.MockDataGenerator;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Aman Omorbekov
 */
public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
   public MockDataGenerator mock = new MockDataGenerator();
    public Actions action = new Actions(Driver.getDriver());
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
