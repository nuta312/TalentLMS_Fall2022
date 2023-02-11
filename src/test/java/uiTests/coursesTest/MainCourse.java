package uiTests.coursesTest;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class MainCourse extends BaseUiTest {

    @Test(priority = 1, description = "Verify that Admin can click Course button")
    public void mainCourse() {
        webElementActions.click(coursePage.clickBtnCourse);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 2, description = "Verify that Admin can click the Box")
    public void checkBox() {
        webElementActions.click(coursePage.clickCheckBoxBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 3, description = "Verify that Admin can see mass actions")
    public void sectionMassActions() {
        webElementActions.click(coursePage.clickMassActionsBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 4, description = "Verify that Admin can search any courses")
    public void sectionSearch() {
        webElementActions.click(coursePage.clickBtnSearch);
    }

    @Test(priority = 5, description = "Verify that Admin can click button filter ")
    public void sectionFilter() {
        webElementActions.click(coursePage.clickBtnFilter);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 6, description = "Verify that Admin can download CDV ")
    public void sectionDownload() {
        webElementActions.click(coursePage.clickBtnDownload);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 7, description = "Verify that Admin can see all options")
    public void sectionOptions() {
        webElementActions.click(coursePage.clickReportBtn);
    }

    @Test(priority = 8, description = "Verify that admin can Go back to course")
    public void goBackTo() {
        webElementActions.click(coursePage.goToBack);
    }

    @Test(priority = 9)
    public void backToCourse() {
        webElementActions.click(coursePage.goBackToCourse);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 10, description = "Verify that Admin can see options")
    public void sectionAllOptions() {
        webElementActions.click(coursePage.clickEditBtn);
    }

    @Test(priority = 11)
    public void backCourses() {
        webElementActions.click(coursePage.backCourses);
    }

    @Test(priority = 12, description = "Verify that Admin can see section report")
    public void sectionReport() {
        webElementActions.click(coursePage.clickDeleteBtn);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 13)
    public void confirmingDelete() {
        webElementActions.click(coursePage.confirmDelete);
        assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/course/index");
    }

    @Test(priority = 14)
    public void addCourse() {
        webElementActions.click(coursePage.addCourseBtn);
        coursePage.createAddCourse();
    }
}
