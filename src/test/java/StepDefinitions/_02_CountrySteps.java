package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.Myclick(ln.Setup);
        ln.Myclick(ln.Parameters);
        ln.Myclick(ln.Countries);
    }
    @When("Create a Country")
    public void createACountry() {
    String CountryName= RandomStringUtils.randomAlphabetic(8);
    String CountrCode=RandomStringUtils.randomNumeric(4);

    dc.Myclick(dc.Addbutton);
    dc.MysendKeys(dc.NameInput,CountryName);
    dc.MysendKeys(dc.CodeInput,CountrCode);
    dc.Myclick(dc.SaveButton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    dc.VerifycontainsText(dc.SuccessMessage,"successfully");
    }

    @When("Create a Country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {

        dc.Myclick(dc.Addbutton);
        dc.MysendKeys(dc.NameInput,name);
        dc.MysendKeys(dc.CodeInput,code);
        dc.Myclick(dc.SaveButton);



    }
}
