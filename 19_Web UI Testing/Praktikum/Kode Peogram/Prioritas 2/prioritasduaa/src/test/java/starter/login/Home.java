package starter.login;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By title(){
        return By.id("chat_homepage");
    }
    public void validateOnTheHomePage(){
        $(title()).isDisplayed();
    }
}
