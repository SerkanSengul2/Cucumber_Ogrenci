package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_DeleteCitizenShip {
    DialogContent dc = new DialogContent();

    @And("Delete Citizenship name as {string}")
    public void deleteCitizenshipNameAs(String name) {
        dc.DeleteItem(name);
    }
    @Then("i able to see delete mesaage")
    public void iAbleToSeeDeleteMesaage() {
        dc.SuccessfullyDeletedMesage(dc.SuccesfullyDeleted, "success");
    }
}
