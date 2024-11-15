package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() { // Constructor: elemanları başlatmak için
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement countryName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement countryCode;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2622717266-82 mat-content-hide-toggle']//div")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    @FindBy(xpath = "(//mat-select/div/div/span)[3]")
    public WebElement countrySelect;

    @FindBy(xpath = "(//mat-option)[835]")
    public WebElement uruguay;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> nameList;


    public void verifyContainsText(String value) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"), 0));
        Assert.assertTrue(messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        // Ekranda açık mesaj kalmasın
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }
    public void deleteItem(String deleteName){
        mySendKeys(searchInput,deleteName);
        myClick(searchButton);
        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String elementName) {
        switch (elementName){
            case "addButton" : return this.addButton;
            case "countryName" : return this.countryName;
            case "countryCode" : return this.countryCode;
            case "shortname" : return this.shortName;
            case "saveButton" : return this.saveButton;
            case "integrationCode" : return this.integrationCode;
            case "priorityCode" : return this.priorityCode;
            case "toggleBar" : return this.toggleBar;
            case "saveClose" : return this.saveClose;
            case "countrySelect" : return this.countrySelect;
            case "uruguay" : return this.uruguay;
        }
        return null;
    }
}



