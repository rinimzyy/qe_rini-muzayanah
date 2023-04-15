package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.User;

public class UserSteps {
    @Steps
    User user;

    @Given("I GET API user endpoints")
    public void setGetUserEndpoint(){
        user.setGetUserEndpoint();
    }
    @When("I GET HTTP request user data")
    public void getUserRequestUrl(){
        user.getUserRequest();
    }
    @And("I receive valid data for detail user")
    public void validDataUser(){
        user.validResponseUser();
    }
    @Then("I receive valid user HTTP response code 200")
    public void responseUserValid(){
        user.responseUser200();
    }

    @Given("I GET API single user with invalid endpoints")
    public void getSingleUserInvalidEndpoint() {
        user.getSingleUserInvalidEndpoint();
    }
    @When("I GET HTTP request single user with invalid endpoints")
    public void getSingleUserInvalidRequest() {
        user.getSingleUserInvalidRequest();
    }
    @And("I receive invalid data for single user")
    public void receiveInvalidDataForSingleUser() {
        user.receiveInvalidDataForSingleUser();
    }
    @Then("I receive invalid GET single user response code 404")
    public void receiveInvalidSingleUserResponseCode404(){
        user.receiveInvalidSingleUserResponseCode404();
    }

    @Given("I GET user limit result")
    public void getLimitUserRequest() {
        user.getLimitUserRequest();
    }
    @When("I GET HTTP request with valid param")
    public void getHTTPRequestWithLimitUserParam() {
        user.getHTTPRequestWithLimitUserParam();
    }
    @And("I receive limit result with request param")
    public void receiveLimitResultWithRequestParam() {
        user.receiveLimitResultWithRequestParam();
    }
    @Then("I receive valid GET limit result response code 200")
    public void receiveValidLimitResponseCode200() {
        user.receiveValidLimitResponseCode200();
    }

    @Given("I GET user limit result invalid param")
    public void getLimitUserRequestInvalid() {
        user.getLimitUserRequestInvalid();
    }
    @When("I GET HTTP request with invalid param")
    public void getHTTPInvalidRequestWithLimitParam() {
        user.getHTTPInvalidRequestWithLimitParam();
    }
    @And("I receive limit result with invalid request param")
    public void receiveLimitResultWithInvalidRequestParam() {
        user.receiveLimitResultWithInvalidRequestParam();
    }
    @Then("I receive invalid GET limit result response code 404")
    public void receiveInvalidLimitResponseCode404() {
        user.receiveInvalidLimitResponseCode404();
    }

    @Given("I GET API user endpoint")
    public void setGetSortUserEndpoint(){
        user.setGetSortUserEndpoint();
    }
    @When("I GET HTTP request user with decending sort")
    public void getUserWithSort(){
        user.getSortUserRequest();
    }
    @Then("I receive valid get descending user HTTP response code 200")
    public void responseSortValid200(){
        user.responseSortUser200();
    }

    @Given("I GET wrong API user endpoint")
    public void setGetWrongUserEndpoint(){
        user.setGetWrongSortUserEndpoint();
    }
    @When("I GET wrong HTTP request user with decending sort")
    public void getWrongUserWithSort(){
        user.getWrongSortUserRequest();
    }
    @Then("I receive invalid get descending user HTTP response code 404")
    public void responseSortinvalid404(){
        user.responseSortUser404();
    }

    @Given("I GET API all user endpoints")
    public void setGetAllUserEndpoint(){
        user.setGetAllUserEndpoint();
    }
    @When("I GET HTTP request all user data")
    public void getAllUserRequest(){
        user.getAllUserRequest();
    }
    @Then("I receive valid get all user HTTP response code 200")
    public void responseValid(){
        user.responseAllUser200();
    }

    @Given("I GET Wrong API all user url endpoints")
    public void setGetAllUserEndpointUrl(){
        user.setGetAllUserEndpointUrl();
    }
    @When("I GET HTTP url request all user data")
    public void getAllUserRequestUrl(){
        user.getAllUserRequestUrl();
    }
    @Then("I receive valid get all user HTTP response code 404")
    public void responseUrlInvalid(){
        user.responseAllUser404();
    }

    @Given("I access POST API user endpoints")
    public void setPostUserEndpoint(){
        user.setPostUserEndpoint();
    }
    @When("I POST HTTP request with a valid data")
    public void postUserHTTPRequest(){
        user.postUserHTTPRequest();
    }
    @And("I receive valid data for new user")
    public void validResponsePostUser(){
        user.validResponsePostUser();
    }
    @Then("I receive an valid POST response code 200")
    public void receiveResponsePostUser200(){
        user.receiveResponsePostUser200();
    }

    @Given("I POST the API user endpoints invalid")
    public void postAPIUserEndpointsInvalid() {
        user.postAPIUserEndpointsInvalid();
    }
    @When("I POST HTTP request with an invalid data")
    public void postHTTPRequestInvalidData() {
        user.postUserInvalidHTTPRequest();
    }
    @And("I failed to receive data")
    public void failedReceiveData() {
        user.failedReceiveData();
    }
    @Then("I receive invalid POST response code 400")
    public void receiveInvalidPOSTResponseCode400() {
        user.receiveInvalidPOSTResponseCode400();
    }

    @Given("I PUT API user endpoints")
    public void setPutUserEndpoint(){
        user.setPutUserEndpoint();
    }
    @When("I PUT an HTTP request")
    public void putUserRequest(){
        user.putUserRequest();
    }
    @And("I receive valid data for updated user")
    public void validResponsePutUser(){
        user.validResponsePutUser();
    }
    @Then("I receive valid PUT response code 200")
    public void responsePutUser200(){
        user.responsePutUser200();
    }

    @Given("I PUT API user with invalid endpoints")
    public void putUserInvalidEndpoint() {
        user.putUserInvalidEndpoint();
    }
    @When("I PUT an HTTP request with invalid endpoints")
    public void putUserInvalidRequest() {
        user.putUserInvalidRequest();
    }
    @And("I receive invalid data for updated user")
    public void receiveInvalidDataUpdatedUser() {
        user.receiveInvalidDataUpdatedUser();
    }
    @Then("I receive invalid PUT response code 404")
    public void receivePUTInvalidResponseCode404() {
        user.receivePUTInvalidResponseCode404();
    }

    @Given("I DELETE API user endpoints")
    public void setDeleteUserEndpoint(){
        user.setDeleteUserEndpoint();
    }
    @When("I DELETE user HTTP request with valid id")
    public void deleteUserWithNewId(){
        user.deleteUserRequest();
    }
    @Then("I receive valid DELETE user response code 200")
    public void responseUserCartInvalid(){
        user.responseDeleteUser200();
    }

    @Given("I DELETE API user with invalid id endpoints")
    public void setDeleteUserInvalidEndpoint() {
        user.setDeleteUserInvalidEndpoint();
    }
    @When("I DELETE user HTTP request with invalid id")
    public void deleteUserInvalidRequest() {
        user.deleteUserInvalidRequest();
    }
    @Then("I receive invalid DELETE user response code 404")
    public void receiveInvalidDELETEresponseCode404() {
        user.receiveInvalidDELETEresponseCode404();
    }

}
