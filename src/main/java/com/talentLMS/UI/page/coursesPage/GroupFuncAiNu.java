package com.talentLMS.UI.page.coursesPage;

import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nuraiym Toktomova,Aidana Temirova
 */
public class GroupFuncAiNu extends BasePage {

    /**
     *  Courses tab
     */

    @FindBy(xpath = "(//a[contains(text(), 'Groups')])[1]")
    public WebElement GroupBtn;

    @FindBy(xpath = "//i[@class='icon-ellipsis-h tl-table-operations-icon']")
    public WebElement deleteButton;

    @FindBy(id = "tl-confirm-submit")
    public WebElement deleteIkonBtn;

    @FindBy(xpath = "//a[text()='Add group']")
    public WebElement clickAddBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameOfGroupInput;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionOfGroupInput;

    @FindBy(xpath = "//a[text()='Group key']")
    public WebElement groupKeyBtn;

    @FindBy(xpath = "//input[@name='max_redemptions']")
    public WebElement redemtionalBtn;

    @FindBy(xpath = "//a[text()='Price']")
    public WebElement priceBtn;


   @FindBy(id = "group-price")
   public WebElement putPrice;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement addUserToGroupBtn;






    public GroupFuncAiNu clickBtn(){
        elementActions.click(GroupBtn);

        return this;
    }

    public GroupFuncAiNu deleteBtn(){
        elementActions.click(deleteButton);
        elementActions.click(deleteIkonBtn);
        return this;
    }

    public GroupFuncAiNu clickAddBtn(){
        elementActions.click(clickAddBtn);

        return this;
    }

    public  GroupFuncAiNu fillUpNameField(){
        elementActions.click(nameOfGroupInput).sendKeys(nameOfGroupInput,"Nura");
        return this;
    }

    public GroupFuncAiNu fillUpDesc(){
        elementActions.click(descriptionOfGroupInput).sendKeys(descriptionOfGroupInput,"My first course");
        return  this;
    }
    public GroupFuncAiNu clickGroupKey(){
        elementActions.click(groupKeyBtn);
        return this;
    }

    public GroupFuncAiNu clickRedemBtn(){
        elementActions.click(redemtionalBtn);
        return this;
    }
    public GroupFuncAiNu clickPriceBtn(){
        elementActions.click(priceBtn);
        return this;
    }
    public GroupFuncAiNu putPriceButton(){
        elementActions.click(putPrice).sendKeys(putPrice,"30").click(putPrice);
        return this;
    }


    public GroupFuncAiNu userButton(){
        elementActions.click(addUserToGroupBtn);
        return this;
    }






}
