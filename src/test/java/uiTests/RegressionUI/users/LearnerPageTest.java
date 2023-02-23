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
 * @author Nurzhan
 */

@Epic("Learner")
public class LearnerPageTest extends BaseUiTest {
    @BeforeClass
    public void setUp(){
        webElementActions.moveToElement(learnerHomePage.dropDownBtn);
        webElementActions.click(learnerHomePage.learnerType);
    }


        @Test(priority = 1)
        @Description("Verify that user can select learner type")
        @Feature("Learner")
        public void selectLearnerType() {
            webElementActions.click(learnerHomePage.asTableBtn);
            assertEquals(learnerHomePage.learnerTypeText.getText(), "LEARNER");
            assertTrue(learnerHomePage.homeBtn.isDisplayed());
        }

        @Test(priority = 2)
        @Description("Verify that learner can click new courses name")
        @Feature("New courses name")
        public void clickNewCoursesName() {
            webElementActions.moveToElement(learnerHomePage.iconPlayNewCourses);
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.iconPlayNewCourses);
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 3)
        @Description("Verify that learner can click IT helper")
        @Feature("IT helpet")
        public void clickHelperOne() {
            webElementActions.moveToElement(learnerHomePage.iconPlayItHelper);
            webElementActions.click(learnerHomePage.iconPlayItHelper);
            assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/learner/course/id:187");
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 4)
        @Description("Verify that learner can click IT helper two")
        @Feature("IT helper two")
        public void clickItHelperTwo() {
            webElementActions.moveToElement(learnerHomePage.iconPlayItHelperTwo);
            webElementActions.click(learnerHomePage.iconPlayItHelperTwo);
            assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/learner/course/id:190");
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 5)
        @Description("Verify that learner can click will School")
        @Feature("Will School")
        public void clickIconWillSchool() {
            webElementActions.moveToElement(learnerHomePage.iconPlayWillSchool);
            webElementActions.click(learnerHomePage.iconPlayWillSchool);
            assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/learner/course/id:181");
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 6)
        @Description("Verify that learner can type and search courses")
        @Feature("Search my courses")
        public void checkInputFields() {
            webElementActions.pause(3000);
            webElementActions.sendKeys(learnerHomePage.inputFields, "will school");
            assertTrue(learnerHomePage.iconX.isDisplayed());

        }

        @Test(priority = 7)
        @Description(" Verify that learner can see and select WebTables")
        @Feature("WebTables")
        public void checkAllWebTables() {
            webElementActions.pause(3000);
            assertEquals(learnerHomePage.coursesInProgress.getText(), "courses in progress");
            assertEquals(learnerHomePage.completedCourses.getText(), "completed courses");
            assertEquals(learnerHomePage.trainingTime.getText(), "training time");
            webElementActions.waitElementToBeClickAble(learnerHomePage.badges);
            assertTrue(learnerHomePage.myAchievements.isEnabled());
            webElementActions.waitElementToBeClickAble(learnerHomePage.pointsTwo);
            assertTrue(learnerHomePage.leaderBoard.isEnabled());
        }

        @Test(priority = 8)
        @Description("Verify that learner can click courses catalog")
        @Feature("Course catalog")
        public void clickCoursesCatalog() {
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.coursesCatalogBtn);
            assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/catalog/index");
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 9)
        @Description("Verify that learner can click progress")
        @Feature("Progress")
        public void clickProgress() {
            webElementActions.click(learnerHomePage.progressBtn);
            assertEquals(learnerHomePage.progressBtn.getText(), "Progress");
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 10)
        @Description("Verify that learner can click join group")
        @Feature("Join Group")
        public void clickJoinGroup() {
            webElementActions.pause(3000);
            webElementActions.click(learnerHomePage.joinGroupBtn);
            assertTrue(learnerHomePage.popUpWindow.isDisplayed());
            webElementActions.click(learnerHomePage.iconClose);
        }

        @Test(priority = 11)
        @Description("Verify that learner can click discussion")
        @Feature("Discussion")
        public void clickDiscussion() {
            webElementActions.click(learnerHomePage.discussionBtn);
            assertTrue(learnerHomePage.discussionAssert.isEnabled());
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 12)
        @Description("Verify that learner can click calendar")
        @Feature("Calendar")
        public void clickCalendar() {
            webElementActions.click(learnerHomePage.calendarBtn);
            assertTrue(learnerHomePage.calendarAssert.isEnabled());
            webElementActions.click(learnerHomePage.homeButton);
        }

        @Test(priority = 13)
        @Description("Verify that learner can click iconInfoBox")
        @Feature("IconInfoBox")
        public void clickIconInfoBox() {
            webElementActions.click(learnerHomePage.iconInfoBox);
            assertTrue(learnerHomePage.iconInfoBox.isEnabled());
        }

        @Test(priority = 14)
        @Description(" Verify that learner can click Name button")
        @Feature("Name Button")
        public void clickNameBtn() {
            webElementActions.click(learnerHomePage.nameBtn);
            assertTrue(learnerHomePage.allMenu.isDisplayed());
        }

        @Test(priority = 15)
        @Description("Verify that learner can click iconButtonOne")
        @Feature("Icon button")
        public void clickIconButtonOne() {
            webElementActions.click(learnerHomePage.iconButtonOne);
            assertTrue(learnerHomePage.iconAssert1.isEnabled());
        }

        @Test(priority = 16)
        @Description(" Verify that learner can click icon button Two")
        @Feature("Icon button two")
        public void clickIconButtonTwo() {
            webElementActions.click(learnerHomePage.iconBtnTwo);
            assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/dashboard/index/mode:grid");
            webElementActions.click(learnerHomePage.clickBack);

        }


    }


