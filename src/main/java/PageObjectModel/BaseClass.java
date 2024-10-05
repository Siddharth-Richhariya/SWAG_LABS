package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass {
    private static WebDriver driver;

    public static void intiDriver(String browser){
        if (browser != null){
            if (browser.equalsIgnoreCase("chrome")){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-popup-blocking");
                options.addArguments("--disable-infobars");
                driver = new ChromeDriver(options);
            }
            else if (browser.equalsIgnoreCase("edge")){
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-popup-blocking");
                options.addArguments("--disable-infobars");
                driver = new EdgeDriver(options);
            }
            else{
                    throw new IllegalArgumentException("Browser not supported..");
            }
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void openURL(String Url){
        driver.get(Url);
    }

    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
        }
    }
}
