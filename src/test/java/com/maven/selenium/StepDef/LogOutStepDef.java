package com.maven.selenium.StepDef;

import com.maven.selenium.Pages.HomePage;
import com.maven.selenium.Pages.LogOutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogOutStepDef {
    private LogOutPage logOutPage = new LogOutPage();
    private HomePage homePage = new HomePage();
    @When("^I click logout link$")
    public void i_click_logout_link() {
        logOutPage.logOut();
    }

    @Then("^system should navigate to the homepage$")
    public void system_should_navigate_to_the_homepage() {
        String url = homePage.getCurrentUrl();
        assertThat(url, Matchers.containsString("myAcctMain"));
    }
}
