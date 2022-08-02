package stepDefinitions;

import configuration.common.WebTestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import java.util.List;

import static configuration.common.GlobalReUsableMethods.verifyText;

public class searchBoxSteps extends WebTestBase {

    HomePage homePage = new HomePage();
    @Given("user is landed on target homepage")
    public void user_is_landed_on_target_homepage() {
        System.out.println("Target home page should land");
    }

    @Given("user enter valid product name")
    public void user_enter_valid_product_name() {
       homePage.enterProductName("Mask");
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        homePage.clickOnSearchButton();
    }

    @Then("user should see the valid product appears")
    public void user_should_see_the_valid_product_appears() {
      verifyText(homePage.verifySearchedProduct,"Popular Filters","Product doesn't show properly");
    }
    @Given("user enter {string} valid product name")
    public void user_enter_valid_product_name(String productName) {
     homePage.enterProductName(productName);
    }
    @Then("user should see {string} the valid product appears")
    public void user_should_see_the_valid_product_appears(String expectedProduct) {
     verifyText(homePage.verifySearchedProduct, expectedProduct,"Product doesn't show");
    }

    @Given("user enter valid {string} products name")
    public void user_enter_valid_products_name(String productName) {
        homePage.enterProductName(productName);
    }
    @Then("user should see the valid {string} products appears")
    public void user_should_see_the_valid_products_appears(String expectedProduct) {
        verifyText(homePage.verifySearchedProduct, expectedProduct,"Product doesn't show");
    }
    @Given("user enter valid product name for search")
    public void user_enter_valid_product_name_for_search(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        // String productName=data.get(1).get(0);

        // homePage.enterProductName(productName);
        homePage.enterProductName(data.get(1).get(0));

    }
    @Then("user should see the valid product appears after search")
    public void user_should_see_the_valid_product_appears_after_search(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String expectedProduct=data.get(1).get(0);
        verifyText(homePage.verifySearchedProduct, expectedProduct,"Product doesn't show");
    }

}
