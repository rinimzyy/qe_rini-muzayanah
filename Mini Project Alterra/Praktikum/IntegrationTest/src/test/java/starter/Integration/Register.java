package starter.Integration;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By fullNameField() {
        return By.id("input-18");
    }

    private By emailField() {
        return By.id("input-21");
    }

    private By passwordField() {
        return By.id("input-24");
    }

    private SearchableTarget registerButton() {
        return Button.withText("Register");
    }

    private SearchableTarget loginButton() {
        return Button.withText("Login");
    }

    private WebElementFacade alertMessage() {
        WebElementFacade divElement = find(By.xpath("//div[@role='alert']"));
        // Return the WebElementFacade object
        return divElement;
    }

    @Step
    public static OpenUrl url(String targeturl) {
        return new OpenUrl(targeturl);
    }

    @Step
    public void validateOnRegisterPage() {
        $(registerButton()).isDisplayed();
    }

    @Step
    public void inputFullName(String fullName) {
        $(fullNameField()).type(fullName);
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }

    @Step
    public void redirectedToLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void allertAppear() {
        $(alertMessage()).isDisplayed();
    }
}
