package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class _13_ApachePOISteps {

    DialogContent dc = new DialogContent();

    @When("User create citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> tablo = ExcelUtility.getData
                        ("src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx", "testCitizen", 2);

        for (ArrayList<String> satir : tablo) {
            dc.Myclick(dc.Addbutton);
            dc.MysendKeys(dc.NameInput, satir.get(0));
            dc.MysendKeys(dc.ShortName, satir.get(1));
            dc.Myclick(dc.SaveButton);
            dc.VerifycontainsText(dc.SuccessMessage,"success");
        }
    }

    @Then("User delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> tablo = ExcelUtility.getData
                ("src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx", "testCitizen", 2);;

        for (ArrayList<String> satir : tablo) {
            dc.DeleteItem(satir.get(0));
            dc.VerifycontainsText(dc.SuccessMessage,"success");
        }

    }
}
