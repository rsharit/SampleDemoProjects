package assignments.medium.hospital.src.tests;

import assignments.medium.hospital.src.main.PatientInfo.CustomisedDate;
import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;
import assignments.medium.hospital.src.main.helpers.DeserializablePatientWrapper;
import assignments.medium.hospital.src.main.helpers.SerializablePatientWrapper;
import assignments.medium.hospital.src.main.hospitalutils.CreatePatientProfile;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializablePatientWrapper spw = new SerializablePatientWrapper();
        DeserializablePatientWrapper dpw = new DeserializablePatientWrapper();

        CreatePatientProfile patient1 = new CreatePatientProfile();
        patient1.createPatient("Hari Singh", 01, new CustomisedDate());

        spw.serializePatientWrapper();
        PatientWrapper temp = dpw.deserializePatientWrapper("src/test/java/assignments/medium/hospital/src/main/resources/myObjects.txt");
        System.out.println();


    }
}
