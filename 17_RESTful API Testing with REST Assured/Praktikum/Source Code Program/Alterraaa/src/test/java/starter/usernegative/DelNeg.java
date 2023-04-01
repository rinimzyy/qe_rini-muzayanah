package starter.usernegative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DelNeg {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set wrong PUT endpoints")
    public String setWrongDeleteEndpoints(){
        return url + "psts/1";
    }
    @Step("I send wrong DELETE HTTP request")
    public void wrongDeleteHTTPrequest(){
        SerenityRest.given().when().delete(setWrongDeleteEndpoints());
    }
    @Step("I receive invalid DELETE HTTP response code 404")
    public void deleteHTTPresponse404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
