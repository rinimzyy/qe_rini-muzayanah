package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;
import starter.login.Product;

public class ProductSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    Product product;

    @Given("I already on homepage")
    public void onHomePage(){
        login.openUrl("https://www.sepulsa.com/");
        home.validateOnTheHomePage();
    }
    @When("I click Pulsa button")
    public void clickPulsaButton(){
        product.pulsaButton();
    }
    @And("I enter my valid phone number")
    public void enterValidNumber(){
        product.inputNumber("085156237482");
    }
    @Then("I can choose a product")
    public void chooseProduct(){
        product.clickProduct();
    }
    @And("I redirected to payment method")
    public void redirectToPaymentPage(){
        product.onThePaymentPage();
    }

    @Given("I already on web homepage")
    public void onWebHomePage(){
        login.openUrl("https://www.sepulsa.com/");
        home.validateOnTheHomePage();
    }
    @When("I click the Pulsa button")
    public void clickThePulsaButton(){
        product.pulsaButton();
    }
    @And("I enter 14 digit phone number")
    public void enter14Number(){
        product.inputNumber("0851562374820");
        product.inputNumber("1");
    }
    @Then("A warning appears that the telephone number exceeds the maximum limit")
    public void warningDisplayed(){
        product.warningDisplayed();
    }
}
