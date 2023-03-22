package apiTests;

import com.talentLMS.API.asserts.ApiAsserts;
import com.talentLMS.API.controllers.UserController;
import com.talentLMS.API.pojo.User;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.HTTP_CREATED;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.testng.AssertJUnit.assertEquals;

@Slf4j
public class UsersApiTest extends BaseApiTest {
    private UserController userController;
    private Response response;


    @BeforeClass
    public void beforeClass() {
        userController = talentController.getUserController();
    }

    @Test
    public void receiveUsersTest() {
        User[] users = userController.getUsers().as(User[].class);
        assertEquals(ADMIN_NAME, users[0].getFirstName());
        ApiAsserts.assertThatResponse(userController.getResponse())
                .isCorrectHttpStatusCode(HTTP_CREATED);
    }
}
