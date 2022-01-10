package assignments.medium.hospital.src.tests;

import assignments.medium.hospital.src.main.PatientInfo.CustomisedDate;
import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;
import assignments.medium.hospital.src.main.helpers.DeserializablePatientWrapper;
import assignments.medium.hospital.src.main.helpers.SerializablePatientWrapper;
import assignments.medium.hospital.src.main.hospitalutils.CreateHospital;
import assignments.medium.hospital.src.main.hospitalutils.CreatePatientProfile;
import org.apache.juneau.serializer.SerializeException;
import utils.deserializer.Deserializer;
import utils.serializer.Serializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args)  {

        try{
            // Initializing hospital
            CreateHospital hospital = new CreateHospital();

            // Initializing patients
            for(int i=0; i<10; i++){
                int randomPinCode = 1 + (int)Math.random()*10;
                String patientName = "Patient " + i + randomPinCode;
                hospital.getPatientsList().add(
                        new CreatePatientProfile().
                                createPatient(patientName, randomPinCode, new CustomisedDate()));

            }

            // Apply operations
            // ready for extention


        }catch(Exception e){

        }



    }
}
