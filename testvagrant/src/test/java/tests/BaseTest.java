package tests;

import org.testng.asserts.SoftAssert;
import testutils.CustomComparator;
import testutils.GetWeatherOfCityResponse;
import utils.deserializer.Deserializer;

public class BaseTest {
    Deserializer deserializerObj = new Deserializer();
    SoftAssert softAssert = new SoftAssert();
    CustomComparator customComparator = new CustomComparator();
    GetWeatherOfCityResponse cityWeather = new GetWeatherOfCityResponse();

}
