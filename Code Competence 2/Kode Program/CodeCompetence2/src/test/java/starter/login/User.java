package starter.login;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class User {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I GET API user endpoints")
    public String setGetUserEndpoint(){
        return url + "users/1";
    }
    @Step("I GET HTTP request user data")
    public void getUserRequest(){
        SerenityRest.given().when().get(setGetUserEndpoint());
    }
    @Step("I receive valid data for detail cart")
    public void validResponseUser(){
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
    }
    @Step("I receive valid cart HTTP response code 200")
    public void responseUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET API single user with invalid endpoints")
    public String getSingleUserInvalidEndpoint() {
        return url + "user/1";
    }
    @Step("I GET HTTP request single user with invalid endpoints")
    public void getSingleUserInvalidRequest(){
        SerenityRest.given().when().get(getSingleUserInvalidEndpoint());
    }
    @Step("I receive invalid data for single user")
    public void receiveInvalidDataForSingleUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /user/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET single user response code 404")
    public void receiveInvalidSingleUserResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET user limit result")
    public String getLimitUserRequest() {
        return url + "users?limit=5";
    }
    @Step("I GET HTTP request with valid param")
    public void getHTTPRequestWithLimitUserParam() {
        SerenityRest.given().when().get(getLimitUserRequest());
    }
    @Step("I receive limit result with request param")
    public void receiveLimitResultWithRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result response code 200")
    public void receiveValidLimitResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET user limit result invalid param")
    public String getLimitUserRequestInvalid() {
        return url + "user?limit=5";
    }
    @Step("I GET HTTP request with invalid param")
    public void getHTTPInvalidRequestWithLimitParam() {
        SerenityRest.given().when().get(getLimitUserRequestInvalid());
    }
    @Step("I receive limit result with invalid request param")
    public void receiveLimitResultWithInvalidRequestParam() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /user</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result response code 404")
    public void receiveInvalidLimitResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API user endpoint")
    public String setGetSortUserEndpoint(){
        return url + "users?sort=desc";
    }
    @Step("I GET HTTP request user with decending sort")
    public void getSortUserRequest(){
        SerenityRest.given().when().get(setGetSortUserEndpoint());
    }
    @Step("I receive invalid get descending user HTTP response code 200")
    public void responseSortUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET wrong API user endpoint")
    public String setGetWrongSortUserEndpoint(){
        return url + "pengguna?sort=desc";
    }
    @Step("I GET wrong HTTP request user with decending sort")
    public void getWrongSortUserRequest(){
        SerenityRest.given().when().get(setGetWrongSortUserEndpoint());
    }
    @Step("I receive invalid get descending user HTTP response code 404")
    public void responseSortUser404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API all user endpoints")
    public String setGetAllUserEndpoint(){
        return url + "users";
    }
    @Step("I GET HTTP request user data")
    public void getAllUserRequest(){
        SerenityRest.given().when().get(setGetAllUserEndpoint());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET Wrong API all user endpoints")
    public String setGetAllUserEndpointUrl(){
        return url + "pengguna";
    }
    @Step("I GET HTTP request user data")
    public void getAllUserRequestUrl(){
        SerenityRest.given().when().get(setGetAllUserEndpointUrl());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllUser404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I access POST API user endpoints")
    public String setPostUserEndpoint(){
        return url + "users";
    }
    @Step("I POST HTTP request with a valid data")
    public void postUserHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostUserEndpoint());
    }
    @Step("I receive valid data for new user")
    public void validResponsePostUser(){
        restAssuredThat(response -> response.body("id", anyOf(equalTo(1), equalTo(11))));
    }
    @Step("I receive valid HTTP response code 200")
    public void receiveResponsePostUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I POST the API user endpoints invalid")
    public String postAPIUserEndpointsInvalid() {
        return url + "user";
    }
    @Step("I POST HTTP request with an invalid data")
    public void postUserInvalidHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postAPIUserEndpointsInvalid());
    }
    @Step("I failed to receive data")
    public void failedReceiveData(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot POST /user</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive valid POST response code 400")
    public void receiveInvalidPOSTResponseCode400() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I PUT API user endpoints")
    public String setPutUserEndpoint(){
        return url + "users/1"; // assuming user ID is 1 for this example
    }
    @Step("I PUT an HTTP request")
    public void putUserRequest(){
        JSONObject body = new JSONObject();
        body.put("id", 7); // Set the 'id' field to the expected value
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(setPutUserEndpoint());
    }
    @Step("I receive valid data for updated user")
    public void validResponsePutUser(){
        restAssuredThat(response -> response.body("id", equalTo(7)));
    }
    @Step("I receive valid HTTP response code 200")
    public void responsePutUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I PUT API user with invalid endpoints")
    public String putUserInvalidEndpoint(){
        return url + "user/1";
    }
    @Step("I PUT an HTTP request with invalid endpoints")
    public void putUserInvalidRequest(){
        JSONObject body = new JSONObject();
        body.put("id", 7); // Set the 'id' field to the expected value
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(putUserInvalidEndpoint());
    }
    @Step("I receive invalid data for updated user")
    public void receiveInvalidDataUpdatedUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /user/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT response code 404")
    public void receivePUTInvalidResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API user endpoints")
    public String setDeleteUserEndpoint(){
        return url + "users/6";
    }
    @Step("I GET HTTP request user data")
    public void deleteUserRequest(){
        SerenityRest.given().when().delete(setDeleteUserEndpoint());
    }
    @Step("I receive valid cart HTTP response code 200")
    public void responseDeleteUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I DELETE API user with invalid id endpoints")
    public String setDeleteUserInvalidEndpoint(){
        return url + "user/11";
    }
    @Step("I DELETE user HTTP request with invalid id")
    public void deleteUserInvalidRequest(){
        SerenityRest.given().when().delete(setDeleteUserInvalidEndpoint());
    }
    @Step("I receive invalid DELETE user response code 404")
    public void receiveInvalidDELETEresponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
