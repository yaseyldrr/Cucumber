package Utilities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD_new {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserType = new ThreadLocal<>();

    // driver : Bulunduğu thread deki driver ı verir -> threadDriver.get();
    // driver vermek için -> threadDriver.set(); bulunduğum thread e driver ı ver


    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (browserType.get() == null) {
            browserType.set("chrome");
        }
        // switch case null ı değerlendiremediği için onun kontrolünü başa aldık

        if (threadDriver.get() == null) { // bu hattaki driver null mu ?

            switch (browserType.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
                    break;


            }
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return threadDriver.get();
    }

    public static void quitDriver() {
        // test sonucu ekranı bir süre beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver thread = threadDriver.get();  // hattaki
            threadDriver.set(thread);
        }
    }
}