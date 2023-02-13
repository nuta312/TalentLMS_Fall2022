package uiTests.RegressionUI.users;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Jyrgal
 */
@Epic("Users")

public class UsersPageDropdownFieldsTest extends BaseUiTest {

    @Test
    @Description( "Verify that Users can click My info button on dropdown menu")
    public void UsersPageDropdownMenuMyInfoTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyInfo);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/info/id:1");
        assertEquals(driver.findElement(By.xpath("(//a[@href='https://nuta1bema.talentlms.com/user/info/id:1'])[2]")).getText(),"Info");

    }

    @Test
    @Description ( "Verify that Users can click Mi Courses button on dropdown menu")
    public void UsersPageDropdownMenuMyCoursesTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyCourses);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/courses/id:1");
        assertEquals(driver.findElement(By.xpath("(//a[@href='https://nuta1bema.talentlms.com/user/courses/id:1'])[2]")).getText(),"Courses");

    }

    @Test
    @Description ( "Verify that Users can click Mi certificates button on dropdown menu")
    public void UsersPageDropdownMenuMyCertificatesTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyCertificates);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/userinfo/id:1#");
        assertEquals(driver.findElement(By.id("certifications-tab")).getText(),"Certificates");

    }

    @Test
    @Description ( "Verify that Users can click Mi progress button on dropdown menu")
    public void UsersPageDropdownMenuMyProgressTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyProgress);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/userinfo/id:1");
        assertEquals(driver.findElement(By.id("overview-tab")).getText(),"Overview");

    }

    @Test
    @Description ( "Verify that Users can click Mi groups button on dropdown menu")
    public void UsersPageDropdownMenuMyGroupsTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyGroups);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/groups/id:1");
        assertEquals(driver.findElement(By.xpath("(//a[@href='https://nuta1bema.talentlms.com/user/groups/id:1'])[2]")).getText(),"Groups");

    }

    @Test
    @Description ( "Verify that Users can click Mi brunches button on dropdown menu")
    public void UsersPageDropdownMenuMyBranchesTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyBranches);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/branches/id:1");
        assertEquals(driver.findElement(By.xpath("(//a[@href='https://nuta1bema.talentlms.com/user/branches/id:1'])[2]")).getText(),"Branches");

    }

    @Test
    @Description ( "Verify that Users can click Mi files button on dropdown menu")
    public void UsersPageDropdownMenuMyFilesTest() {
        actions.moveToElement(userPage.dropdownRolesBtn).perform();
        webElementActions.click(userPage.dropDownRolesMyFiles);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/files/id:1");
        assertEquals(driver.findElement(By.xpath("(//a[@href='https://nuta1bema.talentlms.com/user/files/id:1'])[2]")).getText(),"Files");

    }

    @Test
    @Description ( "Verify that Users can click Home button on dropdown menu")
    public void UsersPageDropdownMenuHome() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToHome);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/dashboard");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home");

    }

    @Test
    @Description ( "Verify that Users can click Users button on dropdown menu")
    public void UsersPageDropdownMenuUsers() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToUsers);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Users");

    }

    @Test
    @Description ( "Verify that Users can click Course button on dropdown menu")
    public void UsersPageDropdownMenuCourses() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToCourses);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/course/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Courses");

    }
    @Test
    @Description ( "Verify that Users can click Course store button on dropdown menu")
    public void UsersPageDropdownMenuCourseStore() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToCourseStore);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/marketplace/talentlibrary_index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Course Store");

    }
    @Test
    @Description ( "Verify that Users can click Categories button on dropdown menu")
    public void UsersPageDropdownMenuCategories() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToCategories);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/category/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Categories");

    }

    @Test
    @Description ( "Verify that Users can click Groups button on dropdown menu")
    public void UsersPageDropdownMenuGroups() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToGroups);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Groups");

    }

    @Test
    @Description ( "Verify that Users can click Branches button on dropdown menu")
    public void UsersPageDropdownMenuBranches() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToBranches);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/branch/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Branches");

    }

    @Test
    @Description ( "Verify that Users can click Reports button on dropdown menu")
    public void UsersPageDropdownMenuReports() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToReports);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Reports");

    }

    @Test
    @Description ( "Verify that Users can click ImportExport button on dropdown menu")
    public void UsersPageDropdownMenuImportsExports() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToImportExport);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/import");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Import");

    }

    @Test
    @Description ( "Verify that Users can click EventsEngine button on dropdown menu")
    public void UsersPageDropdownMenuImportsEventsEngine() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToImportEventsEngine);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/eventsengine/notification_index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Notifications");

    }

    @Test
    @Description ( "Verify that Users can click AccountAndSettings button on dropdown menu")
    public void UsersPageDropdownMenuImportsAccountAndSettings() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToImportAccountAndSettings);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/account/basic_index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Account & Settings");

    }

    @Test
    @Description ( "Verify that Users can click AddUser button on dropdown menu")
    public void UsersPageDropdownMenuAddUser() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToAddUser);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/user/create");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Users / Add user");

    }

    @Test
    @Description ( "Verify that Users can click AddCourse button on dropdown menu")
    public void UsersPageDropdownMenuAddCourse() {
        actions.moveToElement(userPage.dropdownGoToBtn).perform();
        webElementActions.click(userPage.dropDownGoToAddCourse);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/course/create");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Courses / Add course");

    }

    @Test
    @Description ( "Verify that Users can click GoToInbox button on dropdown menu")
    public void UsersPageDropdownMenuGoToInbox() {
        actions.moveToElement(userPage.dropdownMessagesBtn).perform();
        webElementActions.click(userPage.dropDownMessageGoToInbox);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/message/index");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Messages");

    }

    @Test
    @Description ( "Verify that Users can click SendMessage button on dropdown menu")
    public void UsersPageDropdownMenuSendMessage() {
        actions.moveToElement(userPage.dropdownMessagesBtn).perform();
        webElementActions.click(userPage.dropDownMessageSendMessage);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/message/create");
        assertEquals(driver.findElement(By.xpath("//div[@class='tl-title tl-ellipsis']")).getText(),"Home / Messages / Send message");

    }


    @Test
    @Description ( "Verify that Users can click SendMessage button on dropdown menu")
    public void UsersPageDropdownMenuHelp() {

        actions.moveToElement(userPage.dropdownHelpBtn).perform();
        Assert.assertTrue(userPage.dropDownLogOutBtn.isDisplayed());
        Assert.assertTrue(userPage.dropDownInputField.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpKnowledgeBase.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpTour.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpVideos.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpContactSupport.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpLiveSupport.isDisplayed());
        Assert.assertTrue(userPage.dropDownHelpSuccessManager.isDisplayed());


    }

}
