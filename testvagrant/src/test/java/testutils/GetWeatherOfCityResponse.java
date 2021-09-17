package testutils;

import Constants.AWConstants;
import RestAssured.AccuWeather.GetRequestAW;
import io.restassured.response.Response;

public class GetWeatherOfCityResponse {
    final String baseUrl = AWConstants.baseURl;
    final String basePath = AWConstants.basePath;
    final String apiKey = AWConstants.apiKey;

    public Response getWeatherofCityResponse(String city){
        GetRequestAW weatherObj = new GetRequestAW(baseUrl);
        weatherObj.setBasePath(basePath);
        weatherObj.setQueryParameter("appid", apiKey);
        weatherObj.setQueryParameter("q", city);
        Response response = weatherObj.get();
        return response;
    }

}
