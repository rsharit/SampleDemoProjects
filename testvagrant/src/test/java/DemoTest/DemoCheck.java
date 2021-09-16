package DemoTest;

import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import util.deserializer.Deserializer;
import util.serializer.Serializer;
import weather.pojo.Clouds;
import weather.pojo.Main;

public class DemoCheck {
    public static void main(String args[]) throws SerializeException, ParseException {
        Clouds cloud = new Clouds();
        cloud.setAll(2);

        Serializer serializerObj = new Serializer();
        String jsonString = serializerObj.getJsonString(cloud);
        System.out.println(jsonString);

        Deserializer deserializerObj = new Deserializer();
        Clouds cloud2 = deserializerObj.getDeserializedObj(jsonString, Clouds.class);
        System.out.println();

        Main main = new Main();
        main.setFeels_like(303.3);
        main.setTemp(299.9);
        main.setTemp_max(299.9);
        main.setTemp_min(280.2);
        main.setGrnd_level(1010);
        main.setHumidity(93);

        jsonString = serializerObj.getJsonString(main);
        Main main2 = deserializerObj.getDeserializedObj(jsonString, Main.class);
        System.out.println();




    }
}
