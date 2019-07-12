package com.maven.selenium.Pages;

import com.maven.selenium.driver.DriverFactory;
import com.maven.selenium.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends DriverFactory {
    Actions actions = new Actions(driver);
    public void register() {
        Select title = new Select(driver.findElement(By.id("editRegistrationTitle")));
        title.selectByVisibleText("Ms");
        driver.findElement(By.cssSelector(".firstName")).sendKeys("Lavanya");
        driver.findElement(By.cssSelector(".lastName")).sendKeys("ra");
        String email = "ra.lavanyaa" + new Helpers().randomNumber(20)+"@gmail.com";
        System.out.println(email);
        driver.findElement(By.name("reglogonId")).sendKeys("email");
        driver.findElement(By.name("reglogonPassword")).sendKeys("Daffodils230");
        driver.findElement(By.name("reglogonPasswordVerify")).sendKeys("Daffodils230");
        WebElement opt = driver.findElement(By.xpath("//label[@for='opt']/*"));
        actions.moveToElement(opt,1,1).click().build().perform();
        WebElement terms = driver.findElement(By.xpath("//label[@for='termsAndConditions']/*"));
        actions.moveToElement(terms,1,1).click().build().perform();
        driver.findElement(By.linkText("Create my account")).click();
    }
}