package com.talentLMS.UI.page.userTypes;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @author Dastan Mirulanov
 */
public class UserTypes {

    @FindBy(xpath = "//div[@class='tl-bold-link']/a[contains(text(), 'Users')]")
    private WebElement userTypesLink;

    @FindBy(xpath = "//i[@class='icon-vcard tl-icon-stack-content']")
    private WebElement userTypesIcon;


}
