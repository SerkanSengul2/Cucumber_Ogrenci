package Utilities;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Locale;

public class GWD_old {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        if (driver==null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        }
        return driver;


    }


    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        if (driver!=null) {
            driver.quit();
            driver=null;
        }
    }


}


