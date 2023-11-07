package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _14_JDBCStep {
    DialogContent dc = new DialogContent();

    @Then("Send The Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sql) {
        List<List<String>> dbList = DBUtility.getListData(sql);
        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i).get(0) + "--" + dc.nameList.get(i).getText());
            Assert.assertEquals(dbList.get(i).get(0).trim(), dc.nameList.get(i).getText().trim());
        }
    }
}




