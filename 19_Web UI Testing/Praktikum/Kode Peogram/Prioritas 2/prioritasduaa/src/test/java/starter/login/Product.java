package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private By pulsa(){
        return By.id("product_type_0");
    }
    private By number(){
        return By.id("phone_number");
    }
    private By productButton(){
        return By.id("Telkomsel Rp15.000");
    }
    private By payment(){
        return By.id("submit_payment");
    }
    private By warning(){
        return By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div/label/p[2]");
    }
    @Step
    public void pulsaButton(){
        $(pulsa()).click();
    }

    @Step
    public void inputNumber(String number){
        $(number()).type(number);
    }
    @Step
    public void clickProduct(){
        $(productButton()).click();
    }
    @Step
    public void onThePaymentPage(){
        $(payment()).isDisplayed();
    }
    @Step
    public void warningDisplayed(){
        $(warning()).isDisplayed();
    }
}
