package uiTests.coursesTest;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;
import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Nuraiym Toktomova
 */

@Epic("Login")
public class TestForBuyCourses extends BaseUiTest {

    @Test(priority = 1,description = "Verify User can Open courses page and Click to button Buy courses functionality ")
    public void openLoginPage() {
        coursesBuyCourseFunc.clickCoursesPage();
        assertEquals(coursesBuyCourseFunc.getCoursesTextButton.getText(), "Home / Course Store");
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/marketplace/talentlibrary_index");

    }

    @Test(priority = 2,description = "Verify that user can click Search button and search videos")
    public void talentLibrarySearchBtn() {
        coursesBuyCourseFunc.searchCourseBtn();
        assertEquals(coursesBuyCourseFunc.videoGetTextButton.getText(), "Home / Course Store / What is Artificial Intelligence? (AIE01)");
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/marketplace/talentlibrary_info/id:573");

    }

    @Test( priority = 3,description = "Verify that user can choose the Name button")
    public void talentLibraryNameBtn() {
      coursesBuyCourseFunc.nameCourseBtn();
      assertEquals(coursesBuyCourseFunc.nameBtn.getText(),"Name");

    }
    @Test(priority = 4,description = "Verify that User can choose language button")
    public void talentLibraryLanguageBtn(){
        coursesBuyCourseFunc.languageBtn();
        assertEquals(coursesBuyCourseFunc.languageBtn.getText(),"English");
    }
    @Test(priority = 5,description = "Verify that User can click on Collections button and choose any collections ")
    public  void talentLibraryCollectionsBtn(){
        coursesBuyCourseFunc.collectionsBtn();
        assertEquals(coursesBuyCourseFunc.collectionsBtn.getText(),"COLLECTIONS");
    }

    @Test(priority = 6,description = "Verify that User can click to Other Course Provider and can Search")
    public void otherCourseProSearchBtn(){
        coursesBuyCourseFunc.otherCourseProBtn();
        assertEquals(coursesBuyCourseFunc.videoGetTextBtn.getText(),"Home / Course Store");
    }

    @Test(priority = 7,description = "Verify that User can click Rating button and choose")
    public void OtherCourseProRatingBtn(){
        coursesBuyCourseFunc.otherCourseProRatingBtn();
        assertEquals(coursesBuyCourseFunc.ratingBtn.getText(),"Rating");
        assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/marketplace");
    }

    @Test(priority = 8,description = "Verify that User can click Categories button")
    public void OtherCourseProCategories(){
        coursesBuyCourseFunc.otherCourseCategBtn();
        assertEquals(coursesBuyCourseFunc.categoriesBtn.getText(),"CATEGORIES");
    }

    @Test(priority = 9,description = "Verify that User can click Providers button")
    public void OtherCourseProBtn(){
        coursesBuyCourseFunc.otherCoursesProviderBtn();
    }

    @Test(priority = 10,description = "Verify that User can click How the Course Store Work ")
    public void CourseStoreBtn(){
        coursesBuyCourseFunc.courseStorePage();
    }





}
