package starter.Integration;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Transactions extends PageObject {
    private SearchableTarget bayar() {
        return Button.withText("Bayar");
    }
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private SearchableTarget plus() {
        return Button.withText("+");
    }
    private By transaction() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div");
    }
    private By ascending() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]");
    }
    private By descending() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]");
    }

    private By transactionMenu() {
        return By.xpath("/html/body/div/div[2]/div/div[1]");
    }

    private By sort() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/table/thead/tr/th/div/div/div/div/div[1]");
    }

    private By productSort(){
        return By.xpath("/html/body/div/div[3]/div/div[1]");
    }

    private By rowNumber(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div");
    }

    private By rowNumber10(){
        return By.xpath("/html/body/div/div[3]/div/div[2]/div");
    }

    @Step
    public void increaseProduct(){
        $(plus()).click();
    }
    @Step
    public void payOrder(){
        $(bayar()).click();
    }
    @Step
    public void transactionList(){
        $(transaction()).isDisplayed();
    }
    @Step
    public void loginDisplayed(){
        $(login()).isDisplayed();
    }
    @Step
    public void activateAscending(){
        $(ascending()).click();
    }
    @Step
    public void activateDescending(){
        $(descending()).click();
    }
    @Step
    public void getTransactionMenu(){
        $(transactionMenu()).click();
    }

    @Step
    public void clickSort() {
        $(sort()).click();
    }

    @Step
    public void clickProductSort(){
        $(productSort()).click();
    }

    @Step
    public void clickRowNumber(){
        $(rowNumber()).click();
    }

    @Step
    public void clickRowNumber10(){
        $(rowNumber10()).click();
    }
}
