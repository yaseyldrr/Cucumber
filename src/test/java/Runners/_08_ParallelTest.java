package Runners;


import Utilities.GWD_new;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_04_CountryMultipleScenarios.feature",
                "src/test/java/FeatureFiles/_03_Citizenship.feature"
        },
        glue = {"StepDefiniton"}
)

public class _08_ParallelTest extends AbstractTestNGCucumberTests {
        @BeforeClass
        @Parameters("browserType")
        public void beforeClass(String browserType) {
                GWD_new.browserType.set(browserType);
                // set edildi
        }

}
