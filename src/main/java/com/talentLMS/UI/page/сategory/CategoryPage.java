package com.talentLMS.UI.page.сategory;

import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.security.PublicKey;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Farrukh Ashirbaev
 */
public class CategoryPage extends BasePage {
    String categoryURL = "https://nuta1bema.talentlms.com/category/index";

    @FindBy(xpath = "//div[@class='tl-empty-result text-center']/div/h3[contains(text(),Categories)]")
    private WebElement categoriesTittle;

    @FindBy(xpath = "//div[@class='tl-empty-result-description']")
    private WebElement categoriesTextHelp;

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    private WebElement categoryNamePage;

    @FindBy(xpath = "//th[@class='tl-align-left sorting_disabled']")
    private WebElement nameHeaderTable;

    @FindBy(xpath = "//th[@class='tl-align-center tl-table-operations-cell sorting_disabled']")
    private WebElement optionTableName;

    @FindBy(xpath = "//div[@id='tl-categories-grid_info']")
    private WebElement categoryGrid;

    @FindBy(xpath = "//a[contains(text(),'Add category')]")
    private WebElement addCategoryBtn;

    @FindBy(xpath = "//a[contains(text(),'View course catalog')]")
    private WebElement viewCourseCatalogBtn;

    @FindBy(xpath = "//a[@title='Save as CSV']")
    private WebElement saveAsCSVBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-large']")
    private WebElement addYourFirstCategoryBtn;

    @FindBy(xpath = "//td/a")
    private List<WebElement> categoryColumnNameInList;

    @FindBy(xpath = "//i[@alt='Edit']")
    private List<WebElement> editColumnCategoryInList;

    @FindBy(xpath = "//i[@alt='Delete']")
    private WebElement removeColumnCategoryInList;

    @FindBy(xpath = "//span[contains(text(),100)]")
    private WebElement priceTitleForCategoryString;

    @FindBy(xpath = "(//tbody/tr[@role='row'])[1]")
    private List<WebElement> categoryStringLine;

    @FindBy(xpath = "//a[@id='tl-confirm-submit']")
    private WebElement removeApproveInPupUp;

    public CategoryPage removeCategoryLine() {
        elementActions.click(removeColumnCategoryInList);
        elementActions.click(removeApproveInPupUp);
        return this;
    }

    public CategoryPage moveToCategoryLine() {
        for (WebElement list : categoryStringLine) {
            if (list != null) {
                elementActions.moveToMouseAction(list);
            }
        }
        return this;
    }

    public CategoryPage checkPriceTitle() {
        String priceAmount = priceTitleForCategoryString.getText().trim();
        Assert.assertEquals(priceAmount, "C$100.00");
        return this;
    }

    public CategoryPage clickOnAddYourFirstCategoryBtn() {
        elementActions.click(addYourFirstCategoryBtn);
        return this;
    }

    public CategoryPage checkCategoriesTitle() {
        String categoriesFirstTitleInBody = categoriesTittle.getText().trim();
        Assert.assertEquals(categoriesFirstTitleInBody, "Categories");
        return this;
    }

    public CategoryPage checkCategoryTxt() {
        String description = categoriesTextHelp.getText().trim();
        Assert.assertEquals(description, "Categories help you organize your courses both in the course catalog and on the learners' dashboard");
        return this;
    }

    public CategoryPage checkURLCategoryPage() {
        elementActions.assertUrlPage(categoryURL);
        return this;
    }

    public CategoryPage backToCategoryPage() {
        elementActions.moveToUrlPage(categoryURL);
        return this;
    }

    public CategoryPage clickAddCategoryBtn() {
        elementActions.click(addCategoryBtn);
        return this;
    }

    public CategoryPage removeAllCategory() {
        for (WebElement list : editColumnCategoryInList) {
            if (list != null) {
                moveToCategoryLine();
                removeCategoryLine();
            } else {
                throw new NoSuchElementException();
            }
        }
        return this;
    }

}
