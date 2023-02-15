package com.talentLMS.UI.page.сategory;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Farrukh Ashirbaev
 */
public class CreateCategoryPage extends BasePage {
    String createCategoryUrl = "https://nuta1bema.talentlms.com/category/create";
    String temporaryName = mock.generateMockAnimalName();
    String bigCategory = "BigCategory";


    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    private WebElement addCategoryTitleInHeader;

    @FindBy(xpath = "//label[@class='control-label tl-mandatory-label']")
    private WebElement nameTitleForField;

    @FindBy(xpath = "//label[@for='s2id_autogen1']")
    private WebElement parentCategoryTitleForField;

    @FindBy(xpath = "//a[@id='show-price']")
    private WebElement priceTitle;

    @FindBy(xpath = "//i[@id='icon-price']")
    private WebElement priceIcon;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement nameField;

    @FindBy(xpath = "//span[@class='select2-arrow']/b")
    private WebElement parentCategoryDDL;

    @FindBy(xpath = "//input[@name='price']")
    private WebElement priceField;

    @FindBy(xpath = "//ul[@class='select2-results']/li/div")
    public List<WebElement> categoryParentListDDL;

    @FindBy(xpath = "//ul[@class='select2-results']/li[@class='select2-results-dept-0 select2-result select2-result-selectable']/div[contains(text(),'BigCategory')]")
    private WebElement existingCategory;

    @FindBy(xpath = "//input[@name='submit_category']")
    private WebElement addCategoryBtn;

    public CreateCategoryPage fillInFieldNameWithUseGenerateRandomName() {
        elementActions.sendKeys(nameField, temporaryName);
        return this;
    }

    public CreateCategoryPage fillInFieldNameWithUsingHardName() {
        elementActions.sendKeys(nameField, bigCategory);
        return this;
    }

    public CreateCategoryPage clickPriceIcon() {
        elementActions.click(priceIcon);
        return this;
    }

    public CreateCategoryPage fillInFieldPrice() {
        elementActions.sendKeys(priceField, "100");
        return this;
    }

    public CreateCategoryPage clickAddCategoryBtn() {
        elementActions.click(addCategoryBtn);
        return this;
    }

    public CreateCategoryPage openParentCategoryDDL() {
        elementActions.click(parentCategoryDDL);
        return this;
    }

    public CreateCategoryPage chooseExistingParentInListOfParentCategory() {
        for (WebElement list : categoryParentListDDL) {
            if (list.getText().equals(bigCategory)) {
                elementActions.click(existingCategory);
            }
        }
        return this;
    }

    public CreateCategoryPage checkUrlCreateCategory() {
        elementActions.assertUrlPage(createCategoryUrl);
        return this;
    }
}
