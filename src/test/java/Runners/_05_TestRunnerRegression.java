package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
