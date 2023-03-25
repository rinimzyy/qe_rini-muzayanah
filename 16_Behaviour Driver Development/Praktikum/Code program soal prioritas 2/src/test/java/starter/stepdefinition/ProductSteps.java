package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.Product;

public class ProductSteps {
    @Steps
    Product product;

    @Given("I am on the product page example pulsa")
    public void onTheProductPage(){
        product.onTheProductPage();
    }
    @When("I enter my number")
    public void enterNumber(){
        product.enterNumber();
    }
    @And("Product list is displayed")
    public void productList(){
        product.productList();
    }
    @Then("I click the product i want")
    public void clickProduct(){
        product.clickProduct();
    }
    @And("Redirected to the payment page")
    public void redirectToPaymentPage(){
        product.redirectToPaymentPage();
    }

}
