package starter.user;

import lombok.var;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class GETALL {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET endpoints url")
    public String setGetEndpointsUrl(){
        return url + "posts";
    }
    @Step("I send GET HTTP request url")
    public void getHTTPrequestUrl(){
        SerenityRest.given().when().get(setGetEndpointsUrl());
    }
    @Step("I receive valid HTTP status code 200")
    public void HTTPStatus200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
