package assignments.medium.hospital.src.main.helpers;

import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;

import java.io.*;

public class SerializablePatientWrapper implements Serializable {
    PatientWrapper objectToSerialize = null;

    public PatientWrapper getObjectToSerialize() {
        return objectToSerialize;
    }

    public void setObjectToSerialize(PatientWrapper objectToSerialize) {
        this.objectToSerialize = objectToSerialize;
    }

    public void serializePatientWrapper() throws IOException {
        FileOutputStream f = new FileOutputStream(new File("src/test/java/assignments/medium/hospital/src/main/resources/myObjects.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);

        // Write objects to file
        o.writeObject(objectToSerialize);

        o.close();
        f.close();
    }
}
