package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature",
                "src/test/java/FeatureFiles/_03_Citizenship.feature"
        },
        glue = {"StepDefiniton"}
)

public class _02_TestRunnerFeatures extends AbstractTestNGCucumberTests {
}
