package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class Cart {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I GET API cart endpoints")
    public String setGetCartEndpoint(){
        return url + "carts/5";
    }
    @Step("I GET HTTP request cart data")
    public void getCartRequest(){
        SerenityRest.given().when().get(setGetCartEndpoint());
    }
    @Step("I receive valid data for detail cart")
    public void validResponseCart(){
        restAssuredThat(response -> response.body("'id'", equalTo(5)));
    }
    @Step("I receive valid cart HTTP response code 200")
    public void responseCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET API single cart with invalid url")
    public String setWrongtCartEndpoint(){
        return url + "cart/5";
    }
    @Step("I GET HTTP request single cart data with invalid url")
    public void getWrongCartRequest(){
        SerenityRest.given().when().get(setWrongtCartEndpoint());
    }
    @Step("I receive invalid data for single cart")
    public void receiveInvalidDataForSingleUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart/5</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET single cart response code 404")
    public void responseUserCart404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET user limit result cart with valid param")
    public String getLimitCartValidRequest() {
        return url + "carts?limit=5";
    }
    @Step("I GET HTTP request limit result cart with valid param")
    public void getHTTPValidRequestWithLimitCartParam() {
        SerenityRest.given().when().get(getLimitCartValidRequest());
    }
    @Step("I receive limit result cart with request param")
    public void receiveLimitCartWithValidRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result cart response code 200")
    public void receiveValidLimitCartResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET user limit result cart with invalid param")
    public String getLimitCartInvalidRequest() {
        return url + "cart?limit=5";
    }
    @Step("I GET HTTP request limit result cart with invalid param")
    public void getHTTPInvalidRequestWithLimitCartParam() {
        SerenityRest.given().when().get(getLimitCartInvalidRequest());
    }
    @Step("I receive limit result cart with invalid request param")
    public void receiveLimitCartWitInvalidhRequestParam() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result cart response code 404")
    public void receiveInvalidLimitCartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API cart endpoint")
    public String setGetSortCartEndpoint(){
        return url + "carts?sort=desc";
    }
    @Step("I GET HTTP request cart with decending sort")
    public void getSortCartRequest(){
        SerenityRest.given().when().get(setGetSortCartEndpoint());
    }
    @Step("I receive invalid get descending cart HTTP response code 200")
    public void responseSortCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET wrong API cart endpoint")
    public String setGetWrongSortCartEndpoint(){
        return url + "keranjang?sort=desc";
    }
    @Step("I GET wrong HTTP request cart with decending sort")
    public void getWrongSortCartRequest(){
        SerenityRest.given().when().get(setGetWrongSortCartEndpoint());
    }
    @Step("I receive invalid get descending cart HTTP response code 404")
    public void responseSortCart404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API all cart endpoints")
    public String setGetAllCartEndpoint(){
        return url + "carts";
    }
    @Step("I GET HTTP request cart data")
    public void getAllCartRequest(){
        SerenityRest.given().when().get(setGetAllCartEndpoint());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET Wrong API all product endpoints")
    public String setGetAllCartEndpointUrl(){
        return url + "keranjang";
    }
    @Step("I GET HTTP request user data")
    public void getAllCartRequestUrl(){
        SerenityRest.given().when().get(setGetAllCartEndpointUrl());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllCart404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API user cart endpoints")
    public String setGetUserCartEndpoint(){
        return url + "carts";
    }
    @Step("I GET HTTP url request user cart data")
    public void getUserCartRequest(){
        SerenityRest.given().when().get(setGetUserCartEndpoint());
    }
    @Step("I receive valid get user cart HTTP response code 404")
    public void responseUserCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET API in date range cart param with valid data")
    public String getAPIDateRangeCartWithValidData(){
        return url + "carts?startdate=2019-12-10&enddate=2020-10-10";
    }
    @Step("I GET HTTP request data range cart param with valid data")
    public void getHTTPRequestValidWithDataRangeCart() {
        SerenityRest.given().when().get(getAPIDateRangeCartWithValidData());
    }
    @Step("I receive valid data with data range cart param")
    public void receiveValidDataRange() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5, 6, 7)));
    }
    @Step("I receive valid GET data range cart response code 200")
    public void receiveValidGETDataRangeCartResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET API in date range cart param with invalid data")
    public String getAPIDateRangeCartWithInvalidData(){
        return url + "cart?startdate=2019-12-10&enddate=2020-10-10";
    }
    @Step("I GET HTTP request data range cart param with invalid data")
    public void getHTTPRequestInvalidWithDataRangeCart() {
        SerenityRest.given().when().get(getAPIDateRangeCartWithInvalidData());
    }
    @Step("I receive invalid data with data range cart param")
    public void receiveInvalidDataRange() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET data range cart response code 404")
    public void receiveInvalidGETDataRangeCartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I POST API cart endpoints")
    public String setPostCartEndpoint(){
        return url + "carts";
    }
    @Step("I POST HTTP request with valid data cart")
    public void postCartRequest(){
        JSONObject body = new JSONObject();
        body.put("userId",5);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostCartEndpoint());
    }
    @Step("I receive valid data for new cart")
    public void validResponseNewCart(){
        restAssuredThat(response -> response.body("'userId'", equalTo(5)));
    }
    @Step("I receive valid cart response 200")
    public void responseNewCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I POST API new cart with invalid endpoints")
    public String postNewCartWithInvalidEndpoint(){
        return url + "keranjan/5";
    }
    @Step("I POST HTTP request with invalid data cart")
    public void postHTTPRequestWithInvalidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",5);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postNewCartWithInvalidEndpoint());
    }
    @Step("I receive invalid data for new cart")
    public void receiveInvalidDataForNewCart(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot POST /keranjan/5</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid POST new cart response code 404")
    public void receiveInvalidPOSTNewCartResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I PUT cart API endpoints")
    public String setPutCartEndpoint(){
        return url + "carts/7";
    }
    @Step("I PUT cart HTTP request")
    public void putCartRequest(){
        JSONObject body = new JSONObject();
        body.put("userId",3);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setPutCartEndpoint());
    }
    @Step("I receive valid data for updated cart")
    public void validResponseUpdatedCart(){
        restAssuredThat(response -> response.body("'userId'", equalTo(3)));
    }
    @Step("I receive valid PUT cart response 200")
    public void responseUpdatedCart200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I PUT cart API with invalid endpoints")
    public String putCartWithInvalidEndpoint() {
        return url + "cart/7";
    }
    @Step("I PUT cart HTTP request with invalid data cart")
    public void putCartRequestWithInvalidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",7);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(putCartWithInvalidEndpoint());
    }
    @Step("I receive invalid data for updated cart")
    public void receiveInvalidDataForUpdatedCart(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /cart/7</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT cart response code 404")
    public void receiveInvalidPUTCartResponseCode2404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I DELETE API cart endpoints")
    public String setDeleteCartEndpoint(){
        return url + "products/6";
    }
    @Step("I DELETE cart HTTP request with valid id")
    public void deleteCartHTTPRequest(){
        SerenityRest.given().when().delete(setDeleteCartEndpoint());
    }
    @Step("I receive valid DELETE cart response code 200")
    public void responseDeleteCart200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I DELETE API cart with invalid id endpoints")
    public String deleteAPICartWithInvalidIDEndpoint(){
        return url + "product/6";
    }
    @Step("I DELETE cart HTTP request with invalid id")
    public void deleteCartInvalidIDRequest(){
        SerenityRest.given().when().delete(deleteAPICartWithInvalidIDEndpoint());
    }
    @Step("I receive invalid DELETE cart response code 404")
    public void receiveInvalidDELETECartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
