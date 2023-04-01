package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PUT {
    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set POST endpoints")
    public String setPutEndpoints(){
        return url + "posts/1";
    }
    @Step("I send POST HTTP request url")
    public void putHTTPrequest(){
        JSONObject body = new JSONObject();
        body.put("userId",1);
        body.put("id",1);
        body.put("title","Update");
        body.put("body", "Data baru");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setPutEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void putHTTPresponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid response")
    public void validUpdatedData(){
        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("Update")));
        restAssuredThat(response -> response.body("'body'", equalTo("Data baru")));
    }
}
