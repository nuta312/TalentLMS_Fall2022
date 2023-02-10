package uiTests.accountAndSettings;

import com.talentLMS.UI.dataProviders.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.*;
import static org.testng.Assert.assertFalse;

public class BasicSettingsTest extends BaseUiTest {


    @Test(priority = 3)
    public void ClickAccountSettings2() {
        basicSettings.clickAccountSettings();
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/account/basic_index");
    }

    @Test(priority = 4)
    public void IdentityField2() {
        basicSettings.identityField();
        assertEquals(basicSettings.numberSiteName.getText(), "31");
    }

    @Test(priority = 5)
    public void SiteDescription2() {
        basicSettings.siteDescription();
        assertEquals(basicSettings.numberSiteDescription.getText(), "234");
    }

    @Test(priority = 6)
    public void LocaleChoice2() {
        basicSettings.localeChoice();
        assertTrue(basicSettings.defaultTimeZone.isEnabled());
    }

    @Test(priority = 7)
    public void DataFormatChoice() {
        basicSettings.dataFormatChoices();
        assertTrue(basicSettings.dateFormatChoice.isEnabled());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @Test(priority = 8)
    public void TimeFormatInput() {
        basicSettings.timeFormatChoice();
        String expected = "24-hour";
        assertEquals(basicSettings.timeFormat.getText(), expected);
    }

    @Test(priority = 9)
    public void CurrencyChoices() {
        basicSettings.currencyChoice();
    }

    @Test(priority = 10)
    public void AnnouncementInput() {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)", "");
        basicSettings.announcementField();
        assertTrue(basicSettings.announcementText.isEnabled());
    }

    @Test(priority = 11)
    public void SecurityBox1() {
        basicSettings.security();
        assertTrue(basicSettings.checkBox1.isEnabled());
    }

    @Test(priority = 12)
    public void SecurityBox2() {
        basicSettings.security2();
    }

    @Test(priority = 13)
    public void SecurityBox3() {
        basicSettings.security3();
        assertTrue(basicSettings.checkBox3.isDisplayed());
    }

    @Test(priority = 14)
    public void SecurityBox4() {
        basicSettings.security4();
        assertTrue(basicSettings.inputCheckBox.isEnabled());
    }

    @Test(priority = 15)
    public void CourseSetting() {
        basicSettings.courseSettings();
        assertTrue(basicSettings.courseCheckBox.isEnabled());
    }

    @Test(priority = 16)
    public void CourseSetting2() {
        basicSettings.courseSettings2();
        assertTrue(basicSettings.courseCheckBox2.isDisplayed());
    }

    @Test(priority = 17)
    public void CourseSetting3() {
        basicSettings.courseSettings3();
//        assertTrue(basicSettings.courseCheckBox3.isSelected());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    @Test(priority = 18)
    public void ConferencesTake2() {
        basicSettings.conferencesTake();
    }

    @Test(priority = 19)
    public void ConferencesTypeChoice2() {
        basicSettings.conferencesTypeChoice();
    }

    @Test(priority = 20)
    public void InputMax2() {
        basicSettings.inputMax();
        assertTrue(basicSettings.maxInput.isEnabled());
    }

    @Test(priority = 21)
    public void CustomCurseFields2() {
        basicSettings.customCurseFields();
        assertFalse(basicSettings.customFields.isSelected());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    @Test(priority = 22)
    public void CustomAddFields() {
        basicSettings.customAddFields();
        assertFalse(basicSettings.addFields.isSelected());
    }

    @Test(priority = 23)
    public void InputAddName() {
        basicSettings.inputName();
        assertTrue(basicSettings.sendName.isDisplayed());
    }

    @Test(priority = 24)
    public void InputTypeText() {
        basicSettings.inputTypeText();
        assertTrue(basicSettings.textChoice.isEnabled());
        basicSettings.inputTypeText();
    }

    @Test(priority = 25)
    public void ClickAddField() {
        basicSettings.clickAddField();
        assertFalse(basicSettings.submitAdd.isSelected());
    }
    @Test(priority = 26)
    public void CustomAddFields3() {
        basicSettings.customAddField3();
        assertFalse(basicSettings.addFields.isSelected());
    }

    @Test(priority = 27)
    public void InputAddName3() {
        basicSettings.inputName3();
        assertTrue(basicSettings.sendName.isDisplayed());
    }

    @Test(priority = 28)
    public void InputTypeText3() {
        basicSettings.inputTypeText3();
        assertTrue(basicSettings.textChoice.isEnabled());
        basicSettings.inputTypeText3();
    }

    @Test(priority = 29)
    public void ClickAddField3() {
        basicSettings.clickAddField3();
        assertFalse(basicSettings.submitAdd.isSelected());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        webElementActions.pause(3000);
    }

    @Test(priority = 30)
    public void CustomUser() {
        basicSettings.customUser();
        assertFalse(basicSettings.customUser.isSelected());
    }

    @Test(priority = 31)
    public void CustomAddUser() {
        basicSettings.customAddUsers();
    }

    @Test(priority = 32)
    public void CustomInputUser2() {
        basicSettings.customInputUser();
    }

    @Test(priority = 33)
    public void CustomAddUsers2() {
        basicSettings.customAddUsers2();
    }

    @Test(priority = 34)
    public void CustomInputUser3() {
        basicSettings.customInputUser2();
    }

    @Test(priority = 35)
    public void CustomAddUsers3() {
        basicSettings.customAddUsers3();
    }

    @Test(priority = 36)
    public void CustomInputUser4() {
        basicSettings.customInputUser3();

    }

    @Test(priority = 37)
    public void SaveClick2() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        webElementActions.pause(3000);
        basicSettings.saveClick();
        webElementActions.pause(6000);
    }
}
