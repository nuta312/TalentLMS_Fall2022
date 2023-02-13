package com.talentLMS.UI.page.сategory;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Farrukh Ashirbaev
 */
public class CreateCategoryPage extends BasePage {

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    private WebElement addCategoryTitleInHeader;

    @FindBy(xpath ="//label[@class='control-label tl-mandatory-label']")
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
    private List <WebElement> categoryParentListDDL;

    
    public CreateCategoryPage fillInFieldName(){
        elementActions.sendKeys(nameField, mock.generateMockFirstname());
        return this;
    }

    public CreateCategoryPage openParentCategoryDDL(){
        elementActions.click(parentCategoryDDL);
        return this;
    }
    
    public CreateCategoryPage selectStringInDdl() {
        String samples = "Samples";
        var a = categoryParentListDDL.get(categoryParentListDDL.size()).getText();


        return this;
    }
}
