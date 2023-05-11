package starter.Integration;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Integration extends PageObject {
    private By emailField(){
        return By.id("input-32");
    }
    private By passwordField(){
        return By.id("input-35");
    }
    @Step
    public void inputEmail(String username){ $(emailField()).type(username);}
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
}
