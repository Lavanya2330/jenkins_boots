package com.maven.selenium.StepDef;


import com.maven.selenium.Pages.HomePage;
import com.maven.selenium.Pages.RegistrationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationStepDef {
    private RegistrationPage registrationPage = new RegistrationPage();
    private HomePage homePage = new HomePage();
    @Given("^I am on Homepage$")
    public void i_am_on_Homepage(){
        String currentUrl = homePage.getCurrentUrl();
        assertThat(currentUrl, Matchers.endsWith("com/"));
    }

    @When("^I complete the registration process$")
    public void i_complete_the_registration_process(){
        homePage.accountLink();
        homePage.registerButton();
        registrationPage.register();
    }

    @Then("^I am registered successfully$")
    public void i_am_registered_successfully(){

    }

}

