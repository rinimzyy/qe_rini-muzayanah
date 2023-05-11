package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Integration.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class IntegrationSteps {
    @Steps
    Register register;

    @Steps
    Login login;

    @Steps
    Logout logout;

    @Steps
    Integration log;

    @Steps
    Product product;

    @Given("User on register page")
    public void regsPage() {
    }
    @When("User success register")
    public void reg() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("b10@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User success login")
    public void login() {
        log.inputEmail("b10@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User success logout")
    public void logout() {
        logout.userButton();
        logout.logoutButton();
    }
    @Then("Integration testing success")
    public void integration() {

    }

    @Given("User on register pages")
    public void registerPage() {
    }
    @When("User success to register")
    public void register() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("a11@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User success to login")
    public void userLogin() {
        log.inputEmail("a11@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User success see detail product")
    public void seeDetail() {
        product.detailButton();
    }
    @And("User success assign rating")
    public void rating() {
        product.giveRating();
    }
    @Then("Integration test success")
    public void integSuccess() {

    }

    @Given("User on the register pages")
    public void regPages() {
    }
    @When("User success register to web")
    public void regs() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("c8@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User success login to web")
    public void userLogins() {
        log.inputEmail("c8@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User success add product to cart")
    public void addCart() {
        product.addProduct();
    }
    @And("User success order")
    public void order() {
        product.cartProduct();
        product.bayarButtonDisplayed();
    }
    @Then("Web integration test success")
    public void webIntegrationSuccess() {

    }

    @Given("User on the register web pages")
    public void regPage() {
    }
    @When("User success register to web page")
    public void regstoWebs() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("d8@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User success login to web page")
    public void userlogins() {
        log.inputEmail("d8@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User success select categories")
    public void selectCat() {
        product.categoryList();
        product.clickOneCategory();
    }
    @And("User success clear categories")
    public void clearCat() {
        product.clickClearCategory();
    }
    @Then("Web integration success")
    public void webIntegSuccess() {

    }

    @Given("User in register pages")
    public void registersPage() {
    }
    @When("User successfully register")
    public void registers() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("e9@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User successfully to login")
    public void userLogintoWebPage() {
        log.inputEmail("e9@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User successfully see detail product")
    public void seeDetails() {
        product.detailButton();
    }
    @And("User successfully assign rating")
    public void ratings() {
        product.giveRating();
    }
    @And("User logout")
    public void usrlogout() {
        logout.userButton();
        logout.logoutButton();
    }
    @Then("Integration test successfully")
    public void integSuccessfully() {

    }

    @Given("User in the register pages")
    public void regWebPages() {
    }
    @When("User successfully register to web")
    public void regstoWeb() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
        register.inputFullName("Rini Muzayanah");
        register.inputEmail("f9@gmail.com");
        register.inputPassword("123123");
        register.clickRegisterButton();
    }
    @And("User successfully login to web")
    public void userLogintoWeb() {
        log.inputEmail("f9@gmail.com");
        log.inputPassword("123123");
        login.ClickLoginButton();
    }
    @And("User successfully add product to cart")
    public void addToCart() {
        product.addProduct();
    }
    @And("User successfully order")
    public void orderProd() {
        product.cartProduct();
        product.bayarButtonDisplayed();
    }
    @And("User Log Out")
    public void orderPro() {
        logout.userButton();
        logout.logoutButton();
    }
    @Then("Web integration test successfully success")
    public void webIntegrationSuccessfully() {

    }
}
