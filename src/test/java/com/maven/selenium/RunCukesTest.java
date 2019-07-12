package com.maven.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , tags = {"@smoke"},plugin = "json:target/cucumber.json")
public class RunCukesTest {
}

