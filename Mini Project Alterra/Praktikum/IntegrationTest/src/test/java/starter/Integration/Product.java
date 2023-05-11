package starter.Integration;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private By category() {
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/div[3]");
    }
    private By gaming() {
        return By.xpath("/html/body/div/div[2]/div/div[1]/div/div");
    }
    private By product() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div/div[2]");
    }
    private By beli() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]");
    }
    private By cart() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]");
    }
    private By detail() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]");
    }

    private By clearCategory() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[2]/div/button");
    }
    private By productDetail() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div");
    }
    private By rating5() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div/div/div/div/button[5]");
    }
    private SearchableTarget bayar() {
        return Button.withText("Bayar");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void categoryList(){
        $(category()).click();
    }
    @Step
    public void clickOneCategory(){
        $(gaming()).click();
    }
    @Step
    public void productGaming(){
        $(product()).isDisplayed();
    }
    @Step
    public void addProduct(){
        $(beli()).click();
    }
    @Step
    public void cartProduct(){
        $(cart()).click();
    }
    @Step
    public void bayarButtonDisplayed(){
        $(bayar()).isDisplayed();
    }
    @Step
    public void detailButton(){
        $(detail()).click();
    }
    @Step
    public void theDetailProduct(){
        $(productDetail()).isDisplayed();
    }
    @Step
    public void giveRating(){
        $(rating5()).click();
    }
    @Step
    public void clickClearCategory() {
        $(clearCategory()).click();
    }

}
