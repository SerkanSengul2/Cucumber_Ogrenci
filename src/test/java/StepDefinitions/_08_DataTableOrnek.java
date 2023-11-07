package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _08_DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }

    @And("Write Username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable users) {
        List<String> ListUser = users.asList(String.class);
        for (String user : ListUser) {
            System.out.println("user = " + user);
        }
    }

    @And("Write username and Password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable UsersAndPasswords) {
        List<List<String>> Veriler = UsersAndPasswords.asLists(String.class);

        for (int i = 0; i < Veriler.size(); i++) {
            System.out.println("İsim = " + Veriler.get(i).get(0) + "  Şifre= "
                    + Veriler.get(i).get(1));

        }

    }








        }



