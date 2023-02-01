package com.talentLMS.UI.page;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Nursultan Musakunov
 */
public abstract class BasePage {
    WebElementActions elementActions = new WebElementActions();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
