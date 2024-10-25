package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or  @RegressionTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefiniton"}
)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests{
}

// or ise herhangi biri çağrılır
// and var ise her ikisi de çağrılır