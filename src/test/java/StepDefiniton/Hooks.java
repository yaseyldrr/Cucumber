package StepDefiniton;

import Utilities.GWD;
import io.cucumber.java.After; // After ı cuucmber dan aldığını kontrol et

public class Hooks {
    // Cucumber'a ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after() {
        GWD.quitDriver();
    }
}
