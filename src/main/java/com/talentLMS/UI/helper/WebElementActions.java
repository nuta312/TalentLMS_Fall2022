package com.talentLMS.UI.helper;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class WebElementActions {

    WebDriver driver;


    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementActions click(WebElement element){
        waitElementToBeClickAble(element);
        element.click();
        return this;
    }

    public WebElementActions sendKeys(WebElement element,String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions sendKeysWithClear(WebElement element,String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions moveTo(WebElement element){
        Actions actions = new Actions(driver);
        actions.click(element).moveToElement(element).click().perform();
        return this;
    }

    public WebElementActions pause(Integer milliSeconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliSeconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

<<<<<<< HEAD
    public WebElementActions moveToElement(WebElement element){
        moveToElement(element);
=======
    public WebElementActions assertUrlPage(String object){
        assertEquals(Driver.getDriver().getCurrentUrl(),object);
        return this;
    }

    public WebElementActions moveTo(String URL){
        Driver.getDriver().navigate().to(URL);
>>>>>>> d8cc23c21246b183c24e572f04bd7499db1db02e
        return this;
    }

}
