package StepDefiniton;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();


    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Navigated to the site");

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("Username and password have been sent");

        //dc.username.sendKeys("turkeyts");
        //dc.password.sendKeys("TechnoStudy123");
        //dc.loginButton.click();
        //wait scroll click (hepsini yapmak gerekiyor, bu yüzden fonksiyon)

        dc.mySendKeys(dc.username,"turkeyts");
        dc.mySendKeys(dc.password,"TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        System.out.println("User login succesfully");
        dc.verifyLoginText(dc.headText,"Internship");
    }
}
