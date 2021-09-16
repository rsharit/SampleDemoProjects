package RestAssured.AccuWeather;

import RestAssured.Requests.BaseRequest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetRequestAW extends BaseRequest {

    public <T> void setQueryParameter(String key, T value){
        getRequestSpecification().param(key, value);
    }

    public void setBasePath(String basePath){
        getRequestSpecification().basePath(basePath);
    }

    public Response get(){
        Response response = given().spec(getRequestSpecification()).get().then().extract().response();
    }
}
