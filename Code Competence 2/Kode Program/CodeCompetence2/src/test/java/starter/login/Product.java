package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class Product {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I GET API products endpoints")
    public String setGetEndpoint(){
        return url + "products/1";
    }
    @Step("I GET HTTP request")
    public void getHTTPRequest(){
        SerenityRest.given().when().get(setGetEndpoint());
    }
    @Step("I receive valid data for detail product")
    public void validResponse(){
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
    }
    @Step("I I receive valid HTTP response code 200")
    public void responseGet200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET API products with invalid endpoints")
    public String getAPIProductInvalid() {
        return url + "product/1";
    }
    @Step("I GET HTTP request with invalid endpoint")
    public void getHTTPInvalidRequest() {
        SerenityRest.given().when().get(getAPIProductInvalid());
    }
    @Step("I receive invalid data for detail product")
    public void receiveInvalidDetailProduct() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET response code 404")
    public void receiveInvalidGETResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API all product endpoints")
    public String setGetAllProductEndpoint(){
        return url + "products";
    }
    @Step("I GET HTTP request product data")
    public void getAllProductRequest(){
        SerenityRest.given().when().get(setGetAllProductEndpoint());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllProduct200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET Wrong API all product endpoints")
    public String setGetAllProductEndpointUrl(){
        return url + "barang";
    }
    @Step("I GET HTTP request user data")
    public void getAllProductRequestUrl(){
        SerenityRest.given().when().get(setGetAllProductEndpointUrl());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllProduct404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET user limit result product with valid param")
    public String getValidLimitProduct() {
        return url + "products?limit=5";
    }
    @Step("I GET HTTP request limit result product with valid param")
    public void getInvalidRequestLimitProduct() {
        SerenityRest.given().when().get(getValidLimitProduct());
    }
    @Step("I receive limit result product with request param")
    public void receiveLimitProductRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result product response code 200")
    public void receiveInvalidLimitProductResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET user limit result product with invalid param")
    public String getLimitProductRequestInvalid() {
        return url + "product?limit=5";
    }
    @Step("I GET HTTP request limit result product with invalid param")
    public void getHTTPInvalidRequestWithLimitProduct() {
        SerenityRest.given().when().get(getLimitProductRequestInvalid());
    }
    @Step("I receive limit result product with invalid request param")
    public void receiveLimitProductWithInvalidRequest() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result product response code 404")
    public void receiveInvalidLimitResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API all categories product endpoints")
    public String setGetAllCategoriesProductEndpoint(){
        return url + "products/categories";
    }
    @Step("I GET HTTP request all categories product data")
    public void getAllCategoriesProductRequest(){
        SerenityRest.given().when().get(setGetAllCategoriesProductEndpoint());
    }
    @Step("I receive valid get all categories product HTTP response code 200")
    public void responseAllCategoriesProduct200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET wrong API all categories product endpoints")
    public String setGetWrongAllCategoriesProductEndpoint(){
        return url + "barang/kategori";
    }
    @Step("I GET HTTP request all categories product data")
    public void getWrongAllCategoriesProductRequest(){
        SerenityRest.given().when().get(setGetWrongAllCategoriesProductEndpoint());
    }
    @Step("I receive invalid get all categories product HTTP response code 404")
    public void responseAllCategoriesProduct404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API categories product endpoints")
    public String setGetCategoriesProductEndpoint(){
        return url + "products/category/jewelry";
    }
    @Step("I GET HTTP request categories product data")
    public void getCategoriesProductRequest(){
        SerenityRest.given().when().get(setGetCategoriesProductEndpoint());
    }
    @Step("I receive valid get categories product HTTP response code 200")
    public void responseCategoriesProduct200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET wrong API categories product endpoints")
    public String setGetWrongCategoriesProductEndpoint(){
        return url + "barang/category/jewelry";
    }
    @Step("I GET wrong HTTP request categories product data")
    public void getWrongCategoriesProductRequest(){
        SerenityRest.given().when().get(setGetWrongCategoriesProductEndpoint());
    }
    @Step("I receive invalid get categories product HTTP response code 404")
    public void responseCategoriesProduct404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I GET API product endpoints")
    public String setGetSortProductEndpoint(){
        return url + "products?sort=desc";
    }
    @Step("I GET HTTP request product with decending sort")
    public void getSortProductRequest(){
        SerenityRest.given().when().get(setGetSortProductEndpoint());
    }
    @Step("I receive valid get descending product HTTP response code 200")
    public void responseSortProduct200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I GET wrong API product endpoints")
    public String setGetWrongSortProductEndpoint(){
        return url + "barang?sort=desc";
    }
    @Step("I GET wrong HTTP request product with decending sort")
    public void getWrongSortProductRequest(){
        SerenityRest.given().when().get(setGetWrongSortProductEndpoint());
    }
    @Step("I receive invalid get descending product HTTP response code 404")
    public void responseSortProduct404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I POST API product endpoints")
    public String setPostEndpoint(){
        return url + "products";
    }
    @Step("I POST HTTP request with valid data")
    public void postHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostEndpoint());
    }
    @Step("I receive valid data for new product")
    public void validBody(){
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
    }
    @Step("I receive valid HTTP response code 200")
    public void responsePost200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I POST the API product endpoints")
    public String setPostApiEndpoint(){
        return url + "barang";
    }
    @Step("I POST wrong HTTP request with valid data")
    public void postWrongHttpRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(setPostApiEndpoint())
                .then()
                .statusCode(404);
    }
    @Step("I receive invalid response code 404")
    public void responsePost404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I PUT API endpoints")
    public String setPutEndpoint(){
        return url + "products/7";
    }
    @Step("I PUT HTTP request")
    public void putHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostEndpoint());
    }
    @Step("I receive valid data for updated product")
    public void validUpdateData(){
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
    }
    @Step("I receive valid PUT response 200")
    public void responsePut200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I PUT API with invalid endpoints")
    public String setPutInvalidEndpoint() {
        return url + "product/7";
    }
    @Step("I PUT HTTP request with invalid endpoints")
    public void putHTTPInvalidRequest() {
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setPutInvalidEndpoint());
    }
    @Step("I receive invalid data for updated product")
    public void receiveInvalidUpdatedProduct() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /product/7</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT response 404")
    public void receiveInvalidPUTResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I DELETE API endpoints")
    public String setDeleteEndpoint(){
        return url + "products/6";
    }
    @Step("I DELETE HTTP request with valid id")
    public void deleteHTTPRequest(){
        SerenityRest.given().when().delete(setDeleteEndpoint());
    }
    @Step("I receive valid DELETE response code 200")
    public void responseDelete200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I DELETE API product with invalid id endpoints")
    public String setDeleteProductWithInvalidIDEndpoint(){
        return url + "product/6";
    }
    @Step("I DELETE product HTTP request with invalid id")
    public void deleteHTTPInvalidRequestWithProduct(){
        SerenityRest.given().when().delete(setDeleteProductWithInvalidIDEndpoint());
    }
    @Step("I receive invalid DELETE product response code 404")
    public void receiveInvalidDELETEProductResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
