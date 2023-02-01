package com.talentLMS;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ConfigReader.getProperty("browser"));
        System.out.println(ConfigReader.getProperty("name"));

//        Driver.getDriver().get("https://www.amazon.com/");
//        Thread.sleep(3000);
//        Driver.closeDriver();

        Driver.getDriver().get("https://digitalnomads.talentlms.com/index");
        LoginPage loginPage = new LoginPage();
        WebElementActions webElementActions = new WebElementActions();

        webElementActions.click(loginPage.loginBtn);
        Thread.sleep(4000);

        Driver.closeDriver();



//        WebElementActions webElementActions = new WebElementActions();
//        webElementActions.waitElementToBeDisplayed(element)
//                .waitElementToBeClickAble(element)
//                .waitElementToBeDisplayed(element)
//                .waitElementToBeClickAble(element)
//                .equals(element);
    }
}