package com.talentLMS.UI.page.users;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Gulnara Mairykova
 */

public class UserPage extends BasePage {
    public List<String> userNameList = new ArrayList<>();
    @FindBy(xpath = "//th[@class='tl-align-left sorting']")
    public WebElement columnUser;

    @FindBy(xpath = "(//th[@class='tl-align-left hidden-phone sorting'])[1]")
    public WebElement columnEmail;

    @FindBy(xpath = "//th[@aria-label='User type']")
    public WebElement columnUserType;

    @FindBy(xpath = "//th[@class='tl-align-center hidden-phone sorting'][1]")
    public WebElement columnRegistration;

    @FindBy(xpath = "//th[@class='tl-align-center hidden-phone sorting'][text()='Last login']")
    public WebElement columnLastLogin;

    @FindBy(xpath = "//th[@class='tl-align-center tl-table-operations-cell sorting_disabled']")
    public WebElement columnOptions;

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement addUserBtn;


    @FindBy (xpath = "//a[@class='dropdown-toggle tl-nabvar-roles-button']")
    public WebElement dropdownRolesBtn;

    @FindBy (xpath = "//li[@id='tl-dropdown-goto']")
    public WebElement dropdownGoToBtn;

    @FindBy (xpath = "//li[@id='tl-dropdown-messages']")
    public WebElement dropdownMessagesBtn;

    @FindBy (xpath = "//li[@id='tl-dropdown-help']")
    public WebElement dropdownHelpBtn;

    @FindBy(id = "tl-myinfo-option")
    public WebElement dropDownRolesMyInfo;

    @FindBy(id = "tl-mycourses-option")
    public WebElement dropDownRolesMyCourses;

    @FindBy(id = "tl-mycertifications-option")
    public WebElement dropDownRolesMyCertificates;

    @FindBy(id = "tl-myprogress-option")
    public WebElement dropDownRolesMyProgress;

    @FindBy(id = "tl-mygroups-option")
    public WebElement dropDownRolesMyGroups;

    @FindBy(id = "tl-mybranches-option")
    public WebElement dropDownRolesMyBranches;

    @FindBy(id = "tl-myfiles-option")
    public WebElement dropDownRolesMyFiles;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[1]")
    public WebElement dropDownGoToHome;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[2]")
    public WebElement dropDownGoToUsers;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[3]")
    public WebElement dropDownGoToCourses;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[4]")
    public WebElement dropDownGoToCourseStore;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[5]")
    public WebElement dropDownGoToCategories;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[6]")
    public WebElement dropDownGoToGroups;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[7]")
    public WebElement dropDownGoToBranches;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[8]")
    public WebElement dropDownGoToReports;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[9]")
    public WebElement dropDownGoToImportExport;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[10]")
    public WebElement dropDownGoToImportEventsEngine;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[11]")
    public WebElement dropDownGoToImportAccountAndSettings;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[12]")
    public WebElement dropDownGoToAddUser;

    @FindBy(xpath = "(//a[@class='tl-admin-goto'])[13]")
    public WebElement dropDownGoToAddCourse;

    @FindBy(xpath = "//*[@id='tl-dropdown-messages']/ul/li[1]/a")
    public WebElement dropDownMessageGoToInbox;

    @FindBy(xpath = "//*[@id='tl-dropdown-messages']/ul/li[2]/a")
    public WebElement dropDownMessageSendMessage;

    @FindBy(xpath = "//span[@title='Knowledge base']")
    public WebElement dropDownHelpKnowledgeBase;

    @FindBy(xpath = "//span[@title='Tour']")
    public WebElement dropDownHelpTour;

    @FindBy(xpath = "//span[@title='Videos']")
    public WebElement dropDownHelpVideos;

    @FindBy(xpath = "//span[@title='Contact support']")
    public WebElement dropDownHelpContactSupport;

    @FindBy(xpath = "//span[@title='Live support']")
    public WebElement dropDownHelpLiveSupport;

    @FindBy(xpath = "//span[@title='Success manager']")
    public WebElement dropDownHelpSuccessManager;

    @FindBy(xpath = "//input[@id='tl-spotlight']")
    public WebElement dropDownInputField;
    @FindBy(xpath = "(//a[@id='navbar-logout'])[2]")
    public WebElement dropDownLogOutBtn;
    @FindBy(xpath = "//td[@class=' tl-align-left']//span[@title]")
    public List<WebElement> allUserName;
    @FindBy(xpath = "//table[@id='tl-users-grid']/tbody")
    public List<WebElement> allUserList;

    @FindBy(xpath = "//td[@class=' tl-align-left hidden-phone']/span")
    public List<WebElement> allStatusOfUsers;
    @FindBy(xpath = "//div[@class='tl-table-operations-trigger touchable']")
    public List<WebElement> allOptionBtn;
    @FindBy(xpath = "//div[@id='tl-confirm']/div[@class='modal-footer']/a[1]")
    public WebElement deleteOkBtn;
    @FindBy(xpath = "//i[@class='icon-remove icon-grid']")
    public List<WebElement> allDeleteBtn;

    public UserPage clickAddUserBtn() {
        elementActions.click(addUserBtn);
        return this;
    }
    public UserPage findNewUser() {
        for (WebElement userName:allUserName) {
            userNameList.add(userName.getText());
        }
        return this;
    }
    public UserPage deletingUser() {
        for (WebElement option : allOptionBtn) {
            elementActions.moveToMouseAction(option);
            option.findElement(By.xpath("//i[@class='icon-remove icon-grid']")).click();
            elementActions.waitElementToBeClickAble(deleteOkBtn);
            elementActions.click(deleteOkBtn);
        }
        return this;
    }

    public UserPage deletingUser2(){
        for (WebElement userList : allUserList) {
            elementActions.moveToMouseAction(userList);
            for (WebElement statusOfUser : allStatusOfUsers) {
                elementActions.moveToMouseAction(statusOfUser);
                if (!statusOfUser.getText().equals("SuperAdmin")) {
                    for (WebElement toDeleteBtn : allDeleteBtn) {
                        elementActions.click(toDeleteBtn);
                        elementActions.waitElementToBeClickAble(deleteOkBtn);
                        deleteOkBtn.click();
                    }
                } else System.out.println("Hi, You are SuperAdmin");
            }
        }
        return this;
    }

}
