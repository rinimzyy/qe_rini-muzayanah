package starter.usernegative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllNeg {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set wrong GET endpoints url")
    public String setWrongGetEndpointsUrl(){
        return url + "psts";
    }
    @Step("I send wrong get HTTP request url")
    public void wrongGetHTTPrequestUrl(){
        SerenityRest.given().when().get(setWrongGetEndpointsUrl());
    }
    @Step("I receive valid HTTP status code 404")
    public void HTTPStatus404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
