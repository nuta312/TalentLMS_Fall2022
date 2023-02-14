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
        @FindBy(xpath = "//a[@title='Groups']")
        public WebElement groupBtn;
        @FindBy(xpath = "//td[@class=' tl-align-left']")
        public List<WebElement> webTableOfGroups;
        @FindBy(xpath = "//a[@id='show-key']")
        public WebElement groupKeyBtn;
        @FindBy(xpath = "//a[@id='show-price']")
        public WebElement groupPriceBtn;
        @FindBy(xpath = "//input[@name='group_key']")
        public WebElement inputKeyOfGroup;
        @FindBy(xpath = "//input[@name='price']")
        public WebElement inputPriceOfGroup;
        @FindBy(xpath = "//div[@class='toast-message']")
        public WebElement textOfSuccsefullyAddedGroup;
        @FindBy(xpath = "(//td[@class=' tl-align-center tl-table-operations-cell'])[2]")
        public WebElement triplePoint;
        @FindBy(xpath = "(//i[@alt='Delete'])[2]")
        public WebElement removeBtn;
        @FindBy(xpath = "//a[@id='tl-confirm-submit']")
        public WebElement submitRemoveBtn;
        @FindBy(xpath = "(//i[@class='icon-pencil icon-grid'])[2]")
        public WebElement editGroupBtn;
        @FindBy(xpath = "//a[contains(text(), 'Users')]")
        public WebElement userBtn;
        public AddGroupsPage clickGroupBtn () {
            groupsBtnOnHomePage.click();
            return this;
        }

        public AddGroupsPage clickEditGroupBtn() {
            editGroupBtn.click();
            return this;
        }

        public AddGroupsPage clickRemoveBtn() {
            removeBtn.click();
            submitRemoveBtn.click();
            return this;
        }

        public AddGroupsPage clickGroupPriceBtn() {
            groupPriceBtn.click();
            return this;
        }

        public AddGroupsPage clickGroupKeyBtn() {
            groupKeyBtn.click();
            return this;
        }

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
