package starter.usernegative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetNeg {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set wrong GET endpoints")
    public String setWrongGetEndpoints(){
        return url + "posts/101";
    }
    @Step("I send wrong GET HTTP request")
    public void wrongGetHTTPrequest(){
        SerenityRest.given().when().get(setWrongGetEndpoints());
    }
    @Step("I receive invalid HTTP response code 404")
    public void HTTPresponse404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
