package uiTests.groups;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class AddGroupTest extends BaseUiTest {


    @Test(priority = 1)
    @Description("Verify adding group")
    public void addGroupTest() {
        addGroupsPage.clickAddGroupBtn().fillUpNameAndDescriptionOfGroup("TestGroup","This is group for testing")
                .clickGroupKeyBtn();
        webElementActions.sendKeysWithClear(addGroupsPage.inputKeyOfGroup, "123456");
        addGroupsPage.clickGroupPriceBtn();
        webElementActions.sendKeys(addGroupsPage.inputPriceOfGroup, "1500");
        addGroupsPage.clickSubmitBtn();
        webElementActions.pause(2000);
        Assert.assertEquals(addGroupsPage.textOfSuccsefullyAddedGroup.getText(),"Success! New group created.");
    }

    @Test(priority = 2)
    @Description("verify if the created group appears in the list")
    public void isTheGroupAddedToTheListTest() {
        addGroupsPage.clickGroupsBtnOnHomePage();
        addGroupsPage.listOfGroups();
        driver.navigate().back();
    }

    @Test(priority = 3)
    @Description("verify if the user and the course have been added to the group")
    public void addUserAndCourseToGroupTest() {
        addGroupsPage.clickGroupBtn();
        actions.moveToElement(addGroupsPage.triplePoint).perform();
        addGroupsPage.clickEditGroupBtn().userBtn.click();
        addGroupsPage.clickAddUserToGroupBtn();
        Assert.assertEquals(addGroupsPage.groupMemberText.getText(), "GROUP MEMBER");
        addGroupsPage.clickCoursesTab().clickAddCourseToGroup();
        Assert.assertEquals(addGroupsPage.CourseGroupMemberText.getText(),"GROUP MEMBER");

    }
    @Test(priority = 4)
    public void removeGroupFromListTest() {
        addGroupsPage.clickGroupBtn();
        actions.moveToElement(addGroupsPage.triplePoint).perform();
        addGroupsPage.clickRemoveBtn();
    }
}
