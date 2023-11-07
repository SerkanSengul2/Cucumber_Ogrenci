package StepDefinitions;


import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io");

    }
    @When("Enter username and password and click Login Button")
    public void enter_username_and_password_and_click_login_button() {
        dc.MysendKeys(dc.usuername, "turkeyts");
        dc.MysendKeys(dc.password, "TechnoStudy123");
        dc.Myclick(dc.LoginButton);
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.VerifycontainsText(dc.txtTechnoStudy, "");
    }
}