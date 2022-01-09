package assignments.medium.hospital.src.main.helpers;

import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;

import java.io.*;

public class DeserializablePatientWrapper implements Serializable {
//    PatientWrapper objectToDeserialize = null;

//    public PatientWrapper getObjectToDeserialize() {
//        return objectToDeserialize;
//    }

//    public void setObjectToDeserialize(PatientWrapper objectToDeserialize) {
//        this.objectToDeserialize = objectToDeserialize;
//    }

    public PatientWrapper deserializePatientWrapper(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(new File(filePath));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        PatientWrapper tempPatientWrapper = (PatientWrapper) oi.readObject();

        oi.close();
        fi.close();

        return tempPatientWrapper;
    }
}
