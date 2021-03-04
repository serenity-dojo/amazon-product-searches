package com.ams.catalog.stepdefinitions;

import com.ams.catalog.actions.navigation.NavigateActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class SearchByCategoryStepDefinitions {

    @Steps
    NavigateActions navigate;

    @Given("{} is on the Amazon home page")
    public void onHomePage(String customerName) {
        navigate.toTheAmazonHomePage();
    }

    @When("Peta navigates through the following categories:")
    public void petaNavigatesThroughTheFollowingCategories(List<Map<String,String>> navigationPath) {
        String department = navigationPath.get(0).get("Department");
        String category = navigationPath.get(0).get("Category");
        navigate.throughTheLeftNavigationPanelTo(department, category);
    }

    @And("she chooses the following category in the menu bar:")
    public void sheChoosesTheFollowingCategoryInTheMenuBar(List<Map<String,String>> menuBarNavigationPath) {
        System.out.println(menuBarNavigationPath);
    }

    @And("she filters the products by:")
    public void sheFiltersTheProductsBy(Map<String, String> filters) {
        System.out.println(filters);
    }

    @Then("the displayed products should include {string}")
    public void theDisplayedProductsShouldInclude(String expectedProduct) {
    }
}
