package starter.Integration;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private By dashboard() {
        return By.className("container");
    }
    private By allert() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void logBtnAppear(){
        $(login()).isDisplayed();
    }
    @Step
    public void inputEmail(String username){ $(emailField()).type(username);}
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void ClickLoginButton(){
        $(login()).click();
    }
    @Step
    public void onDashboard(){
        $(dashboard()).isDisplayed();
    }
    @Step
    public void allertAppear(){
        $(allert()).isDisplayed();
    }
}
