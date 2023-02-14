package uiTests.accountAndSettings;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class GamificationPageTest extends BaseUiTest {

    @Test(description = "Verify that user can go to 'Gamification' link", priority = 1)
    public void GamificationLinkTest() {
        gamificationPage.clickElement(gamificationPage.gamificationLink);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/account/gamification_index");
    }

    @Test(priority = 2)
    @Description("Verify that the user can turn off 'Gamification' settings on with the 'Gamification on-off' switch")
    public void gamificationSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.gamificationSwitchButton);
        assertFalse(gamificationPage.eachLoginCheckBox.isEnabled());
        assertFalse(gamificationPage.activityBadgesCheckBox.isEnabled());
        assertFalse(gamificationPage.upgradeLevelPointsCheckBox.isEnabled());
        assertFalse(gamificationPage.leaderboardLevelsCheckBox.isEnabled());
        assertFalse(gamificationPage.loginPointsInputField.isEnabled());
        assertFalse(gamificationPage.upgradeLevelCompletedCoursesInputField.isEnabled());
        gamificationPage.clickElement(gamificationPage.gamificationSwitchButton);
        assertTrue(gamificationPage.eachLoginCheckBox.isEnabled());
        assertTrue(gamificationPage.activityBadgesCheckBox.isEnabled());
        assertTrue(gamificationPage.upgradeLevelPointsCheckBox.isEnabled());
        assertTrue(gamificationPage.leaderboardLevelsCheckBox.isEnabled());
        assertTrue(gamificationPage.loginPointsInputField.isEnabled());
        assertTrue(gamificationPage.upgradeLevelPointsInputField.isEnabled());
    }

    @Test(priority = 4)
    @Description("Verify that the user can turn off 'POINTS' settings on and off with the 'POINTS on/off' switch")
    public void pointsSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.pointsSwitchButton);
        assertFalse(gamificationPage.eachLoginCheckBox.isEnabled());
        assertFalse(gamificationPage.loginPointsInputField.isEnabled());
        gamificationPage.clickElement(gamificationPage.pointsSwitchButton);
        assertTrue(gamificationPage.eachLoginCheckBox.isEnabled());
        assertTrue(gamificationPage.loginPointsInputField.isEnabled());
    }


    @Test(priority = 5)
    @Description("Verify that the user can turn off 'BADGES' settings on and off with the 'BADGES on/off' switch")
    public void budgesSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.budgesSwitchButton);
        assertFalse(gamificationPage.activityBadgesCheckBox.isEnabled());
        assertFalse(gamificationPage.certificationBadgesCheckBox.isEnabled());
        gamificationPage.clickElement(gamificationPage.budgesSwitchButton);
        assertTrue(gamificationPage.activityBadgesCheckBox.isEnabled());
        assertTrue(gamificationPage.certificationBadgesCheckBox.isEnabled());
    }

    @Test(priority = 6)
    @Description("Verify that the user can turn off 'LEVELS' settings on and off with the 'LEVELS on/off' switch")
    public void levelsSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.levelsSwitchButton);
        assertFalse(gamificationPage.upgradeLevelPointsCheckBox.isEnabled());
        assertFalse(gamificationPage.upgradeLevelPointsInputField.isEnabled());
        gamificationPage.clickElement(gamificationPage.levelsSwitchButton);
        assertTrue(gamificationPage.upgradeLevelPointsCheckBox.isEnabled());
        assertTrue(gamificationPage.upgradeLevelPointsInputField.isEnabled());
    }


    @Test(priority = 7)
    @Description("Verify that the user can turn 'REWARDS' settings on and off with the 'REWARDS on/off' switch")
    public void rewardsSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.rewardsSwitchButton);
        assertTrue(gamificationPage.discountPointsCheckBox.isEnabled());
        assertTrue(gamificationPage.discountLevelPercentageInputField.isEnabled());
        gamificationPage.clickElement(gamificationPage.rewardsSwitchButton);
        assertFalse(gamificationPage.discountPointsCheckBox.isEnabled());
        assertFalse(gamificationPage.discountLevelPercentageInputField.isEnabled());
    }


    @Test(priority = 8)
    @Description("Verify that the user can turn off 'LEADERBOARD' settings on and off with the 'LEADERBOARD on/off' switch")
    public void leaderBoardSwitchButtonTest() {
        gamificationPage.clickElement(gamificationPage.leaderBoardSwitchButton);
        assertFalse(gamificationPage.leaderboardLevelsCheckBox.isEnabled());
        gamificationPage.clickElement(gamificationPage.leaderBoardSwitchButton);
        assertTrue(gamificationPage.leaderboardLevelsCheckBox.isEnabled());
    }

    @Test(priority = 9)
    @Description("Verify that all checkboxes are clickable in the 'Points' section")
    public void pointsSectionCheckBoxTest() {
        gamificationPage.clickCheckBoxElementsInPointSection();
        assertFalse(gamificationPage.eachLoginCheckBox.isSelected());
        assertFalse(gamificationPage.eachUnitCompletionCheckBox.isSelected());
        assertFalse(gamificationPage.eachCourseCompletionCheckBox.isSelected());
        assertFalse(gamificationPage.eachCertificationCheckBox.isSelected());
        assertFalse(gamificationPage.eachTestCompletionCheckBox.isSelected());
        assertFalse(gamificationPage.eachAssignmentCompletionCheckBox.isSelected());
        assertFalse(gamificationPage.eachIltCompletionCheckBox.isSelected());
        assertFalse(gamificationPage.eachDiscussionTopicCommentCheckBox.isSelected());
        assertFalse(gamificationPage.eachDiscussionUpvoteCommentCheckBox.isSelected());
        gamificationPage.clickCheckBoxElementsInPointSection();
        assertTrue(gamificationPage.eachLoginCheckBox.isSelected());
        assertTrue(gamificationPage.eachUnitCompletionCheckBox.isSelected());
        assertTrue(gamificationPage.eachCourseCompletionCheckBox.isSelected());
        assertTrue(gamificationPage.eachCertificationCheckBox.isSelected());
        assertTrue(gamificationPage.eachTestCompletionCheckBox.isSelected());
        assertTrue(gamificationPage.eachAssignmentCompletionCheckBox.isSelected());
        assertTrue(gamificationPage.eachIltCompletionCheckBox.isSelected());
        assertTrue(gamificationPage.eachDiscussionTopicCommentCheckBox.isSelected());
        assertTrue(gamificationPage.eachDiscussionUpvoteCommentCheckBox.isSelected());
    }

    @Test(priority = 11)
    @Description("Verify that all checkboxes are clickable in the 'Badges' section")
    public void badgesSectionCheckBoxTest() {
        gamificationPage.clickCheckBoxElementsInBadgesSection();
        assertFalse(gamificationPage.activityBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.learningBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.testBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.assignmentBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.perfectionismBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.surveyBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.communicationBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.certificationBadgesCheckBox.isSelected());
        gamificationPage.clickCheckBoxElementsInBadgesSection();
        assertTrue(gamificationPage.activityBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.learningBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.testBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.assignmentBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.perfectionismBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.surveyBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.communicationBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.certificationBadgesCheckBox.isSelected());
    }

    @Test(priority = 12)
    @Description("Verify that all checkboxes are clickable in the 'Levels' section")
    public void levelsSectionCheckBoxTest() {
        gamificationPage.clickCheckBoxElementsInLevelsSection();
        assertFalse(gamificationPage.upgradeLevelPointsCheckBox.isSelected());
        assertFalse(gamificationPage.upgradeLevelCompletedCoursesCheckBox.isSelected());
        assertFalse(gamificationPage.upgradeLevelBadgesCheckBox.isSelected());
        gamificationPage.clickCheckBoxElementsInLevelsSection();
        assertTrue(gamificationPage.upgradeLevelPointsCheckBox.isSelected());
        assertTrue(gamificationPage.upgradeLevelCompletedCoursesCheckBox.isSelected());
        assertTrue(gamificationPage.upgradeLevelBadgesCheckBox.isSelected());
    }

    @Test(priority = 13)
    @Description("Verify that all checkboxes are clickable in the 'Rewards' section")
    public void rewardsSectionCheckBoxTest() {
        gamificationPage.clickElement(gamificationPage.rewardsSwitchButton);
        gamificationPage.clickCheckBoxElementsInRewardsSection();
        assertTrue(gamificationPage.discountPointsCheckBox.isSelected());
        assertTrue(gamificationPage.discountBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.discountLevelCheckBox.isSelected());
        gamificationPage.clickCheckBoxElementsInRewardsSection();
        assertFalse(gamificationPage.discountPointsCheckBox.isSelected());
        assertFalse(gamificationPage.discountBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.discountLevelCheckBox.isSelected());
    }

    @Test(priority = 14)
    @Description("Verify that all checkboxes are clickable in the 'Leaderboard' section")
    public void leaderboardSectionCheckBoxTest() {
        gamificationPage.clickCheckBoxElementsInLeaderBoardSection();
        assertFalse(gamificationPage.leaderboardLevelsCheckBox.isSelected());
        assertFalse(gamificationPage.leaderboardPointsCheckBox.isSelected());
        assertFalse(gamificationPage.leaderboardBadgesCheckBox.isSelected());
        assertTrue(gamificationPage.leaderboardCoursesCheckBox.isSelected());
        assertTrue(gamificationPage.leaderboardCertificationsCheckBox.isSelected());
        gamificationPage.clickCheckBoxElementsInLeaderBoardSection();
        assertTrue(gamificationPage.leaderboardLevelsCheckBox.isSelected());
        assertTrue(gamificationPage.leaderboardPointsCheckBox.isSelected());
        assertTrue(gamificationPage.leaderboardBadgesCheckBox.isSelected());
        assertFalse(gamificationPage.leaderboardCoursesCheckBox.isSelected());
        assertFalse(gamificationPage.leaderboardCertificationsCheckBox.isSelected());
    }

    @Test(priority = 15)
    @Description("Verify that the user can fill in all fields")
    public void fillUpAllFieldsTest() {
        gamificationPage.fillUpAllFieldsInGamificationPage();
        assertEquals(gamificationPage.loginPointsInputField.getAttribute("value"), "15");
        assertEquals(gamificationPage.untilCompletionPointsInputField.getAttribute("value"), "20");
        assertEquals(gamificationPage.certificationPointsInputField.getAttribute("value"), "3");
        assertEquals(gamificationPage.assignmentCompletionPointsInputField.getAttribute("value"), "3");
        assertEquals(gamificationPage.upgradeLevelPointsInputField.getAttribute("value"), "2000");
        assertEquals(gamificationPage.discountPointsPercentageInputField.getAttribute("value"), "10");
        assertEquals(gamificationPage.discountPointsValueInputField.getAttribute("value"), "300");
        assertEquals(gamificationPage.discountBadgesPercentageInputField.getAttribute("value"), "30");
        assertEquals(gamificationPage.discountLevelValueInputField.getAttribute("value"), "20");
    }

    @Test(priority = 16)
    @Description("Verify 'Save' button")
    public void SaveButtonTest() {
        String expectedMessage = "Gamification settings updated successfully";
        gamificationPage.clickElement(gamificationPage.saveBtn);
        assertEquals(gamificationPage.messageAfterSave.getText(), expectedMessage);
        assertEquals(gamificationPage.loginPointsInputField.getAttribute("value"), "15");
        assertEquals(gamificationPage.untilCompletionPointsInputField.getAttribute("value"), "20");
        assertEquals(gamificationPage.certificationPointsInputField.getAttribute("value"), "3");
        assertEquals(gamificationPage.assignmentCompletionPointsInputField.getAttribute("value"), "3");
        assertEquals(gamificationPage.upgradeLevelPointsInputField.getAttribute("value"), "2000");
    }


    @Test(priority = 17)
    @Description("Verify 'Reset to default settingsBtn' button")
    public void resetToDefaultSettingsBtnTest() {
        gamificationPage.clickElement(gamificationPage.resetToDefaultSettingsBtn);
        webElementActions.waitElementToBeDisplayed(gamificationPage.resetToDefaultSettingsWindow);
        assertTrue(gamificationPage.resetToDefaultSettingsWindow.isDisplayed());
        String messAfterReset = "Operation completed successfully";
        gamificationPage.clickElement(gamificationPage.resetButton);
        assertEquals(gamificationPage.messageAfterReset.getText() , messAfterReset);
        assertEquals(gamificationPage.loginPointsInputField.getAttribute("value"), "25");
        assertEquals(gamificationPage.untilCompletionPointsInputField.getAttribute("value"), "25");
        assertEquals(gamificationPage.certificationPointsInputField.getAttribute("value"), "150");
        assertEquals(gamificationPage.assignmentCompletionPointsInputField.getAttribute("value"), "1");
        assertEquals(gamificationPage.upgradeLevelPointsInputField.getAttribute("value"), "3000");
    }
}
