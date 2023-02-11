package uiTests.userTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class UserTypesTest extends BaseUiTest {

    @Test
    public void OpenUserTypes() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(testIcon).perform();
//        testIcon.click();
//        webElementActions.click(testIconEinar);
        driver.findElement(By.xpath("//i[@class='icon-vcard tl-icon-stack-content']")).click();
        webElementActions.pause(10000);
    }

}
