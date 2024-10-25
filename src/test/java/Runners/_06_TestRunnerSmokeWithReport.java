package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefiniton"},
        plugin = {"html:target/site/cucumber-pretty.html"} // basit report
)

public class _06_TestRunnerSmokeWithReport extends AbstractTestNGCucumberTests{
}
