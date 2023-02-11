package com.talentLMS.UI.page.coursesPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Aidana Temirova
 */
public class ViewCoursesCatalog extends BasePage {

    @FindBy(xpath = "(//div[@class='tl-bold-link']/a)[2]")
    public WebElement coursesLinkBtn;

    @FindBy(xpath = "//a[text()='View course catalog']")
    public WebElement viewCoursesCatalogBtn;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchCoursesFunctionalityBtn;

    @FindBy(xpath = "//span[text()='Name']")
    public WebElement nameFieldBtn;

    @FindBy(xpath = "//a[@class='dynatree-title']")
    public WebElement checkBoxSamples;

    @FindBy(xpath = "//button[@id='catalog-mode-list']")
    public WebElement courseListOption1;

    @FindBy(xpath = "//button[@id='catalog-mode-grid']")
    public WebElement courseListOption2;

    @FindBy(xpath = "//div[@id='grid_course_catalog_info']")
    public WebElement howManyCourses;
}
