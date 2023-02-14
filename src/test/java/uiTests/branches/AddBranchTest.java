package uiTests.branches;

import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class AddBranchTest extends BaseUiTest {
    @Test
    public void clickAddUserBtn(){
        branchesPage.clickAddBranchBtn();
    }
}
