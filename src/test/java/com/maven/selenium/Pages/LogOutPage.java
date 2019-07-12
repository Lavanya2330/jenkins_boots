package com.maven.selenium.Pages;

import com.maven.selenium.driver.DriverFactory;
import org.openqa.selenium.By;

public class LogOutPage extends DriverFactory {
        public void logOut(){
            driver.findElement(By.id("loggedIn_name")).click();
            driver.findElement(By.id("signOutQuickLink")).click();
        }
}
