package starter.login;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class About extends PageObject {
    private By menu(){
        return By.className("bm-burger-button");
    }
    private By aboutButton(){
        return By.id("about_sidebar_link");
    }
    private By details(){
        return By.className("css-jengxu");
    }

    @Step
    public void ClickMenuButton(){
        $(menu()).click();
    }
    @Step
    public void ClickAboutButton(){
        $(aboutButton()).click();
    }
    @Step
    public void detailsPage(){
        $(details()).isDisplayed();
    }
}
