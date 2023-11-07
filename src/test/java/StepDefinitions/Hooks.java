package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {

    @Before
    public void Before() {

    }

    @After
    public void After(Scenario senaryo) {

        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/SenaryoSonuclari3.xlsx",senaryo);
//        if (senaryo.isFailed()) {
//
//            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
//            byte[] hafizadakihali = ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakihali,"image/png","screenshot name");
//        }





        GWD.quitDriver();
    }
}
