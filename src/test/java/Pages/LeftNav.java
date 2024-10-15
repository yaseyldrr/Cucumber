package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement states;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fee'])[1]")
    public WebElement fee;

    public WebElement getWebElement(String elementName) {
        switch (elementName) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "countries":
                return this.countries;
            case "citizenship":
                return this.citizenship;
            case "states":
                return this.states;
            case "nationalities":
                return this.nationalities;
            case "fee":
                return this.fee;
        }
        return null;
    }
}
