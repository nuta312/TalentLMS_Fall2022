package uiTests.userTest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Gulzat
 */

@Epic("Users")
public class UserTest extends BaseUiTest {

    @Test
    @Description("Verify add user input fields ")
    @Feature("Register form")
    public void createNewUserInActive(){

        userPage.clickAddUserBtn();
        addUserPage.createNewUser();
        addUserPage.clickActiveBtn();
        addUserPage.clickSubmitAddUserBtn();
        assertTrue(addUserPage.successMessage.isDisplayed());
        assertEquals(addUserPage.coursePage.getText(),"Courses");
    }

    /**
     * @author Kadyrbekova Nurzhan
     */

    @Test
    @Description("Verify users webTables Head dates")
    @Feature("Users webTable")
    public void testVerifyColumnsOfUserList(){
        assertEquals(userPage.columnUser.getText(),"USER");
        assertEquals(userPage.columnEmail.getText(),"EMAIL");
        assertEquals(userPage.columnUserType.getText(),"USER TYPE");
        assertEquals(userPage.columnRegistration.getText(),"REGISTRATION");
        assertEquals(userPage.columnLastLogin.getText(),"LAST LOGIN");
        assertEquals(userPage.columnOptions.getText(),"OPTIONS");
    }
}
