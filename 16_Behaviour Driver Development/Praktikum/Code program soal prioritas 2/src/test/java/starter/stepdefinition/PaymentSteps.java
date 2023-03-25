package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.payment.Payment;

public class PaymentSteps {
    @Steps
    Payment pay;

    @Given("I am on the payment page")
    public void onThePaymentPage(){
        pay.onThePaymentPage();
    }
    @When("I choose payment method example Dana")
    public void choosePaymentMethod(){
        pay.choosePaymentMethod();
    }
    @And("I click pay button")
    public void clickPayButton(){
        pay.clickPayButton();
    }
    @Then("Redirected to Dana application")
    public void redirectToDanaApp(){
        pay.redirectToDanaApp();
    }
}
