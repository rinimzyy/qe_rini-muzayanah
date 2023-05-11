package starter.Integration;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By user() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By logout() {
        return By.xpath("/html/body/div/div[2]/div/div[2]");

    }
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void userButton(){
        $(user()).click();
    }
    @Step
    public void logoutButton(){ $(logout()).click();}
    @Step
    public void LoginButtonDisplayed(){
        $(login()).isDisplayed();
    }
}
