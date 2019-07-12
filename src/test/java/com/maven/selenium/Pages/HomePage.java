package com.maven.selenium.Pages;

import com.maven.selenium.driver.DriverFactory;

import com.maven.selenium.utils.Helpers;
import org.openqa.selenium.By;

public class HomePage extends DriverFactory {
    public String getCurrentUrl(){
        String  url = driver.getCurrentUrl();
        return url;
    }

    public void accountLink(){
        driver.findElement(By.id("signInQuickLink")).click();
    }
    public void registerButton(){
        driver.findElement(By.id("WC_AccountDisplay_links_3")).click();
        new Helpers().sleep(3000);
    }
}
