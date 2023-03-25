package starter.product;
import net.thucydides.core.annotations.Step;
public class Product {
    @Step("I am on the product page example pulsa")
    public void onTheProductPage(){
        System.out.println("I am on the product page example pulsa");
    }
    @Step("I enter my number")
    public void enterNumber(){
        System.out.println("I enter my number");
    }
    @Step("Product list is displayed")
    public void productList(){
        System.out.println("Product list is displayed");
    }
    @Step("I click the product i want")
    public void clickProduct(){
        System.out.println("I click the product i want");
    }
    @Step("Redirected to the payment page")
    public void redirectToPaymentPage(){
        System.out.println("Redirected to the payment page");
    }

}
