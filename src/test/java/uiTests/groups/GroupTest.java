package uiTests.groups;

import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;

public class GroupTest extends BaseUiTest {
    @Test(priority = 0)
    @Description("Verify that Admin can click Groups button")
    @Feature("Groups")
    public void enterGroupsTest() {
        adminHomePage.clickGroupsBtn();
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/group/index");

    }

    @Test(priority = 1)
    @Description("Verify that Admin entered Groups page")
    @Feature("Groups")
    public void enterGroupPageTest() {
        adminHomePage.clickGroupsBtn();
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/group/index");

    }

    @Test(priority = 2)
    @Description("Verify that Admin can click addGroups button")
    @Feature("Groups")
    public void addGroupsTest() {
        adminHomePage.clickGroupsBtn();
        groupPageFunctionality.clickAddGroupBtn();
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/group/create");
    }

    @Test(priority = 3)
    @Description("Verify that Admin can see Name, Description, Options of Group")
    @Feature("Groups")
    public void checkGroupPageTest() {
        adminHomePage.clickGroupsBtn();
        assertEquals(groupPageFunctionality.nameGroup.getText(), "NAME");
        assertEquals(groupPageFunctionality.descriptionGroup.getText(), "DESCRIPTION");
        assertEquals(groupPageFunctionality.optionGroup.getText(), "OPTIONS");
    }
}
