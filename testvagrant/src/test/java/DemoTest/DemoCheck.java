package DemoTest;

import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import util.deserializer.Deserializer;
import util.serializer.Serializer;
import weather.pojo.Clouds;

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

    }
}
