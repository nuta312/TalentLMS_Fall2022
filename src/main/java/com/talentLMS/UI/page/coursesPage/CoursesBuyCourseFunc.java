package com.talentLMS.UI.page.coursesPage;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nuraiym Toktomova
 */

public class CoursesBuyCourseFunc extends BasePage {

        /**
         *  Courses tab
         */
        @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
        public WebElement coursesTextButton;

        @FindBy(xpath = "//a[text()='Buy courses']")
        public WebElement buyCoursesBtn;

        @FindBy(xpath = "//div[@class ='tl-title tl-ellipsis']")
        public WebElement getCoursesTextButton;


        @FindBy(xpath = "//input[@type='search']")
        public WebElement searchBtn;

        @FindBy(xpath = "//span[text()='What is Artificial Intelligence?']")
        public WebElement videoNameBtn;

        @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
        public WebElement videoGetTextButton;

        @FindBy(xpath = "//a[@title='Course Store']")
        public static WebElement courseStoreBtn;

        @FindBy(xpath = "//span[text()='Name']")
        public WebElement nameBtn;

        @FindBy(xpath = "//a[@class='tl-cursor-pointer sorting-type-option active-sorting-type']")
        public WebElement chooseNameBtn;

        @FindBy(xpath = "//span[@class='tl-current-course-library-language']")
        public WebElement languageBtn;

        @FindBy(xpath = "//a [@class='tl-cursor-pointer course-library-language-option active-course-library-language']")
        public WebElement englishLanguageBtn;

        @FindBy(xpath = "//a[text()=' Collections']")
        public WebElement collectionsBtn;

        @FindBy(xpath = "//a[text()='Other course providers']")
        public WebElement buttonOthersCourse;

        @FindBy(xpath = "//input[@type='search']")
        public WebElement searchButton;

        @FindBy(xpath = "//span[text()='New Manager Essentials Toolkit']")
        public WebElement searchVideoBtn;

        @FindBy(xpath = "//a[@title='Course Store']")
        public static WebElement courseStoreBtn2;

        @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
        public WebElement videoGetTextBtn;

        @FindBy(xpath = "//span[@class='tl-current-sorting-type']")
        public WebElement ratingBtn;

        @FindBy(xpath = "//a[@class='tl-cursor-pointer sorting-type-option active-sorting-type']")
        public WebElement chooseRatingBtn;

        @FindBy(xpath = "(//div[@class='tl-marketplace-categories-providers'])[1]")
        public WebElement categoriesBtn;

        @FindBy(xpath = "//span[text()='Providers']")
        public WebElement providersBtn;

        @FindBy(xpath = "//div[@class='tl-marketplace-info-text']")
        public WebElement storeButton;

        @FindBy(xpath = "(//a[@class='close'])[1]")
        public WebElement closeButton;




        public CoursesBuyCourseFunc clickCoursesPage(){
            elementActions.click(coursesTextButton);
            elementActions.click(buyCoursesBtn);
            elementActions.click(getCoursesTextButton);

            return  this;
        }
        public CoursesBuyCourseFunc searchCourseBtn(){
            elementActions.click(searchBtn).sendKeys(searchBtn,"What is Artificial Intelligence?");
            elementActions.click(videoNameBtn);
            elementActions.click(videoGetTextButton);

            return this;
        }
        public CoursesBuyCourseFunc nameCourseBtn(){
            courseStoreBtn.click();
            elementActions.click(nameBtn);
            elementActions.click(chooseNameBtn);

            return this;
        }
        public  CoursesBuyCourseFunc languageBtn(){
            elementActions.click(languageBtn);
            elementActions.click(englishLanguageBtn);

            return this;
        }
        public CoursesBuyCourseFunc collectionsBtn(){
            elementActions.click(collectionsBtn);

            return this;
        }
        public  CoursesBuyCourseFunc otherCourseProBtn(){
            elementActions.click(buttonOthersCourse);
            elementActions.click(searchButton).sendKeys(searchButton,"New Manager Essentials Toolkit");
            elementActions.click(searchVideoBtn);
            elementActions.click(videoGetTextBtn);
            elementActions.click(courseStoreBtn2);

            return this;
        }

        public CoursesBuyCourseFunc otherCourseProRatingBtn(){
           elementActions.click(ratingBtn);
           elementActions.click(chooseRatingBtn);

            return this;
        }
        public CoursesBuyCourseFunc otherCourseCategBtn(){
            elementActions.click(categoriesBtn);

            return this;
        }
        public CoursesBuyCourseFunc otherCoursesProviderBtn(){
            elementActions.click(providersBtn);

            return this;
        }
        public CoursesBuyCourseFunc courseStorePage(){
            elementActions.click(storeButton)
                    .click(closeButton);
            return this;

        }


    }


