package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;
import starter.login.Product;
import starter.login.ProductPayment;

public class ProductPaymentSteps {
    @Steps
    Login login;

    @Steps
    Product product;

    @Steps
    ProductPayment payment;

    @Given("I already choose product")
    public void alreadyChooseProduct(){
        login.openUrl("https://www.sepulsa.com/");
        product.pulsaButton();
        product.inputNumber("085156237482");
        product.clickProduct();
    }
    @When("I enter my email")
    public void enterGuestEmail(){
        payment.enterEmail("rimzynh@gmail.com");
    }
    @Then("I click pay method")
    public void clickPayMethod(){
        payment.clickPayMethod();
    }
    @And("I click pay button")
    public void clickPayButton(){
        payment.clickPay();
    }

    @Given("I already choose a product")
    public void alreadyChooseAProduct(){
        login.openUrl("https://www.sepulsa.com/");
        product.pulsaButton();
        product.inputNumber("085156237482");
        product.clickProduct();
    }
    @When("I enter invalid email")
    public void enterInvalidGuestEmail(){
        payment.enterEmail("asashiyamamoto1@gmail.com");
    }
    @Then("I click the pay method")
    public void clickThePayMethod(){
        payment.clickPayMethod();
    }
    @And("I click the pay button")
    public void clickThePayButton(){
        payment.clickPay();
    }
    @And("A warning appears that user must enter a valid email")
    public void warningEmailInvalid(){
        payment.warningEmail();
    }
}
