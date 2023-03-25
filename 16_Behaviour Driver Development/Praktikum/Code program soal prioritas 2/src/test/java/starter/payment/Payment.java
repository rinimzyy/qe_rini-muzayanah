package starter.payment;

import net.thucydides.core.annotations.Step;

public class Payment {
    @Step("I am on the payment page")
    public void onThePaymentPage(){
        System.out.println("I am on the payment page");
    }
    @Step("I choose payment method example Dana")
    public void choosePaymentMethod(){
        System.out.println("I choose payment method example Dana");
    }
    @Step("I click pay button")
    public void clickPayButton(){
        System.out.println("I click pay button");
    }
    @Step("Redirected to Dana application")
    public void redirectToDanaApp(){
        System.out.println("Redirected to Dana application");
    }
}
