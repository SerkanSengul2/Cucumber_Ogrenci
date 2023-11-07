package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class _04_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenship")
    public void navigateToCitizenship() {
        ln.Myclick(ln.Setup);
        ln.Myclick(ln.Parameters);
        ln.Myclick(ln.Citizenship);
    }

    @When("Create a Citizenship")
    public void createACitizenship() {
        String citizenshipName= RandomStringUtils.randomAlphanumeric(8);//8 harf
        String citizenshipShCo= RandomStringUtils.randomNumeric(4); // 4 rakam

        dc.Myclick(dc.Addbutton);
        dc.MysendKeys(dc.NameInput,citizenshipName);
        dc.MysendKeys(dc.ShortName, citizenshipShCo);
        dc.Myclick(dc.SaveButton);
    }

    @When("Create a Citizenship name as {string} short name as {string}")
    public void createACitizenshipNameAsShortNameAs(String name, String shortname) {
        dc.Myclick(dc.Addbutton);
        dc.MysendKeys(dc.NameInput,name);
        dc.MysendKeys(dc.ShortName, shortname);
        dc.Myclick(dc.SaveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.VerifycontainsText(dc.Already_Exists, "already");
        new Actions(GWD.getDriver()).keyDown(Keys.ESCAPE).perform();
    }


}