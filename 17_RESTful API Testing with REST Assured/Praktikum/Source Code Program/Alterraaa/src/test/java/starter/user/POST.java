package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class POST {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set POST endpoints")
    public String setPostEndpoints(){
        return url + "posts";
    }
    @Step("I send POST HTTP request url")
    public void postHTTPrequest(){
        JSONObject body = new JSONObject();
        body.put("userId",1);
        body.put("id",101);
        body.put("title","Coba");
        body.put("body", "Apa aja");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostEndpoints());
    }
    @Step("I receive valid HTTP response code 201")
    public void HTTPresponse201(){
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid response")
    public void validResponse(){
        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(101)));
        restAssuredThat(response -> response.body("'title'", equalTo("Coba")));
        restAssuredThat(response -> response.body("'body'", equalTo("Apa aja")));
    }
}
