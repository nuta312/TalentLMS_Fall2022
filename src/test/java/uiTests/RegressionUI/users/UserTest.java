package uiTests.RegressionUI.users;

import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
/**
 * @author Kyial Bolotbaeva
 */


public class UserTest extends BaseUiTest {
    @Test(priority = 1)
    @Description(" Check access to user list ")
    public void VerifyColumnsOfUserList(){
        adminHomePage.clickAdminUserBtn();
        assertEquals(userPage.columnUser.getText(),"USER");
        assertEquals(userPage.columnEmail.getText(),"EMAIL");
        assertEquals(userPage.columnUserType.getText(),"USER TYPE");
        assertEquals(userPage.columnRegistration.getText(),"REGISTRATION");
        assertEquals(userPage.columnLastLogin.getText(),"LAST LOGIN");
        assertEquals(userPage.columnOptions.getText(),"OPTIONS");
        addUserPage.clickHomeBtn();
    }
    @Test(priority = 2)
    @Description(" Remove user from the UserList ")
    public void deleteUser()  {
        try {
            adminHomePage.clickAdminUserBtn();
            userPage.deletingUser();
        } catch (Exception e){
            e.printStackTrace();
        }
        addUserPage.clickHomeBtn();
    }

    @Test(priority = 3)
    @Description(" Verify add user as administration ")
    public void createNewUserInActive(){
            adminHomePage.clickAdminAddUserBtn();
            if (addUserPage.firstNameInput.isEnabled()) {
                addUserPage.createNewUser();
                addUserPage.clickSubmitAddUserBtn();
                assertTrue(addUserPage.successMessage.isDisplayed());
                assertEquals(addUserPage.coursePage.getText(), "Courses");
            }
            else {
                String except = "You have just reached your active users limit. To add more users, ";
                assertTrue(addUserPage.errMessageLimit.getText().contains(except));
            }
        }
    @Test(priority = 4)
    @Description(" Verify new User in UserList ")
    public void verifyNewUser() {
        addUserPage.clickUsersBtn();
        userPage.findNewUser();
        String expectedNewUser = addUserPage.firstName.charAt(0) + ". " + addUserPage.lastName;
        System.out.println(expectedNewUser);
        assertTrue(userPage.userNameList.contains(expectedNewUser));
        addUserPage.clickHomeBtn();
    }

    @Test(priority = 5)
    @Description(" Have a limit when adding simple users no more than 4")
    public void createNewUser(){
        adminHomePage.clickAdminUserBtn();
        userPage.clickAddUserBtn();
        try {
            int i = 1;
            do {
                addUserPage.createNewUser()
                        .clickExcludeBtn()
                        .clickSubmitAddUserBtn()
                        .clickHomeBtn();
                adminHomePage.clickAdminAddUserBtn();
                ++i;
            } while(i <= 5);
        } catch (Exception e){

            String except = "You have just reached your active users limit. To add more users, ";
            assertTrue(addUserPage.errMessageLimit.getText().contains(except));
        }
    }
}
