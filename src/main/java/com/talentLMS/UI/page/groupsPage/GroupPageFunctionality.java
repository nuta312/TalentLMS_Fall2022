package com.talentLMS.UI.page.groupsPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Aiperi Bozoeva
 */
public class GroupPageFunctionality extends BasePage {

        @FindBy(xpath = "//div[@class='tl-header-tools']//a[contains(text(),'Add group')]")
        public WebElement addGroupBtn;

        @FindBy(xpath = "//th[@class='tl-align-left sorting_asc']")
        public WebElement nameGroup;

        @FindBy(xpath = "//th[@class='tl-align-left hidden-phone sorting']")
        public WebElement descriptionGroup;

        @FindBy(xpath = "//th[@class='tl-align-center tl-table-operations-cell sorting_disabled']")
        public WebElement optionGroup;

        @FindBy(xpath = "//div[@class='tl-table-operations touchable']//i[@alt='Edit']")
        public WebElement editGroupBtn;

        @FindBy(xpath = "//div[@class='tl-table-operations touchable']//i[@alt='Delete']")
        public WebElement deleteGroupBtn;

        @FindBy(xpath = "//td[@class=' tl-align-center tl-table-operations-cell']")
        public WebElement optionsGroupBtn;
//td[@class=' tl-align-center tl-table-operations-cell']

        //div[@class='tl-table-operations-trigger touchable']

        public GroupPageFunctionality clickAddGroupBtn() {
            elementActions.click(addGroupBtn);
            return this;

        }

        public GroupPageFunctionality clickEditGroupBtn() {
            elementActions.click(editGroupBtn);
            return this;
        }
        public GroupPageFunctionality clickDeleteGroupBtn() {
            elementActions.click(deleteGroupBtn);
            return this;
        }
    }
