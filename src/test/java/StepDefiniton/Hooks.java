package StepDefiniton;

import Utilities.GWD;
import io.cucumber.java.After; // After ı cuucmber dan aldığını kontrol et
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // Cucumber'a ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after() {
        GWD.quitDriver();
    }

    @After
    public void after(Scenario senaryo) // Cucumberın ototmarik senaryo ile ilgili bilgiler değişkeni
    {
        if (senaryo.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        GWD.quitDriver();
    }
}
