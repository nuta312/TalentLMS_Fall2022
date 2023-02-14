package uiTests.groups;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class AddGroupTest extends BaseUiTest {

    @Test(priority = 1)
    @Description("verify if the user and the course have been added to the group")
    public void addUserAndCourseToGroupTest() {
        addGroupsPage.clickAddGroupBtn()
                .fillUpNameAndDescriptionOfGroup("TestGroup", "This is group for testing")
                .clickSubmitBtn().clickAddUserToGroupBtn();
        Assert.assertEquals(addGroupsPage.groupMemberText.getText(), "GROUP MEMBER");
        addGroupsPage.clickCoursesTab().clickAddCourseToGroup();
        Assert.assertEquals(addGroupsPage.CourseGroupMemberText.getText(),"GROUP MEMBER");
    }
    @Test(priority = 2)
    @Description("verify if the created group appears in the list")
    public void isTheGroupAddedToTheListTest() {
        addGroupsPage.clickGroupsBtnOnHomePage();
        addGroupsPage.listOfGroups();
    }
}
