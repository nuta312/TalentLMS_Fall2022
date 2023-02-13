package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamificationPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Gamification')]")
    public WebElement gamificationLink;

    ////////////////////////////
    @FindBy(id = "main-gamification-switch")
    public WebElement gamificationSwitchButton;


    // POINT SECTION ELEMENTS
    @FindBy(xpath = "(//div[@class='pull-left onoffswitch'])[1]")
    public WebElement pointsSwitchButton;

    @FindBy(id = "each_login")
    public WebElement eachLoginCheckBox;

    @FindBy(xpath = "//input[@name='login_points']")
    public WebElement loginPointsInputField;

    @FindBy(xpath = "//input[@name='each_unit_completion']")
    public WebElement eachUnitCompletionCheckBox;

    @FindBy(xpath = "//input[@name='unit_completion_points']")
    public WebElement untilCompletionPointsInputField;

    @FindBy(xpath = "//input[@name='each_course_completion']")
    public WebElement eachCourseCompletionCheckBox;

    @FindBy(xpath = "//input[@name='course_completion_points']")
    public WebElement courseCompletionPointsInputField;

    @FindBy(xpath = "//input[@name='each_certification']")
    public WebElement eachCertificationCheckBox;

    @FindBy(xpath = "//input[@name='certification_points']")
    public WebElement certificationPointsInputField;

    @FindBy(xpath = "//input[@name='each_test_completion']")
    public WebElement eachTestCompletionCheckBox;

    @FindBy(xpath = "//input[@name='test_completion_points']")
    public WebElement testCompletionPointsInputField;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-info-icon'])[1]")
    public WebElement testCompletionPointsInfoIcon;

    @FindBy(xpath = "//input[@name='each_assignment_completion']")
    public WebElement eachAssignmentCompletionCheckBox;

    @FindBy(xpath = "//input[@name='assignment_completion_points']")
    public WebElement assignmentCompletionPointsInputField;
    ;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-info-icon'])[2]")
    public WebElement assignmentCompletionPointsInfoIcon;

    @FindBy(xpath = "//input[@name='each_ilt_completion']")
    public WebElement eachIltCompletionCheckBox;

    @FindBy(xpath = "//input[@name='ilt_completion_points']")
    public WebElement iltCompletionPointsInputField;

    @FindBy(xpath = "(//i[@class='icon-info-circle tl-info-icon'])[3]")
    public WebElement iltInfoIcon;

    @FindBy(xpath = "//input[@name='each_discussion_topic_comment']")
    public WebElement eachDiscussionTopicCommentCheckBox;

    @FindBy(xpath = "//input[@name='discussion_topic_comment_points']")
    public WebElement discussionTopicCommentPointsInputField;

    @FindBy(xpath = "//input[@name='each_discussion_upvote_comment']")
    public WebElement eachDiscussionUpvoteCommentCheckBox;

    @FindBy(xpath = "//input[@name='discussion_upvote_comment_points']")
    public WebElement discussionUpvoteCommentPointsInputField;


    // BUDGE SECTION ELEMENTS
    @FindBy(xpath = "(//div[@class='pull-left onoffswitch'])[2]")
    public WebElement budgesSwitchButton;

    @FindBy(xpath = "//div[@class='pull-right hidden-phone hidden-tablet']/a[@class='btn']")
    public WebElement customizeBudgesButton;

    @FindBy(xpath = "//input[@name='activity_badges']")
    public WebElement activityBadgesCheckBox;

    @FindBy(xpath = "//input[@name='learning_badges']")
    public WebElement learningBadgesCheckBox;

    @FindBy(xpath = "//input[@name='test_badges']")
    public WebElement testBadgesCheckBox;

    @FindBy(xpath = "//input[@name='assignment_badges']")
    public WebElement assignmentBadgesCheckBox;

    @FindBy(xpath = "//input[@name='perfectionism_badges']")
    public WebElement perfectionismBadgesCheckBox;

    @FindBy(xpath = "//input[@name='survey_badges']")
    public WebElement surveyBadgesCheckBox;

    @FindBy(xpath = "//input[@name='communication_badges']")
    public WebElement communicationBadgesCheckBox;

    @FindBy(xpath = "//input[@name='certification_badges']")
    public WebElement certificationBadgesCheckBox;


    // LEVEL SECTION ELEMENTS
    @FindBy(xpath = "(//div[@class='pull-left onoffswitch'])[3]")
    public WebElement levelsSwitchButton;

    @FindBy(xpath = "//input[@name='upgrade_level_points_check']")
    public WebElement upgradeLevelPointsCheckBox;

    @FindBy(xpath = "//input[@name='upgrade_level_points']")
    public WebElement upgradeLevelPointsInputField;

    @FindBy(xpath = "//input[@name='upgrade_level_completed_courses_check']")
    public WebElement upgradeLevelCompletedCoursesCheckBox;

    @FindBy(xpath = "//input[@name='upgrade_level_completed_courses']")
    public WebElement upgradeLevelCompletedCoursesInputField;

    @FindBy(xpath = "//input[@name='upgrade_level_badges_check']")
    public WebElement upgradeLevelBadgesCheckBox;

    @FindBy(xpath = "//input[@name='upgrade_level_badges']")
    public WebElement upgradeLevelBadgesInputField;


    // REWARD SECTION ELEMENTS
    @FindBy(xpath = "(//div[@class='pull-left onoffswitch'])[4]")
    public WebElement rewardsSwitchButton;

    @FindBy(xpath = "//input[@name='discount_points_check']")
    public WebElement discountPointsCheckBox;

    @FindBy(xpath = "//input[@name='discount_points_percentage']")
    public WebElement discountPointsPercentageInputField;

    @FindBy(xpath = "//input[@name='discount_points_value']")
    public WebElement discountPointsValueInputField;

    @FindBy(xpath = "//input[@name='discount_badges_check']")
    public WebElement discountBadgesCheckBox;

    @FindBy(xpath = "//input[@name='discount_badges_percentage']")
    public WebElement discountBadgesPercentageInputField;

    @FindBy(xpath = "//input[@name='discount_badges_value']")
    public WebElement discountBadgesValueInputField;

    @FindBy(xpath = "//input[@name='discount_level_check']")
    public WebElement discountLevelCheckBox;

    @FindBy(xpath = "//input[@name='discount_level_percentage']")
    public WebElement discountLevelPercentageInputField;

    @FindBy(xpath = "//input[@name='discount_level_value']")
    public WebElement discountLevelValueInputField;


    //LEADERBOARD SECTION ELEMENTS
    @FindBy(xpath = "(//div[@class='pull-left onoffswitch'])[5]")
    public WebElement leaderBoardSwitchButton;

    @FindBy(xpath = "//input[@name='leaderboard_levels']")
    public WebElement leaderboardLevelsCheckBox;

    @FindBy(xpath = "//input[@name='leaderboard_points']")
    public WebElement leaderboardPointsCheckBox;

    @FindBy(xpath = "//input[@name='leaderboard_badges']")
    public WebElement leaderboardBadgesCheckBox;

    @FindBy(xpath = "//input[@name='leaderboard_courses']")
    public WebElement leaderboardCoursesCheckBox;

    @FindBy(xpath = "//input[@name='leaderboard_certifications']")
    public WebElement leaderboardCertificationsCheckBox;


    //////////
    @FindBy(xpath = "//input[@name='submit_gamification']")
    public WebElement saveBtn;

    @FindBy(xpath = "//a[text()='cancel']")
    public WebElement cancelBtn;

    @FindBy(id = "tl-reset-default-settings-button")
    public WebElement resetToDefaultSettingsBtn;

    @FindBy(id = "tl-reset-gamification-statistics-button")
    public WebElement ResetStatisticsBtn;

    @FindBy(xpath = "//div[text()='Gamification settings updated successfully']")
    public WebElement messageAfterSave;

    @FindBy(xpath = "//div[text()='Operation completed successfully']")
    public WebElement messageAfterReset;

    @FindBy(id = "tl-confirm")
    public WebElement resetToDefaultSettingsWindow;

    @FindBy(id = "tl-confirm-submit")
    public WebElement resetButton;

    @FindBy(id = "//div[@id='tl-confirm']//descendant::a[@class='btn']")
    public WebElement cancelResetBtn;

    public GamificationPage clickElement(WebElement element) {
        elementActions.click(element);
        return this;
    }

    public GamificationPage clickCheckBoxElementsInPointSection() {
        elementActions.click(eachLoginCheckBox)
                .click(eachUnitCompletionCheckBox)
                .click(eachCourseCompletionCheckBox)
                .click(eachCertificationCheckBox)
                .click(eachTestCompletionCheckBox)
                .click(eachAssignmentCompletionCheckBox)
                .click(eachIltCompletionCheckBox)
                .click(eachDiscussionTopicCommentCheckBox)
                .click(eachDiscussionUpvoteCommentCheckBox);
        return this;
    }

    public GamificationPage clickCheckBoxElementsInBadgesSection() {
        elementActions.click(activityBadgesCheckBox)
                .click(learningBadgesCheckBox)
                .click(testBadgesCheckBox)
                .click(assignmentBadgesCheckBox)
                .click(perfectionismBadgesCheckBox)
                .click(surveyBadgesCheckBox)
                .click(communicationBadgesCheckBox)
                .click(certificationBadgesCheckBox);
        return this;
    }

    public GamificationPage clickCheckBoxElementsInLevelsSection() {
        elementActions.click(upgradeLevelPointsCheckBox)
                .click(upgradeLevelCompletedCoursesCheckBox)
                .click(upgradeLevelBadgesCheckBox);
        return this;
    }

    public GamificationPage clickCheckBoxElementsInRewardsSection() {
        elementActions.click(discountPointsCheckBox)
                .click(discountBadgesCheckBox)
                .click(discountLevelCheckBox);
        return this;
    }

    public GamificationPage clickCheckBoxElementsInLeaderBoardSection() {
        elementActions.click(leaderboardLevelsCheckBox)
                .click(leaderboardPointsCheckBox)
                .click(leaderboardBadgesCheckBox)
                .click(leaderboardCoursesCheckBox)
                .click(leaderboardCertificationsCheckBox);
        return this;
    }

    public GamificationPage fillUpAllFieldsInGamificationPage() {
        elementActions.sendKeysWithClear(loginPointsInputField, "15")
                .sendKeysWithClear(untilCompletionPointsInputField, "20")
                .sendKeysWithClear(courseCompletionPointsInputField, "100")
                .sendKeysWithClear(testCompletionPointsInputField, "200")
                .sendKeysWithClear(certificationPointsInputField, "3")
                .sendKeysWithClear(assignmentCompletionPointsInputField, "3")
                .sendKeysWithClear(discussionTopicCommentPointsInputField, "3")
                .sendKeysWithClear(iltCompletionPointsInputField, "10")
                .sendKeysWithClear(discussionUpvoteCommentPointsInputField, "5")
                .sendKeysWithClear(upgradeLevelPointsInputField, "2000")
                .sendKeysWithClear(upgradeLevelCompletedCoursesInputField, "10")
                .sendKeysWithClear(upgradeLevelBadgesInputField, "3")
                .sendKeysWithClear(discountPointsPercentageInputField, "10")
                .sendKeysWithClear(discountPointsValueInputField, "300")
                .sendKeysWithClear(discountBadgesPercentageInputField, "30")
                .sendKeysWithClear(discountBadgesValueInputField, "500")
                .sendKeysWithClear(discountLevelPercentageInputField, "50")
                .sendKeysWithClear(discountLevelValueInputField, "20");
        return this;
    }
}
