package RestAssured.Requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseRequest{
    RequestSpecification requestSpecification = null;

    public BaseRequest(){
    }

    public BaseRequest(String baseUrl){
        this.requestSpecification = RestAssured.given().baseUri(baseUrl);
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }
}
