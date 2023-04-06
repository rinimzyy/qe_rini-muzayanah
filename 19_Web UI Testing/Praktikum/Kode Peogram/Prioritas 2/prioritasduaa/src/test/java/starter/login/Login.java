package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By usernameField() {
        return By.id("email");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By loginButton(){
        return By.id("submit_login");
    }
    private By errorWarning(){
        return By.id("alert_description");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);
    }
    @Step
    public void validateOnLoginPage(){
        $(loginButton()).isDisplayed();
    }
    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void ClickLoginButton(){
        $(loginButton()).click();
    }
    @Step
    public void warningMessage(){
        $(errorWarning()).isDisplayed();
    }
}