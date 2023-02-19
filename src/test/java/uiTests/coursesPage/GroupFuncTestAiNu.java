package uiTests.coursesPage;


import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

/**
 * @author Aidana Temirova,Nuraiym Toktomova
 */

public class GroupFuncTestAiNu extends BaseUiTest {

    @Test(priority = 1,description = "Verify user to click Group Functionality")
    public void GoToGroupFunc(){
        groupFunc.clickBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/index");
    }

    @Test(priority = 2,description = "Verify as a Admin can delete users")
    public void deleteUsers(){
        groupFunc.deleteBtn();
    }

    @Test(priority = 3,description = " Verify as a Admin to add user")
    public void AddUser(){
        groupFunc.clickAddBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");

    }
    @Test(priority = 4,description = "Verify user can fill up name button")
    public void nameField(){
        groupFunc.fillUpNameField();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }

    @Test(priority = 5,description = "Verify user can fill up descriptions field")
    public void descField(){
        groupFunc.fillUpDesc();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }
    @Test(priority = 6,description = " Verify user can click group key")
    public void GroupKey(){
        groupFunc.clickGroupKey();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }

    @Test(priority = 7,description = "Verify user can click redemtional button")
    public void RedemButton(){
        groupFunc.clickRedemBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }

    @Test(priority = 8,description = "Verify user can click price button")
    public void priceButton(){
        groupFunc.clickPriceBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }

    @Test(priority = 9,description = "Verify user can put any price")
    public void priceFieldclick(){
        groupFunc.putPriceButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/group/create");
    }
    @Test(priority = 10,description = "Verify user can click Add button")
    public void addButton(){
        groupFunc.userButton();

    }



}
