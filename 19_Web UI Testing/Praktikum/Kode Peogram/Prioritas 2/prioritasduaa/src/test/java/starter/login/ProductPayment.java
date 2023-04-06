package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPayment extends PageObject {
    private By guestEmail(){
        return By.name("user.email");
    }
    private By pay(){
        return By.className("MuiButton-label");
    }
    private By method(){return By.id("checkbox Gopay");}
    private By warning(){return By.xpath("//*[@id=\"detail-email-anon\"]/div/div/div/div[1]/p[4]");
    }

    @Step
    public void enterEmail(String guestEmail){
        $(guestEmail()).type(guestEmail);
    }
    @Step
    public void clickPayMethod(){
        $(method()).click();
    }
    @Step
    public void clickPay(){
        $(pay()).click();
    }
    @Step
    public void warningEmail(){
        $(warning()).isDisplayed();
    }
}
