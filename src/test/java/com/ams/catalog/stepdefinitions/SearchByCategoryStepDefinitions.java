package com.ams.catalog.stepdefinitions;

import com.ams.catalog.actions.navigation.NavigateActions;
import com.ams.catalog.actions.navigation.TopMenuNavigation;
import com.ams.catalog.domain.Brand;
import com.ams.catalog.domain.LeftPanelHomeDeptCategory;
import com.ams.catalog.domain.TopMenuCategory;
import com.ams.catalog.tasks.FilterResult;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchByCategoryStepDefinitions {

    @Steps
    NavigateActions navigate;

    @Given("{} is on the Amazon home page")
    public void onHomePage(String customerName) {
        navigate.toTheAmazonHomePage();
    }

    @DataTableType
    public LeftPanelHomeDeptCategory convert(Map<String,String> tableRow){
        return new LeftPanelHomeDeptCategory(
                tableRow.get("Department"),
                tableRow.get("Category")
        );
    }
    @When("Peta navigates through the following categories:")
    public void petaNavigatesThroughTheFollowingCategories(List<LeftPanelHomeDeptCategory> categories) {
        categories.forEach(
                category -> navigate.throughTheLeftHomeDepartmentCategory(category)
        );
    }

    @DataTableType
    public TopMenuCategory convertAnother(Map<String,String> tableRow) {
        return new TopMenuCategory(
                tableRow.get("Category"),
                tableRow.get("Subcategory")
        );
    }
    @Steps
    TopMenuNavigation topMenuNavigation;
    @And("she chooses the following category in the menu bar:")
    public void sheChoosesTheFollowingCategoryInTheMenuBar(List<TopMenuCategory> topMenuCategories) {
        topMenuCategories.forEach(
                topMenuCategory -> topMenuNavigation.navigate(topMenuCategory)
        );
    }
    @DataTableType
    public Brand convertBrand(Map<String,String> tableRow){
       return new Brand(
               tableRow.get("Brand"));
    }

    @And("she filters the products by:")
    public void sheFiltersTheProductsBy(List<Brand> filters) {
        filters.forEach(
                filter -> navigate.filterDogFoodByBrand(filter)
        );

    }
    @Steps
    FilterResult filterResult;

    @Then("the displayed products should include {string}")
    public void theDisplayedProductsShouldInclude(String expectedProduct) {
       List<String> displayedProducts = filterResult.displayedResults();
    }
}
