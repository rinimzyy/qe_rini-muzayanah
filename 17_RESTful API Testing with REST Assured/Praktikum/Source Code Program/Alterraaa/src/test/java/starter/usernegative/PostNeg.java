package starter.usernegative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostNeg {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set wrong POST endpoints")
    public String setWrongPostEndpoints(){
        return url + "psts";
    }
    @Step("I send wrong POST HTTP request")
    public void wrongPostHTTPrequest(){
        SerenityRest.given().when().post(setWrongPostEndpoints());
    }
    @Step("I receive invalid POST HTTP response code 500")
    public void postHTTPresponse500(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
