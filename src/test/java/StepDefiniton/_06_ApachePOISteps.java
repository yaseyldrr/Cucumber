package StepDefiniton;

import ApachePOI._10_Question;
import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOISteps {
    DialogContent dc = new DialogContent();
    @When("User creates a citizenship with ApachePOI")
    public void userCreatesACitizenshipWithApachePOI() {
        // Excelden oku sırasıyla gönder, kaydet

        ArrayList<ArrayList<String>> table = ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen", 2); // 2 sütun getir

        // her bir satırı cizitzenship olarak kaydet
        for (ArrayList<String> row : table) {
            dc.myClick(dc.addButton);
            dc.mySendKeys(dc.countryName,row.get(0));
            dc.mySendKeys(dc.shortName,row.get(1));
            dc.myClick(dc.saveButton);
            dc.verifyContainsText("success");
        }

    }

    @When("User deletes a citizenship with ApachePOI")
    public void userDeletesACitizenshipWithApachePOI() {
        // Excelden oku okudukaarını sırasıyla gönder, sil
        ArrayList<ArrayList<String>> table = _10_Question.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen", 2); // 2 sütun getir

        // her bir satırı cizitzenship olarak kaydet
        for (ArrayList<String> row : table) {
            dc.deleteItem(row.get(0));
            dc.verifyContainsText("success");
        }

    }
}
