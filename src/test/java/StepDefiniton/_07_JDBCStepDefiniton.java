package StepDefiniton;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _07_JDBCStepDefiniton {
    DialogContent dc = new DialogContent();

    @Then("Send the Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {
        // 1-DB den datayı oku
        // WEB den (UI) ekrandaki isimleri oku
        // for ile birebir assertion yap

        List<List<String>> dblist = DBUtility.getListData(query);

        System.out.println("database");
        for (int i = 0; i < dblist.size(); i++) {
            System.out.println(dblist.get(i).get(0));
        }
        List<WebElement> UIList = dc.nameList;

        System.out.println("Web");
        for (int i = 0; i < UIList.size(); i++) {
            System.out.print(UIList.get(i).getText() + " ");
        }

        for (int i = 0; i < dblist.size(); i++) {
            Assert.assertEquals(dblist.get(i).get(0), UIList.get(i).getText().trim(),
                    "Couldn't match");

        }

        /*
        // DB den data yı oku
        List<List<String>> dbList = DBUtility.getListData(sorgu);

        // kontorl ediyorum db den okuyabildim mi
        for (int i = 0; i < dbList.size(); i++)
            System.out.println(dbList.get(i).get(0));

        // Webden(UI) dan ekrandaki isimleri oku
        List<WebElement> UIList = dc.nameList; //findElemnts

        //kontrol
        for (int i = 0; i < UIList.size(); i++)
            System.out.println(UIList.get(i).getText());


        // birebir Assert yap
        for (int i = 0; i < dbList.size(); i++)
            Assert.assertEquals(dbList.get(i).get(0),
                    UIList.get(i).getText().trim(),
                    "Eşleştirme yapılamadı");

    }
         */

    }
}
