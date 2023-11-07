package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;
import org.testng.TestRunner;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //feature files path gelicek
        glue = {"StepDefinitions"}//stepdefinitons klasör adı


)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
