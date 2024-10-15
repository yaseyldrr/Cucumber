package StepDefiniton;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DatatableSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinks) {
        List<String> links = dtLinks.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i))); // String adını gönder WebElementi al
        }

    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();

        for (int i = 0; i < buttons.size(); i++) {
            ln.myClick(dc.getWebElement(buttons.get(i))); // String adını gönder WebElementi al
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtBoxAndTexts) {
        List<List<String>> boxAndText = dtBoxAndTexts.asLists();

        for (int i = 0; i < boxAndText.size(); i++) {
            WebElement box = dc.getWebElement(boxAndText.get(i).get(0));
            dc.mySendKeys(box,boxAndText.get(i).get(1));
        }
    }

    @And("User deletes the element from Dialog")
    public void userDeletesTheElementFromDialog(DataTable dtDeletions) {
         List<String> deletions = dtDeletions.asList();

        for (int i = 0; i < deletions.size(); i++) {
            dc.deleteItem(deletions.get(i));
        }
    }

}
