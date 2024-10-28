package StepDefiniton;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After; // After ı cuucmber dan aldığını kontrol et
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // Cucumber'a ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after(Scenario scenario) // Cucumberın otomatik senaryo ile ilgili bilgiler değişkeni
    {
        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestResults.xlsx",
                scenario.getName(),
                scenario.isFailed() ? "Failed" : "Passed");

        // sadece extend report plugin devrede ise aç
        // if (scenario.isFailed()) {
        //     TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
        //     byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
        //     scenario.attach(hafizadakiHali, "image/png", "screenshot name");
        // }

        GWD.quitDriver();
    }
}
