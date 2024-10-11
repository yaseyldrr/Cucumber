package StepDefiniton;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenshipSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Navigate to Citizenship")
    public void navigateToCitizenship() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a citizenship")
    public void createACitizenship() {
        String countryName = RandomStringUtils.randomAlphanumeric(8);
        String countryShortName = RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.countryName,countryName);
        dc.mySendKeys(dc.shortName,countryShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a Citizenship name as {string} shortcode as {string}")
    public void createACitizenshipNameAsShortcodeAs(String countryName, String countryShortCode) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.countryName,countryName);
        dc.mySendKeys(dc.shortName,countryShortCode);
        dc.myClick(dc.saveButton);
    }
}
