package com.maven.selenium.StepDef;

import com.maven.selenium.Pages.FilterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.number.OrderingComparison;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;

public class FilterStepDef {
        private FilterPage filterPage = new FilterPage();
        @When("^I filter the products within a price range$")
        public void i_filter_the_products_within_a_price_range()  {
            filterPage.selectPriceRange();
        }

        @Then("^I should see the products within the price range$")
        public void i_should_see_the_products_within_the_price_range()  {
            List<Double> actualPriceList = filterPage.getAllTheProductsFilteredByPrice();

            assertThat(actualPriceList, everyItem(OrderingComparison.greaterThanOrEqualTo(0.1)));
            assertThat(actualPriceList, everyItem(OrderingComparison.lessThanOrEqualTo(2.0)));
        }

    }


