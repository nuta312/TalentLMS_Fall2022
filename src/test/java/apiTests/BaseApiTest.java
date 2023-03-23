package apiTests;

import com.talentLMS.API.controllers.BaseTalentController;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@Slf4j
public class BaseApiTest {
    protected static final String ADMIN_NAME = "AMA232323N";
    protected BaseTalentController talentController = new BaseTalentController();

    @BeforeSuite
    public void beforeSuite() {
        log.warn("================START API TESTS================");
    }

    @AfterSuite
    public void afterSuite() {
        log.warn("================END API TESTS================");
    }

}
