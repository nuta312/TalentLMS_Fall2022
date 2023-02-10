package com.talentLMS.UI.page.accountAndSettings;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Chynara
 */
    public class BasicSettings extends BasePage {

        @FindBy(xpath = "(//div[@class='tl-bold-link'])[10]")
        public WebElement accountSettings;

        @FindBy(xpath = "//input[@name='site_name']")
        public WebElement siteName;

        @FindBy(xpath = "(//span[@class='add-on'])[1]")
        public WebElement numberSiteName;

        @FindBy(xpath = "(//span[@class='add-on'])[2]")
        public WebElement numberSiteDescription;

        @FindBy(xpath = "//input[@name='site_description']")
        public WebElement siteDescription;

        @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
        public WebElement defaultTimeZone;

        @FindBy(xpath = "(//div[@class='select2-result-label'])[5]")
        public WebElement countryChoice;

        @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
        public WebElement dateFormatChoice;

        @FindBy(xpath = "(//div[@class='select2-result-label'])[3]")
        public WebElement dataFormat;

        @FindBy(xpath = "(//div[@class='select2-container tl-select2'])[4]")
        public WebElement timeFormat;

        @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
        public WebElement currencyDollar;

        @FindBy(xpath = "//textarea[@name='announcement']")
        public WebElement announcementText;

        @FindBy(xpath = "//input[@name='disallow_multiple_logins']")
        public WebElement checkBox1;

        @FindBy(xpath = "//input[@name='disable_video_transcoding']")
        public WebElement checkBox2;

        @FindBy(xpath = "//input[@name='hide_from_search_engines']")
        public WebElement checkBox3;

        @FindBy(xpath = "//input[@name='intercom_identity_verification']")
        public WebElement checkBox4;

        @FindBy(xpath = "//input[@name='intercom_secret_key']")
        public WebElement inputCheckBox;

        @FindBy(xpath = "(//span[@class='add-on'])[7]")
        public WebElement inputPatrisiya;

        @FindBy(xpath = "//input[@name='external_catalog']")
        public WebElement courseCheckBox;

        @FindBy(xpath = "//input[@name='show_branch_courses_in_main_catalog']")
        public WebElement courseCheckBox2;

        @FindBy(xpath = "//input[@name='show_course_info_page']")
        public WebElement courseCheckBox3;

        @FindBy(xpath = "(//div[@class='select2-container tl-select2'])[6]")
        public WebElement conferencesCheckBox;

        @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[5]/div")
        public WebElement zoomConferences;

        @FindBy(xpath = "//input[@name='conference_max_users']")
        public WebElement maxInput;

        @FindBy(xpath = "(//a[@class='tl-bold-link tl-basic-toggle-link'])[1]")
        public WebElement customFields;

        @FindBy(xpath = "//*[@id=\"add-course-field-button\"]")
        public WebElement addFields;

        @FindBy(xpath = "//*[@id=\"tl-custom-field-name\"]")
        public WebElement sendName;

        @FindBy(xpath = "(//span[@class='select2-chosen'])[7]")
        public WebElement textChoice;

        @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[3]/div")
        public WebElement typeCheckBox;

        @FindBy(xpath = "//input[@name='submit_field']")
        public WebElement submitAdd;

        @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[4]/div")
        public WebElement dateChoice;

        @FindBy(xpath = "(//a[@class='tl-bold-link tl-basic-toggle-link'])[2]")
        public WebElement customUser;

        @FindBy(xpath = "(//a[text()='Add field'])[2]")
        public WebElement addUsers;

        @FindBy(xpath = "(//input[@type='submit'])[2]")
        public WebElement saveSubmit;

        @FindBy(xpath = "(//i[@class='icon-remove icon-grid'])[1]")
        public WebElement delete1;

        /**
         * Courses tab
         */

        public BasicSettings clickAccountSettings() {
            elementActions.click(accountSettings);
            return this;
        }

        public BasicSettings identityField() {
            elementActions.sendKeysWithClearForMac(siteName,"nuta1bema");
            return this;
        }

        public BasicSettings siteDescription() {
            elementActions.sendKeysWithClearForMac(siteDescription, "Hello to all students");
            return this;
        }

        public BasicSettings localeChoice() {
            elementActions.click(defaultTimeZone);
            elementActions.click(countryChoice);
            return this;
        }

        public BasicSettings dataFormatChoices() {
            elementActions.click(dateFormatChoice);
            elementActions.click(dataFormat);
            return this;
        }

        public BasicSettings timeFormatChoice() {
            elementActions.click(timeFormat);
            return this;
        }

        public BasicSettings currencyChoice() {
            elementActions.click(currencyDollar);
            return this;
        }

        public BasicSettings announcementField() {
            elementActions.sendKeysWithClearForMac(announcementText, "Let only students register");
            return this;
        }

        public BasicSettings security() {
            elementActions.click(checkBox1);
            return this;
        }
        public BasicSettings security2(){
            elementActions.click(checkBox2);
            return this;
        }
        public BasicSettings security3() {
            elementActions.click(checkBox3);
            return this;
        }

        public BasicSettings security4(){
            elementActions.click(checkBox4);
            elementActions.click(inputCheckBox).sendKeys(inputCheckBox,"Patrisiya31");
            return this;
        }

        public BasicSettings courseSettings(){
            elementActions.click(courseCheckBox);
            return this;
        }
        public BasicSettings courseSettings2(){
            elementActions.click(courseCheckBox2);
            return this;
        }
        public BasicSettings courseSettings3(){
            elementActions.click(courseCheckBox3);
            return this;
        }

        public BasicSettings conferencesTake() {
            elementActions.click(conferencesCheckBox);
            return this;
        }
        public BasicSettings conferencesTypeChoice(){
            elementActions.click(zoomConferences);
            return this;
        }
        public BasicSettings inputMax(){
            elementActions.click(maxInput).sendKeysWithClearForMac(maxInput,"100");
            return this;
        }

        public BasicSettings customCurseFields(){
            elementActions.click(customFields);
            return this;
        }
        public BasicSettings customAddFields(){
            elementActions.click(addFields);
            return this;
        }
        public BasicSettings inputName(){
            elementActions.click(sendName).sendKeys(sendName,"JavaHomeWork");
            return this;
        }
        public BasicSettings inputTypeText(){
            elementActions.click(textChoice);
            elementActions.click(typeCheckBox);
            return this;
        }
        public BasicSettings clickAddField(){
            elementActions.click(submitAdd);
            return this;
        }

        public BasicSettings customAddField3(){
            elementActions.click(addFields);
            return this;
        }
        public BasicSettings inputName3(){
            elementActions.click(sendName).sendKeys(sendName, "Algo books");
            return this;
        }
        public BasicSettings inputTypeText3(){
            elementActions.click(textChoice).click(dateChoice);
            return this;
        }
        public BasicSettings clickAddField3(){
            elementActions.click(submitAdd);
            return this;
        }
        public BasicSettings customUser() {
            elementActions.click(customUser);
            return this;
        }
        public BasicSettings customAddUsers(){
            elementActions.click(addUsers);
            return this;
        }
        public BasicSettings customInputUser(){
            elementActions.click(sendName).sendKeys(sendName, "Jamil");
            elementActions.click(textChoice).click(typeCheckBox).click(submitAdd);
            return this;
        }
        public BasicSettings customAddUsers2(){
            elementActions.click(addUsers);
            return this;
        }
        public BasicSettings customInputUser2(){
            elementActions.click(sendName).sendKeys(sendName, "Patrisiya");
            elementActions.click(textChoice).click(dateChoice).click(submitAdd);
            return this;
        }
        public BasicSettings customAddUsers3(){
            elementActions.click(addUsers);
            return this;
        }
        public BasicSettings customInputUser3(){
            elementActions.click(sendName).sendKeys(sendName, "Chynara");
            elementActions.click(textChoice).click(typeCheckBox).click(submitAdd);
            return this;
        }
        public BasicSettings saveClick(){
            elementActions.click(saveSubmit);
            return this;
        }
    }

