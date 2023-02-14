package uiTests.RegressionUI.users;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Begaiym Matissakova
 */

@Epic("Users")

public class InstructorPageTest extends BaseUiTest {

    @BeforeClass
    public void enterToInstructorHomePage() {
        webElementActions.moveToElement(instructorHomePage.dropDownBtn);
        webElementActions.click(instructorHomePage.instructorType);
    }

    @Test(priority = 1)
    @Description("C231 - Verify that user can select Instructor type")
    @Feature("Instructor")
    public void selectInstructorType() {
        assertEquals(instructorHomePage.instructorTypeText.getText(), "INSTRUCTOR");
    }

    @Test(priority = 2)
    @Description("C232 - Verify there is Courses button on Instructor's page")
    @Feature("Course Buttons")
    public void clickCoursesBtn() {
        webElementActions.click(instructorHomePage.coursesBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
        webElementActions.click(instructorHomePage.homeButton);
        assertEquals(instructorHomePage.coursesBtn.getText(), "COURSES");
        assertEquals(instructorHomePage.addCoursesTextBtn.getText(), "Add course");
        assertTrue(instructorHomePage.coursesSignIcon.isEnabled());
    }

    @Test(priority = 3)
    @Description("C233 - Verify there is Groups button on Instructor's page")
    @Feature("Group Buttons")
    public void clickGroupBtn() {
        webElementActions.click(instructorHomePage.groupsSignBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/group/index");
        webElementActions.click(instructorHomePage.homeButton);
        assertEquals(instructorHomePage.groupsSignBtn.getText(), "GROUPS");
        assertEquals(instructorHomePage.addGroupText.getText(), "Add group");
        assertTrue(instructorHomePage.groupsBtnIcon.isEnabled());

    }

    @Test(priority = 4)
    @Description("C234 - Verify there is Conferences button on Instructor's page")
    @Feature("Conferences buttons")
    public void clickConferenceBtn() {
        webElementActions.click(instructorHomePage.conferencesSignBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/conference/index");
        webElementActions.click(instructorHomePage.homeButton);
        assertEquals(instructorHomePage.conferencesSignBtn.getText(), "CONFERENCES");
        assertEquals(instructorHomePage.addConferenceText.getText(), "Add conference");
        assertTrue(instructorHomePage.coursesSignIcon.isDisplayed());
    }

    @Test(priority = 5)
    @Description("C235 - Verify there is Discussions button on Instructor's page")
    @Feature("Discussion")
    public void clickDiscussionBtn() {
        webElementActions.click(instructorHomePage.discussionsSignBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/discussion/index");
        webElementActions.click(instructorHomePage.homeButton);
        assertEquals(instructorHomePage.discussionsSignBtn.getText(), "DISCUSSIONS");
        assertEquals(instructorHomePage.addDiscussionText.getText(), "Add discussion");
        assertTrue(instructorHomePage.discussionsBtnIcon.isDisplayed());
    }

    @Test(priority = 6)
    @Description("C236 - Verify there is Calendar button on Instructor's page")
    @Feature("Calendar buttons")
    public void clickCalendarBtn() {
        webElementActions.click(instructorHomePage.calendarSignBtn);
        webElementActions.click(instructorHomePage.homeButton);
        assertTrue(instructorHomePage.calendarBtnIcon.isEnabled());
    }

    @Test(priority =7)
    @Description("C237 - Verify that search courses field is displayed")
    @Feature("Search my courses")
    public void checkInputField() {
        webElementActions.sendKeys(instructorHomePage.inputFields, "New Courses Name");
        assertTrue(instructorHomePage.iconX.isDisplayed());
        // webElementActions.waitElementToBeClickAble(instructorHomePage.deleteSearchBtn);
        webElementActions.click(instructorHomePage.iconX);
    }

    @Test(priority = 8)
    @Description("C238 - Verify that Instructor can click Name button")
    @Feature("Name Button")
    public void clickNameBtn () {
        webElementActions.click(instructorHomePage.nameTextBtn);
        assertTrue(instructorHomePage.lastUpdated.getText().contains("Last updated"));
        webElementActions.click(instructorHomePage.asTableBtn);
    }

    @Test(priority = 9)
    @Description("C239 - Instructor can click new courses name")
    @Feature("New courses name")
    public void clickNewCoursesName() {
        webElementActions.click(instructorHomePage.asTableBtn);
        webElementActions.moveToElement(instructorHomePage.newCoursesInfo);
        webElementActions.pause(3000);
        webElementActions.click(instructorHomePage.newCoursesNameBtn);
        assertEquals(instructorHomePage.newCoursesNameBtn.getText(), "New Courses Name (143241)");
        webElementActions.click(instructorHomePage.homeButton);
    }

    @Test(priority = 10)
    @Description("C240 - Instructor can click IT helper")
    @Feature("IT helper")
    public void clickItHelperOne() {
        webElementActions.click(instructorHomePage.asTableBtn);
        webElementActions.moveToElement(instructorHomePage.itHelperInfoOne);
        webElementActions.pause(3000);
        webElementActions.click(instructorHomePage.itHelperOneBtn);
        assertTrue(instructorHomePage.itHelperOneBtn.isEnabled());
        webElementActions.click(instructorHomePage.homeButton);
    }

    @Test(priority = 11)
    @Description("C241 - Instructor can click second IT helper")
    @Feature("IT helper #2")
    public void clickItHelperTwo() {
        webElementActions.moveToElement(instructorHomePage.itHelperInfoTwo);
        webElementActions.pause(3000);
        webElementActions.click(instructorHomePage.itHelperTwoBtn);
        assertTrue(instructorHomePage.itHelperTwoBtn.isEnabled());
        webElementActions.click(instructorHomePage.homeButton);
    }
    @Test(priority = 12)
    @Description("C242 - Verify that Instructor can click List button")
    @Feature("List Button")
    public void clickAsListBtn(){
        webElementActions.click(instructorHomePage.asListBtn);
        assertTrue(instructorHomePage.generalAssertForList.getText().contains("General"));
    }

    @Test(priority = 13)
    @Description("C243 - Verify that learner can click will School")
    @Feature("Will School")
    public void clickIconWillSchool() {
        webElementActions.click(instructorHomePage.asTableBtn);
        webElementActions.moveToElement(instructorHomePage.willSchoolInfo);
        webElementActions.pause(5000);
        webElementActions.click(instructorHomePage.willSchoolInfo);
        assertTrue(instructorHomePage.willSchoolInfo.isDisplayed());
        webElementActions.click(instructorHomePage.popUpClose);
    }

}
