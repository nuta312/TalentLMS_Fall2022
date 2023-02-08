package com.talentLMS.UI.page;

import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCoursesPage extends BasePage{
    /**
     * @author Aman Omorbekov
     */

    @FindBy(xpath = "(//div[@class='hidden-phone']/a)[2]")
    public WebElement clickAddCourses;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName;


    @FindBy(xpath = "//a[@class='select2-choice select2-default']")
    public WebElement category;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public WebElement sample;


    @FindBy(xpath = "//textarea[@name=\'description\']")
    public WebElement description;

    @FindBy(xpath = "(//label[@class='checkbox inline'])[1]")
    public WebElement activeCheckBox;

    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveAndSelectBtn;



    public AddCoursesPage clickAddCourses1(){
        elementActions.click(clickAddCourses);


        return this;
    }

    public AddCoursesPage VerifyCourseName (){
        elementActions.sendKeys(inputName, "New Courses Name");

        return this;
    }

    public AddCoursesPage fillCategoryAndSample() {
        elementActions
                .click(category)
                .click(sample);


        return this;
    }

    public AddCoursesPage fillUpDescription(){
        elementActions.sendKeys(description, "This is the best courses");

        return this;
    }
    public AddCoursesPage saveCourseBtn(){
 elementActions.click(saveAndSelectBtn);

        return this;

    }



}

