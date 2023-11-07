package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _09_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable osman) {
        List<String> items = osman.asList(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement item = ln.GetWebelement(items.get(i));
            ln.Myclick(item);
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable Addlink) {
        List<String> Button = Addlink.asList(String.class);
        for (int i = 0; i < Button.size(); i++) {
            WebElement BtnLink = dc.ElementGet(Button.get(i));
            dc.Myclick(BtnLink);
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.ElementGet(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            dc.MysendKeys(e, yazi);

        }
    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dt) {
        List<String> DeletedItems = dt.asList(String.class);
        for (int i = 0; i < DeletedItems.size(); i++) {
            dc.DeleteItem(DeletedItems.get(i));
        }
    }

}






