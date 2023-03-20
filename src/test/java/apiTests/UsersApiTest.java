package apiTests;

import com.talentLMS.API.controllers.UserController;
import com.talentLMS.API.pojo.User;
import io.restassured.response.Response;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.HTTP_OK;

public class UsersApiTest extends BaseApiTest {
    private UserController userController;
    private Response response;

    @BeforeClass
    public void beforeClass() {
        userController = talentController.getUserController();
    }

    @Test
    public void receiveUsersTest() {
        userController.getUsers();
        AssertJUnit.assertEquals(HTTP_OK, userController.getResponse().getStatusCode());
//        AssertJUnit.assertEquals("AMAN", users.getFirstName());
    }
}
