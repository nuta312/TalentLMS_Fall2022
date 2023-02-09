package com.talentLMS.UI.page.userTypes;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
public class CreatePage extends BasePage {
    /**
     * @author Aidai K
     */
    @FindBy(xpath = "//a[contains(.,'Add user type')]")
    public WebElement addUserTypeLinkBtn;

    @FindBy(xpath = "//input[@id='user_type_name']")
    public WebElement nameTypesOfUsers;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement arrowBtn;

    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='Administrator']")
    public WebElement roleAdministrator;

    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='Instructor']")
    public WebElement roleInstructor;

    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='Learner']")
    public WebElement roleLearner;

    @FindBy(xpath = "//ul[@class='dynatree-container']//span[1]//span[2]")
    public WebElement checkBoxAdministrator;

    @FindBy(xpath = "//ul[@class='dynatree-container']/li[2]//span[2]")
    public WebElement checkBoxInstructor;

    @FindBy(xpath = "//ul[@class='dynatree-container']/li[3]//span[2]")
    public WebElement checkBoxLearner;

    @FindBy(xpath = "//ul[@class='dynatree-container']/li[4]//span[2]")
    public WebElement checkBoxGeneral;
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@id='tl-list-user-types']//tbody")
    public List<WebElement> userTypesList;

    @FindBy(xpath = "//*[@class='dataTables_info']//a[2]")
    public WebElement arrowBtnOfTypeUserList;

    @FindBy(xpath = "//ul[@class='dynatree-container']//ul/li[8]//span/span[2]")
    public WebElement userTypeArrowCheckBtn;

    public CreatePage clickAddUserTypeLinkBtn(){
        elementActions.click(addUserTypeLinkBtn);
        return this;
    }

    public CreatePage createAdministrator(){
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleAdministrator);
        elementActions.click(checkBoxAdministrator).click(checkBoxInstructor).click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        elementActions.click(arrowBtnOfTypeUserList);
        return this;
    }

    public CreatePage createInstructor(){
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleInstructor);
        elementActions.click(checkBoxInstructor).click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    public CreatePage createLearner(){
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleLearner);
        elementActions.click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    /**
     * when i get users list in user types page, if there have a lot of users I won't be able to access non-visible items
     * cause of i wrote this method.
     */
//    public CreatePage clickUserTypesListArrowBtn(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", arrowBtnOfTypeUserList);
//        return this;
//    }

    /**
     * methods for negative test
     */
    public CreatePage createNegativeUserTypesName(String name){
        elementActions.sendKeys(nameTypesOfUsers, name);
        elementActions.click(arrowBtn).click(roleLearner);
        elementActions.click(checkBoxInstructor).click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    public CreatePage combinationsInvalidCheckBox(){
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleLearner);
        elementActions.click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(userTypeArrowCheckBtn);
        elementActions.click(userTypeArrowCheckBtn);
        elementActions.click(saveBtn);
        return this;
    }
}
