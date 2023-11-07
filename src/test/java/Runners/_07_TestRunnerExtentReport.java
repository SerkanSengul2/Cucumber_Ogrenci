package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = {"StepDefinitions"}

)
public class _07_TestRunnerExtentReport extends AbstractTestNGCucumberTests {
@AfterClass
    public static void writeExtentReport(){
    ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("User name"));
    ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("User.timezone"));
    ExtentService.getInstance().setSystemInfo("User Name",System.getProperty("User name"));



}
}
