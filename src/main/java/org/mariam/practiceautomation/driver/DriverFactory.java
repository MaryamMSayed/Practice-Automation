package org.mariam.practiceautomation.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    public static WebDriver initDriver(String browserName){
        DriverType driverType= DriverType.valueOf(browserName.toUpperCase());
        switch (driverType){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();

            case SAFARI:
                return new SafariDriver();
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
    }
}
