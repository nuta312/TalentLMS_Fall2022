package uiTests.coursesPage;

import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Aidana Temirova
 */

public class ViewCoursesCatalogTest extends BaseUiTest {

    @Test(priority = 1)
    public void goToTheCourses(){
        webElementActions.click(viewCoursesCatalog.coursesLinkBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/course/index");
    }

    @Test (priority = 2)
    public void enterToViewCourseCatalog(){
        webElementActions.click(viewCoursesCatalog.viewCoursesCatalogBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test (priority = 3)
    public void searchCoursesFunctionalityBtn(){
        webElementActions.click(viewCoursesCatalog.searchCoursesFunctionalityBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test(priority = 4)
    public void nameFieldBtn(){
        webElementActions.click(viewCoursesCatalog.nameFieldBtn);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test(priority = 5)
    public void checkBoxSamples(){
        webElementActions.click(viewCoursesCatalog.checkBoxSamples);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test(priority = 6)
    public void courseListOption1(){
        webElementActions.click(viewCoursesCatalog.courseListOption1);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test(priority = 7)
    public void courseListOption2(){
        webElementActions.click(viewCoursesCatalog.courseListOption2);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }

    @Test(priority = 8)
    public void howManyCourses(){
        webElementActions.click(viewCoursesCatalog.howManyCourses);
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/catalog");
    }


}
