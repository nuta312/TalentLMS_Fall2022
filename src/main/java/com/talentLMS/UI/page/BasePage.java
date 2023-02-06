package com.talentLMS.UI.page;

import com.talentLMS.UI.dataProviders.MockDataGenerator;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Nursultan Musakunov
 */
public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
   public MockDataGenerator mock = new MockDataGenerator();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
