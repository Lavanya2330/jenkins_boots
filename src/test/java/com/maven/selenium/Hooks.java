package com.maven.selenium;

import com.maven.selenium.driver.DriverFactory;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.getUrl();
        driverFactory.maxBrowser();
        driverFactory.manageWait();
    }

    //  @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}
