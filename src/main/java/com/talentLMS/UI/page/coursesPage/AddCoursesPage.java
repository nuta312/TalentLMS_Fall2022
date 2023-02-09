package com.talentLMS.UI.page.coursesPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCoursesPage extends BasePage {
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

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement sampleCheck;

    @FindBy(xpath = "//textarea[@name=\'description\']")
    public WebElement description;

    @FindBy(xpath = "(//label[@class='checkbox inline'])[1]")
    public WebElement activeCheckBox;

    @FindBy(xpath = "//a[@id='show-coursecode']")
    public WebElement fillTheCode;

    @FindBy(xpath = "//input[@name='course_code']")
    public WebElement putNumber;

    @FindBy(xpath = "//a[@id='show-price']")
    public WebElement prise;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement putPrise;

    @FindBy(xpath = "//a[@id='show-level']")
    public WebElement level;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[7]")
    public WebElement chooseLevel;


    @FindBy(xpath = "(//div[@class='select2-result-label'])[6]")
    public WebElement levelNumber;

    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveAndSelectBtn;

    @FindBy(xpath = "(//span//a)[4]")
    public WebElement backToCourses;
    @FindBy(xpath = "tl-align-center tl-grid-checkbox-wrapper hidden-phone sorting_disabled")
    public WebElement moveTo;
    @FindBy(xpath = "//input[@id='tl-grid-checkbox-all']")
    public WebElement clickAllCourses;

    @FindBy(xpath = " //a[@class='btn dropdown-toggle']")
    public WebElement massClick;

    @FindBy(xpath = " (//a[@class='massaction'])[3]")
    public WebElement deleteAll;

    @FindBy(xpath = "//a[@class='btn deletecourses btn-danger']")
    public WebElement deleteBtn;


/*
NEGATIVE
 */

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement openHomePage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName1;


    @FindBy(xpath = " (//span[@class='help-inline'])[1]")
    public WebElement containsEx;

    @FindBy(xpath = " (//span[@class='help-inline'])[1]")
    public WebElement containsEx2;






    public AddCoursesPage VerifyCourseNameNeg (){
        elementActions.sendKeys(inputName1, "");

        return this;
    }
    public AddCoursesPage fillCodeAndPrise1() {
        elementActions.click(fillTheCode).sendKeys(putNumber,"1432411343214321431243124213421341234132413241");
        elementActions.click(prise).sendKeys(putPrise,"1000");
        elementActions.click(level).click(chooseLevel).click(levelNumber);
        return this;}

    public AddCoursesPage openHomePage1(){
        elementActions.click(openHomePage);
        return this;
    }







    /*
    METHODS
     */

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
    public AddCoursesPage fillCodeAndPrise() {
        elementActions.click(fillTheCode).sendKeys(putNumber,"143241");
        elementActions.click(prise).sendKeys(putPrise,"1000");
        elementActions.click(level).click(chooseLevel).click(levelNumber);
        return this;}
    public AddCoursesPage saveCourseBtn(){
 elementActions.click(saveAndSelectBtn);
        return this;
    }
    public AddCoursesPage backToCoursesPage() {
        elementActions.click(backToCourses);
        return this;
    }
    public AddCoursesPage deleteCourses() {
        action.moveToElement(moveTo);
        elementActions.click(clickAllCourses);
        elementActions.click(massClick);
        elementActions.click(deleteAll);
        elementActions.click(deleteBtn);
        return this;
    }







}

