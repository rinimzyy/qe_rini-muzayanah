package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Product;

public class ProductSteps {
    @Steps
    Product product;

    @Given("I GET API products endpoints")
    public void setGetHTTPEndpoint(){
        product.setGetEndpoint();
    }
    @When("I GET HTTP request")
    public void getHTTPrequestUrl(){
        product.getHTTPRequest();
    }
    @And("I receive valid data for detail product")
    public void validData(){
        product.validResponse();
    }
    @Then("I receive valid HTTP response code 200")
    public void response(){
        product.responseGet200();
    }

    @Given("I GET API products with invalid endpoints")
    public void getAPIProductInvalid() {
        product.getAPIProductInvalid();
    }
    @When("I GET HTTP request with invalid endpoint")
    public void getHTTPInvalidRequest() {
        product.getHTTPInvalidRequest();
    }
    @And("I receive invalid data for detail product")
    public void receiveInvalidDetailProduct() {
        product.receiveInvalidDetailProduct();
    }
    @Then("I receive invalid GET response code 404")
    public void receiveInvalidGETResponseCode404() {
        product.receiveInvalidGETResponseCode404();
    }

    @Given("I GET API all product endpoints")
    public void setGetAllProductEndpoint(){
        product.setGetAllProductEndpoint();
    }
    @When("I GET HTTP request all product data")
    public void getAllProductRequest(){
        product.getAllProductRequest();
    }
    @Then("I receive valid get all product HTTP response code 200")
    public void responseValid200(){
        product.responseAllProduct200();
    }

    @Given("I GET Wrong API all product url endpoints")
    public void setGetAllProductEndpointUrl(){
        product.setGetAllProductEndpointUrl();
    }
    @When("I GET HTTP url request all product data")
    public void getAllProductRequestUrl(){
        product.getAllProductRequestUrl();
    }
    @Then("I receive valid get all product HTTP response code 404")
    public void responseUrlInvalid404(){
        product.responseAllProduct404();
    }

    @Given("I GET user limit result product with valid param")
    public void getValidLimitProduct() {
        product.getValidLimitProduct();
    }
    @When("I GET HTTP request limit result product with valid param")
    public void getInvalidRequestLimitProduct() {
        product.getInvalidRequestLimitProduct();
    }
    @And("I receive limit result product with request param")
    public void receiveLimitProductRequestParam() {
        product.receiveLimitProductRequestParam();
    }
    @Then("I receive valid GET limit result product response code 200")
    public void receiveInvalidLimitProductResponseCode200() {
        product.receiveInvalidLimitProductResponseCode200();
    }

    @Given("I GET user limit result product with invalid param")
    public void getLimitProductRequestInvalid() {
        product.getLimitProductRequestInvalid();
    }
    @When("I GET HTTP request limit result product with invalid param")
    public void getHTTPInvalidRequestWithLimitProduct() {
        product.getHTTPInvalidRequestWithLimitProduct();
    }
    @And("I receive limit result product with invalid request param")
    public void receiveLimitProductWithInvalidRequest() {
        product.receiveLimitProductWithInvalidRequest();
    }
    @Then("I receive invalid GET limit result product response code 404")
    public void receiveInvalidLimitResponseCode404() {
        product.receiveInvalidLimitResponseCode404();
    }

    @Given("I GET API all categories product endpoints")
    public void setGetAllCategoriesProductEndpoint(){
        product.setGetAllCategoriesProductEndpoint();
    }
    @When("I GET HTTP request all categories product data")
    public void getAllCategoriesProductRequest(){
        product.getAllCategoriesProductRequest();
    }
    @Then("I receive valid get all categories product HTTP response code 200")
    public void responseAllCategoriesValid200(){
        product.responseAllCategoriesProduct200();
    }

    @Given("I GET wrong API all categories product endpoints")
    public void setGetWrongAllCategoriesProductEndpoint(){
        product.setGetWrongAllCategoriesProductEndpoint();
    }
    @When("I GET wrong HTTP request all categories product data")
    public void getWrongAllCategoriesProductRequest(){
        product.getWrongAllCategoriesProductRequest();
    }
    @Then("I receive invalid get all categories product HTTP response code 404")
    public void responseAllCategoriesValid404(){
        product.responseAllCategoriesProduct404();
    }

    @Given("I GET API categories product endpoints")
    public void setGetCategoriesProductEndpoint(){
        product.setGetCategoriesProductEndpoint();
    }
    @When("I GET HTTP request categories product data")
    public void getCategoriesProductRequest(){
        product.getCategoriesProductRequest();
    }
    @Then("I receive valid get categories product HTTP response code 200")
    public void responseCategoriesValid200(){
        product.responseCategoriesProduct200();
    }

    @Given("I GET wrong API categories product endpoints")
    public void setGetWrongCategoriesProductEndpoint(){
        product.setGetWrongCategoriesProductEndpoint();
    }
    @When("I GET wrong HTTP request categories product data")
    public void getWrongCategoriesProductRequest(){
        product.getWrongCategoriesProductRequest();
    }
    @Then("I receive invalid get categories product HTTP response code 404")
    public void responseCategoriesValid404(){
        product.responseCategoriesProduct404();
    }

    @Given("I GET API product endpoints")
    public void setGetProductEndpoint(){
        product.setGetSortProductEndpoint();
    }
    @When("I GET HTTP request product with decending sort")
    public void getProductWithSort(){
        product.getSortProductRequest();
    }
    @Then("I receive valid get descending product HTTP response code 200")
    public void responseSortValid200(){
        product.responseSortProduct200();
    }

    @Given("I GET wrong API product endpoints")
    public void setGetWrongProductEndpoint(){
        product.setGetWrongSortProductEndpoint();
    }
    @When("I GET wrong HTTP request product with decending sort")
    public void getWrongProductWithSort(){
        product.getWrongSortProductRequest();
    }
    @Then("I receive invalid get descending product HTTP response code 404")
    public void responseSortinvalid404(){
        product.responseSortProduct404();
    }

    @Given("I POST API product endpoints")
    public void setPostHTTPEndpoint(){
        product.setPostEndpoint();
    }
    @When("I POST HTTP request with valid data")
    public void postHTTPrequestUrl(){
        product.postHTTPRequest();
    }
    @And("I receive valid data for new product")
    public void validBody(){
        product.validBody();
    }
    @Then("I receive valid HTTP response 200")
    public void responsePost200(){
        product.responsePost200();
    }

    @Given("I POST the API product endpoints")
    public void setPostApiEndpoint(){
        product.setPostApiEndpoint();
    }
    @When("I POST wrong HTTP request with valid data")
    public void postWrongHttpRequest(){
        product.postWrongHttpRequest();
    }
    @Then("I receive invalid response code 404")
    public void validResponsePost200(){
        product.responsePost404();
    }

    @Given("I PUT API endpoints")
    public void setPutApiEndpoint(){
        product.setPutEndpoint();
    }
    @When("I PUT HTTP request")
    public void putHttpRequest(){
        product.putHTTPRequest();
    }
    @And("I receive valid data for updated product")
    public void validUpdatedData(){
        product.validUpdateData();
    }
    @Then("I receive valid PUT response 200")
    public void validResponsePut200(){
        product.responsePut200();
    }

    @Given("I PUT API with invalid endpoints")
    public void setPutInvalidEndpoint() {
        product.setPutInvalidEndpoint();
    }
    @When("I PUT HTTP request with invalid endpoints")
    public void putHTTPInvalidRequest() {
        product.putHTTPInvalidRequest();
    }
    @And("I receive invalid data for updated product")
    public void receiveInvalidUpdatedProduct() {
        product.receiveInvalidUpdatedProduct();
    }
    @Then("I receive invalid PUT response 404")
    public void receiveInvalidPUTResponseCode404() {
        product.receiveInvalidPUTResponseCode404();
    }

    @Given("I DELETE API endpoints")
    public void setDeleteApiEndpoint(){
        product.setPutEndpoint();
    }
    @When("I DELETE HTTP request with valid id")
    public void deleteHttpRequest(){
        product.deleteHTTPRequest();
    }
    @Then("I receive valid DELETE response code 200")
    public void validResponseDelete200(){
        product.responseDelete200();
    }

    @Given("I DELETE API product with invalid id endpoints")
    public void setDeleteProductWithInvalidIDEndpoint(){
        product.setDeleteProductWithInvalidIDEndpoint();
    }
    @When("I DELETE product HTTP request with invalid id")
    public void deleteHTTPInvalidRequestWithProduct(){
        product.deleteHTTPInvalidRequestWithProduct();
    }
    @Then("I receive invalid DELETE product response code 404")
    public void receiveInvalidDELETEProductResponseCode404() {
        product.receiveInvalidDELETEProductResponseCode404();
    }

}
