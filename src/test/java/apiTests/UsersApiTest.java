package apiTests;

import com.talentLMS.API.asserts.ApiAsserts;
import com.talentLMS.API.controllers.UserController;
import com.talentLMS.API.pojo.User;
import com.talentLMS.API.utils.RandomEntities;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static com.talentLMS.API.talentLmsApi.EndPoints.EMAIL;
import static com.talentLMS.API.talentLmsApi.EndPoints.ID;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.testng.AssertJUnit.assertEquals;

@Slf4j
public class UsersApiTest extends BaseApiTest {
    private UserController userController;
    private Response response;
    private User[] users;


    @BeforeClass
    public void beforeClass() {
        userController = talentController.getUserController();
    }

    @Test(priority = 1)
    public void receiveUsersTest() {
        users = userController.getUsers().as(User[].class);
//        assertEquals(ADMIN_NAME, users[0].getFirstName());.
        ApiAsserts.assertThatResponse(userController.getResponse())
                .isCorrectHttpStatusCode(HTTP_OK);
//                .fieldOfUser(ADMIN_NAME);
    }

    @Test(dependsOnMethods = "receiveUsersTest")
    public void receiveUserTestWithEmail() {
        for (User user : users) {
            userController.getUserBy(EMAIL, user.getEmail());
            ApiAsserts.assertThatResponse(userController.getResponse())
                    .isCorrectHttpStatusCode(HTTP_OK);
        }
    }

    @Test(dependsOnMethods = "receiveUsersTest")
    public void receiveUserTestWithId() {
        for (User user : users) {
            userController.getUserBy(ID, user.getId());
            ApiAsserts.assertThatResponse(userController.getResponse())
                    .isCorrectHttpStatusCode(HTTP_OK);
        }
    }

    @Test(dependsOnMethods = "receiveUsersTest")
    public void createUser() {
        userController.createUser(RandomEntities.generateUser());
        ApiAsserts.assertThatResponse(userController.getResponse())
                .isCorrectHttpStatusCode(HTTP_OK);
    }
}
