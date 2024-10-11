package StepDefiniton;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        String countryName = RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf verir
        String countryCode = RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.countryName, countryName);
        dc.mySendKeys(dc.countryCode, countryCode);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String countryName, String countryCode) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.countryName,countryName);
        dc.mySendKeys(dc.countryCode,countryCode);
        dc.myClick(dc.saveButton);
    }
}
