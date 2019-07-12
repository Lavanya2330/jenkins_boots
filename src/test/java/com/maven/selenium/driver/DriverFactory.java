package com.maven.selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver ;
    private String browser = "chrome";
    public void openBrowser(){
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void getUrl(){
        driver.get("https://www.boots.com");
    }
    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void manageWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
