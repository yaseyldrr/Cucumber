package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},
        glue = {"StepDefiniton"}
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
    // Bu class tiplerine runner class ı denir

}
// feature pathlerin alınması: ilgili feature dosyasının üzerinde
// sağ tuş -> copypath reference  seç
// content root ile uygun path i al
