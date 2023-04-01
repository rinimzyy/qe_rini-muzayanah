package starter.usernegative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutNeg {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set wrong PUT endpoints")
    public String setWrongPutEndpoints(){
        return url + "posts/101";
    }
    @Step("I send wrong PUT HTTP request")
    public void wrongPutHTTPrequest(){
        SerenityRest.given().when().put(setWrongPutEndpoints());
    }
    @Step("I receive invalid PUT HTTP response code 500")
    public void putHTTPresponse500(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
