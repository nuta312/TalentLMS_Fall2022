package com.talentLMS.UI.page.groupsPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

public class AddGroupsPage extends BasePage {
        /**
         * @author Ryskulov Bekzhan
         */
        @FindBy(xpath = "//a[contains(text(), 'Add group')]")
        public WebElement addGroupBtn;
        @FindBy(xpath = "//input[@name='name']")
        public WebElement nameOfGroupInput;
        @FindBy(xpath = "//textarea[@name='description']")
        public WebElement descriptionOfGroupInput;
        @FindBy(xpath = "//input[@name='submit_group']")
        public WebElement submitBtn;
        @FindBy(xpath = "//div/i[@class='icon-plus icon-grid tl-toggle-user']")
        public WebElement addUserToGroupBtn;
        @FindBy(xpath = "//span[@class='label label-registration']")
        public WebElement groupMemberText;
        @FindBy(xpath = "//a[contains(text(), 'Courses')]")
        public WebElement coursesTab;
        @FindBy(xpath = "//div/i[@class='icon-plus icon-grid tl-toggle-course']")
        public WebElement addCourseToGroup;
        @FindBy(xpath = "//span[@class='label label-registration']")
        public WebElement CourseGroupMemberText;
        @FindBy(xpath = "(//a[contains(text(), 'Groups')])[1]")
        public WebElement groupsBtnOnHomePage;
        @FindBy(xpath = "//td[@class=' tl-align-left']")
        public List<WebElement> webTableOfGroups;

        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickGroupsBtnOnHomePage() {
            groupsBtnOnHomePage.click();
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage listOfGroups() {

            for (WebElement list : webTableOfGroups) {
                if(list.getText().equals("TestGroup")) {
                    Assert.assertEquals(list.getText(), "TestGroup");
                }
            }
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickCoursesTab() {
            elementActions.click(coursesTab);
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickAddCourseToGroup() {
            elementActions.click(addCourseToGroup);
            return this;
        }

        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickAddUserToGroupBtn() {
            elementActions.click(addUserToGroupBtn);
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickAddGroupBtn() {
            elementActions.click(addGroupBtn);
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage fillUpNameAndDescriptionOfGroup(String nameOfGroup, String descriptionOfGroup) {
            elementActions.sendKeys(nameOfGroupInput, nameOfGroup).sendKeys(descriptionOfGroupInput, descriptionOfGroup);
            return this;
        }
        public com.talentLMS.UI.page.groupsPage.AddGroupsPage clickSubmitBtn() {
            elementActions.click(submitBtn);
            return this;
        }
    }
