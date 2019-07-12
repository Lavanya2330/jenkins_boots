package com.maven.selenium.Pages;

import com.maven.selenium.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends DriverFactory {
    private Actions actions = new Actions(driver);
    public void login(){
        driver.findElement(By.cssSelector("input[data-gigya-name=loginID]")).sendKeys("ra.lavanyaa@gmail.com");
      //  actions.moveToElement(email,1,1).sendKeys("ra.lavanyaa@gmail.com").perform();
        driver.findElement(By.className("gigya-input-password")).sendKeys("Daffodils230");
        driver.findElement(By.cssSelector(".gigya-input-submit")).click();
    }
    public String getWelcomeMessage(){
        String message = driver.findElement(By.cssSelector(".my_account_header")).getText();
        return message;
    }
}
