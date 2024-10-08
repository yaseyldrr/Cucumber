package Utilities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {
    private static WebDriver driver; // General WebDriver

    public static WebDriver getDriver() {
        driver = new ChromeDriver();
        return  driver;
    }
}
