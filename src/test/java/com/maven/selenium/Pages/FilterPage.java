package com.maven.selenium.Pages;

import com.maven.selenium.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FilterPage extends DriverFactory {
        Actions actions = new Actions(driver);
        public void selectPriceRange(){
            driver.findElement(By.cssSelector(".default_facet.title")).click();
            List<WebElement> selectPrices = driver.findElements(By.cssSelector(".facetSelectContainer .facetbutton"));
            System.out.println(selectPrices.size());
            System.out.println(selectPrices);
            for(WebElement selectPrice:selectPrices){
                System.out.println(selectPrice);
                System.out.println(selectPrice.getText());
                WebDriverWait wait = new WebDriverWait(driver,90);
                if(selectPrice.getText().equalsIgnoreCase("between £2 and £5"));
                //  actions.moveToElement(selectPrice,1,1).contextClick().perform();
                selectPrice.click();
                break;
            }
        }

        public List<Double> getAllTheProductsFilteredByPrice(){
            List<Double> getAllThePrices = new ArrayList<>();
            List<WebElement> selectedProducts  = driver.findElements(By.cssSelector(".product_price"));
            for(WebElement selectedProduct:selectedProducts){
                String priceInString = selectedProduct.getText().replace("£","");
                double priceInDouble = Double.parseDouble(priceInString);
                getAllThePrices.add(priceInDouble);
            }
            return getAllThePrices;
        }
    }


