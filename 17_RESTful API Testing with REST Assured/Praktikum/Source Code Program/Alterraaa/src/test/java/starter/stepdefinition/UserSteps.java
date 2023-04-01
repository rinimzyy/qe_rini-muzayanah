package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.usernegative.*;
import starter.user.*;

public class UserSteps {
    @Steps
    GETALL getall;

    @Steps
    GET get;

    @Steps
    POST post;

    @Steps
    PUT put;

    @Steps
    DELETE del;

    @Steps
    GetAllNeg get1;

    @Steps
    GetNeg get2;

    @Steps
    PostNeg post1;

    @Steps
    PutNeg put1;

    @Steps
    DelNeg del1;

    @Given("I set GET endpoints url")
    public void setGetEndpointsUrl(){
        getall.setGetEndpointsUrl();
    }
    @When("I send GET HTTP request url")
    public void getHTTPrequestUrl(){
        getall.getHTTPrequestUrl();
    }
    @Then("I receive valid HTTP status code 200")
    public void HTTPStatus200(){
        getall.HTTPStatus200();
    }

    @Given("I set GET endpoints")
    public void setGetEndpoints(){
        get.setGetEndpoints();
    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.getHTTPrequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        get.HTTPresponse200();
    }
    @And("I receive valid data according the ID")
    public void validData(){
        get.validData();
    }

    @Given("I set POST endpoints url")
    public void setPostEndpoints(){
        post.setPostEndpoints();
    }
    @When("I send POST HTTP request url")
    public void postHTTPrequest(){
        post.postHTTPrequest();
    }
    @Then("I receive valid HTTP response code 201")
    public void HTTPresponse201(){
        post.HTTPresponse201();
    }
    @And("I receive valid response body")
    public void validBody(){
        post.validResponse();
    }

    @Given("I set PUT endpoints url")
    public void setPutEndpoints(){
        put.setPutEndpoints();
    }
    @When("I send PUT HTTP request url")
    public void putHTTPrequest(){
        put.putHTTPrequest();
    }
    @Then("I receive valid PUT HTTP response code 200")
    public void putHTTPresponse200(){
        put.putHTTPresponse200();
    }
    @And("I receive valid updated response body")
    public void validUpdatedData(){
        put.validUpdatedData();
    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoints(){
        del.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void deleteHTTPrequest(){
        del.deleteHttpRequest();
    }
    @Then("I receive valid delete HTTP response code 200")
    public void deleteHTTPresponse200(){
        del.deleteHTTPresponse200();
    }

    @Given("I set wrong GET endpoints url")
    public void setWrongGetEndpointsUrl(){
        get1.setWrongGetEndpointsUrl();
    }
    @When("I send wrong get HTTP request url")
    public void wrongGetHTTPrequestUrl(){
        get1.wrongGetHTTPrequestUrl();
    }
    @Then("I receive invalid HTTP status code 404")
    public void HTTPStatus404(){
        get1.HTTPStatus404();
    }

    @Given("I set wrong GET endpoints")
    public void setWrongGetEndpoints(){
        get2.setWrongGetEndpoints();
    }
    @When("I send wrong GET HTTP request")
    public void wrongGetHTTPrequest(){
        get2.wrongGetHTTPrequest();
    }
    @Then("I receive invalid HTTP response code 404")
    public void HTTPResponse404(){
        get2.HTTPresponse404();
    }

    @Given("I set wrong POST endpoints")
    public void setWrongPostEndpoints(){
        post1.setWrongPostEndpoints();
    }
    @When("I send wrong POST HTTP request")
    public void wrongPostHTTPrequest(){
        post1.wrongPostHTTPrequest();
    }
    @Then("I receive invalid POST HTTP response code 500")
    public void postHTTPResponse500(){
        post1.postHTTPresponse500();
    }

    @Given("I set wrong PUT endpoints")
    public void setWrongPutEndpoints(){
        put1.setWrongPutEndpoints();
    }
    @When("I send wrong PUT HTTP request")
    public void wrongPutHTTPrequest(){
        put1.wrongPutHTTPrequest();
    }
    @Then("I receive invalid PUT HTTP response code 500")
    public void putHTTPResponse500(){
        put1.putHTTPresponse500();
    }

     @Given("I set wrong DELETE endpoints")
    public void setWrongDeleteEndpoints(){
        del1.setWrongDeleteEndpoints();
    }
    @When("I send wrong DELETE HTTP request")
    public void wrongDeleteHTTPrequest(){
        del1.wrongDeleteHTTPrequest();
    }
    @Then("I receive invalid DELETE HTTP response code 404")
    public void deleteHTTPResponse404(){
        del1.deleteHTTPresponse404();
    }
}
