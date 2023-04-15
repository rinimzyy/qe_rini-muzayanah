package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set GET endpoints url")
    public String setGetEndpoints(){
        return url + "auth/login";
    }
    @Step("I send GET HTTP request url")
    public void getHTTPrequest(){
        JSONObject body = new JSONObject();
        body.put("username","mor_2314");
        body.put("password","83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoints());
    }
    @Step("I received status code 201 and token")
    public void response(){
        restAssuredThat(response -> response.statusCode(200));
        String token = SerenityRest.then().extract().path("token");
        Assert.assertNotNull(token, "Token is not found in response");
    }
    @Step("I set wrong POST endpoints")
    public String setWrongPostEndpoint(){
        return url + "/auth/login";
    }
    @Step("Username and password is empty")
    public void getInvalidHTTPRequest(){
        JSONObject body = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoints());
    }
    @Step(" receive invalid HTTP response code 400")
    public void invalidResponse(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
