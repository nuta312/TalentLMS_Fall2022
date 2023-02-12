package com.talentLMS.UI.page.сategory;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author Farrukh Ashirbaev
 */
public class CategoryPage extends BasePage {
    String categoryURL = "https://nuta1bema.talentlms.com/category/index";

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

    @FindBy(xpath = "//td/a")
    private List<WebElement> categoryColumnNameInList;

    @FindBy(xpath = "//i[@alt='Edit']")
    private List<WebElement> editColumnCategoryInList;

    @FindBy(xpath = "//i[@alt='Delete']")
    private List<WebElement> removeColumnCategoryInList;

    public CategoryPage checkURLCategoryPage() {
        elementActions.assertUrlPage(categoryURL);
        return this;
    }

    public CategoryPage backToCategoryPage() {
        elementActions.moveToUrlPage(categoryURL);
        return this;
    }

}
