package com.maven.selenium.StepDef;


import com.maven.selenium.Pages.HomePage;
import com.maven.selenium.Pages.LoginPage;
import com.maven.selenium.utils.Helpers;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDef {
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @When("^I login with positive credentials$")
    public void i_login_with_positive_credentials()  {
        homePage.accountLink();
        new Helpers().sleep(300);
        loginPage.login();

    }
    @Then("^the system should navigate to my accounts page$")
    public void the_system_should_navigate_to_my_accounts_page()  {
        String welcomeMessage = loginPage.getWelcomeMessage();
        assertThat(welcomeMessage, Matchers.equalToIgnoringCase("hello Lavanya"));
    }

}

