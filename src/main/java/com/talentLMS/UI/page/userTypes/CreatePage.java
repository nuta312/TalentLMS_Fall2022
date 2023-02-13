package com.talentLMS.UI.page.userTypes;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

/**
 *@authorAidaiK
 */
public class CreatePage extends BasePage {
    @FindBy(xpath = "//a[contains(.,'Add user type')]")
    public WebElement addUserTypeLinkBtn;

    @FindBy(xpath = "//a[contains(.,'Add user type')]")
    public WebElement addUserTypeLinkBlueBtn;

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

    @FindBy(xpath = "//ul[@class='dynatree-container']//ul/li[8]//span/span[2]")
    public WebElement userTypeArrowCheckBtn;

    public CreatePage clickAddUserBlueBtn() {
        elementActions.click(addUserTypeLinkBlueBtn);
        return this;
    }

    public CreatePage createAdministrator() {
        elementActions.click(addUserTypeLinkBtn);
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleAdministrator);
        elementActions.click(checkBoxAdministrator).click(checkBoxInstructor).click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    public CreatePage createInstructor() {
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleInstructor);
        elementActions.click(checkBoxInstructor).click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    public CreatePage createLearner() {
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleLearner);
        elementActions.click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(saveBtn);
        return this;
    }

    /**
     * method for negative test
     */

    public CreatePage combinationsInvalidCheckBox() {
        elementActions.sendKeys(nameTypesOfUsers, mock.generateMockFirstname());
        elementActions.click(arrowBtn).click(roleLearner);
        elementActions.click(checkBoxLearner).click(checkBoxGeneral);
        elementActions.click(userTypeArrowCheckBtn);
        elementActions.click(userTypeArrowCheckBtn);
        elementActions.click(saveBtn);
        return this;
    }
}
