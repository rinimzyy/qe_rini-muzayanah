package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Cart;

public class CartSteps {
    @Steps
    Cart cart;

    @Given("I GET API cart endpoints")
    public void setGetChartEndpoint(){
        cart.setGetCartEndpoint();
    }
    @When("I GET HTTP request cart data")
    public void getChartRequestUrl(){
        cart.getCartRequest();
    }
    @And("I receive valid data for detail cart")
    public void validDataCart(){
        cart.validResponseCart();
    }
    @Then("I receive valid cart HTTP response code 200")
    public void responseCartValid(){
        cart.responseCart200();
    }

    @Given("I GET API single cart with invalid url")
    public void setGetWrongSingleCartEndpoint(){
        cart.setWrongtCartEndpoint();
    }
    @When("I GET HTTP request single cart data with invalid url")
    public void getWrongCartRequest(){
        cart.getWrongCartRequest();
    }
    @And("I receive invalid data for single cart")
    public void receiveInvalidDataForSingleUser(){
        cart.receiveInvalidDataForSingleUser();
    }
    @Then("I receive invalid GET single cart response code 404")
    public void responseUserCartValid404(){
        cart.responseUserCart404();
    }

    @Given("I GET user limit result cart with valid param")
    public void getLimitCartValidRequest() {
        cart.getLimitCartValidRequest();
    }
    @When("I GET HTTP request limit result cart with valid param")
    public void getHTTPValidRequestWithLimitCartParam() {
        cart.getHTTPValidRequestWithLimitCartParam();
    }
    @And("I receive limit result cart with request param")
    public void receiveLimitCartWithValidRequestParam() {
        cart.receiveLimitCartWithValidRequestParam();
    }
    @Then("I receive valid GET limit result cart response code 200")
    public void receiveValidLimitCartResponseCode200() {
        cart.receiveValidLimitCartResponseCode200();
    }

    @Given("I GET user limit result cart with invalid param")
    public void getLimitCartInvalidRequest() {
        cart.getLimitCartInvalidRequest();
    }
    @When("I GET HTTP request limit result cart with invalid param")
    public void getHTTPInvalidRequestWithLimitCartParam() {
        cart.getHTTPInvalidRequestWithLimitCartParam();
    }
    @And("I receive limit result cart with invalid request param")
    public void receiveLimitCartWitInvalidhRequestParam() {
        cart.receiveLimitCartWitInvalidhRequestParam();
    }
    @Then("I receive invalid GET limit result cart response code 404")
    public void receiveInvalidLimitCartResponseCode404() {
        cart.receiveInvalidLimitCartResponseCode404();
    }

    @Given("I GET API cart endpoint")
    public void setGetCartEndpoint(){
        cart.setGetSortCartEndpoint();
    }
    @When("I GET HTTP request cart with decending sort")
    public void getProductWithSort(){
        cart.getSortCartRequest();
    }
    @Then("I receive valid get descending cart HTTP response code 200")
    public void responseSortValid200(){
        cart.responseSortCart200();
    }

    @Given("I GET wrong API cart endpoint")
    public void setGetWrongCartEndpoint(){
        cart.setGetWrongSortCartEndpoint();
    }
    @When("I GET wrong HTTP request cart with decending sort")
    public void getWrongCartWithSort(){
        cart.getWrongSortCartRequest();
    }
    @Then("I receive invalid get descending cart HTTP response code 404")
    public void responseSortinvalid404(){
        cart.responseSortCart404();
    }

    @Given("I GET API all cart endpoints")
    public void setGetAllCartEndpoint(){
        cart.setGetAllCartEndpoint();
    }
    @When("I GET HTTP request all cart data")
    public void getAllCartRequest(){
        cart.getAllCartRequest();
    }
    @Then("I receive valid get all cart HTTP response code 200")
    public void responseValid200(){
        cart.responseAllCart200();
    }

    @Given("I GET Wrong API all cart url endpoints")
    public void setGetAllProductEndpointUrl(){
        cart.setGetAllCartEndpointUrl();
    }
    @When("I GET HTTP url request all cart data")
    public void getAllProductRequestUrl(){
        cart.getAllCartRequestUrl();
    }
    @Then("I receive valid get all cart HTTP response code 404")
    public void responseUrlInvalid404(){
        cart.responseAllCart404();
    }

    @Given("I GET API user cart url endpoints")
    public void setGetUserCartEndpoint(){
        cart.setGetUserCartEndpoint();
    }
    @When("I GET HTTP url request user cart data")
    public void getUserCartRequest(){
        cart.getUserCartRequest();
    }
    @Then("I receive valid get user cart HTTP response code 404")
    public void responseUserCartValid200(){
        cart.responseUserCart200();
    }

    @Given("I GET API in date range cart param with valid data")
    public void getAPIDateRangeCartWithValidData(){
        cart.getAPIDateRangeCartWithValidData();
    }
    @When("I GET HTTP request data range cart param with valid data")
    public void getHTTPRequestValidWithDataRangeCart() {
        cart.getHTTPRequestValidWithDataRangeCart();
    }
    @And("I receive valid data with data range cart param")
    public void receiveValidDataRange() {
        cart.receiveValidDataRange();
    }
    @Then("I receive valid GET data range cart response code 200")
    public void receiveValidGETDataRangeCartResponseCode200() {
        cart.receiveValidGETDataRangeCartResponseCode200();
    }

    @Given("I GET API in date range cart param with invalid data")
    public void getAPIDateRangeCartWithInvalidData(){
        cart.getAPIDateRangeCartWithInvalidData();
    }
    @When("I GET HTTP request data range cart param with invalid data")
    public void getHTTPRequestInvalidWithDataRangeCart() {
        cart.getHTTPRequestInvalidWithDataRangeCart();
    }
    @And("I receive invalid data with data range cart param")
    public void receiveInvalidDataRange() {
        cart.receiveInvalidDataRange();
    }
    @Then("I receive invalid GET data range cart response code 404")
    public void receiveInvalidGETDataRangeCartResponseCode404() {
        cart.receiveInvalidGETDataRangeCartResponseCode404();
    }

    @Given("I POST API cart endpoints")
    public void setPostCartEndpoint(){
        cart.setPostCartEndpoint();
    }
    @When("I POST HTTP request with valid data cart")
    public void postCartRequestUrl(){
        cart.postCartRequest();
    }
    @And("I receive valid data for new cart")
    public void validNewDataCart(){
        cart.validResponseNewCart();
    }
    @Then("I receive valid cart response 200")
    public void responseNewCartValid(){
        cart.responseNewCart200();
    }

    @Given("I POST API new cart with invalid endpoints")
    public void postNewCartWithInvalidEndpoint() {
        cart.postNewCartWithInvalidEndpoint();
    }
    @When("I POST HTTP request with invalid data cart")
    public void postHTTPRequestWithInvalidDataCart(){
        cart.postHTTPRequestWithInvalidDataCart();
    }
    @And("I receive invalid data for new cart")
    public void receiveInvalidDataForNewCart(){
        cart.receiveInvalidDataForNewCart();
    }
    @Then("I receive invalid POST new cart response code 404")
    public void receiveInvalidPOSTNewCartResponseCode404(){
        cart.receiveInvalidPOSTNewCartResponseCode404();
    }

    @Given("I PUT cart API endpoints")
    public void setPutCartEndpoint(){
        cart.setPutCartEndpoint();
    }
    @When("I PUT cart HTTP request")
    public void putCartRequestUrl(){
        cart.putCartRequest();
    }
    @And("I receive valid data for updated cart")
    public void validUpdatedDataCart(){
        cart.validResponseUpdatedCart();
    }
    @Then("I receive valid PUT cart response 200")
    public void responseUpdatedCartValid(){
        cart.responseUpdatedCart200();
    }

    @Given("I PUT cart API with invalid endpoints")
    public void putCartWithInvalidEndpoint(){
        cart.putCartWithInvalidEndpoint();
    }
    @When("I PUT cart HTTP request with invalid data cart")
    public void putCartRequestWithInvalidDataCart(){
        cart.putCartRequestWithInvalidDataCart();
    }
    @And("I receive invalid data for updated cart")
    public void receiveInvalidDataForUpdatedCart(){
        cart.receiveInvalidDataForUpdatedCart();
    }
    @Then("I receive invalid PUT cart response code 404")
    public void receiveInvalidPUTCartResponseCode2404(){
        cart.receiveInvalidPUTCartResponseCode2404();
    }

    @Given("I DELETE API cart endpoints")
    public void setDeleteCartEndpoint(){
        cart.setDeleteCartEndpoint();
    }
    @When("I DELETE cart HTTP request with valid id")
    public void deleteCartWithNewId(){
        cart.deleteCartHTTPRequest();
    }
    @Then("I receive valid DELETE cart response code 200")
    public void responseDeleteCartInvalid(){
        cart.responseDeleteCart200();
    }

    @Given("I DELETE API cart with invalid id endpoints")
    public void deleteAPICartWithInvalidIDEndpoint(){
        cart.deleteAPICartWithInvalidIDEndpoint();
    }
    @When("I DELETE cart HTTP request with invalid id")
    public void deleteCartInvalidIDRequest(){
        cart.deleteCartInvalidIDRequest();
    }
    @Then("I receive invalid DELETE cart response code 404")
    public void receiveInvalidDELETECartResponseCode404() {
        cart.receiveInvalidDELETECartResponseCode404();
    }
}
