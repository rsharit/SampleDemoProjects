package assignments.medium.hospital.src.main.hospitalutils;

/**
 * This class provides helper methods to create patient profile
 * Also this class provides helpmer methods to update patient information.
 */

import assignments.medium.hospital.src.main.PatientInfo.*;

public class CreatePatientProfile implements createPatientProfileInterface{

    public PatientWrapper createPatient(String name, int pincode, CustomisedDate date){
        PatientWrapper patient = new PatientWrapper();
        //initializing inner classes
        patient.setPatient(new Patient());
        patient.setAddress(new Address());
        patient.setAilments(new PatientAilment());
        patient.setConsultingDoc(new ConsultingDoctor());
        patient.setDate(date);


        patient.getPatient().setName(name);
        patient.getAddress().setPincode(pincode);
        patient.setDate(date);
        return patient;
    }

    public void setAddressCity(String city, PatientWrapper patient){
        patient.getAddress().setCity(city);
    }

    public void setAddressArea(String area, PatientWrapper patient){
        patient.getAddress().setArea(area);
    }

    public void setConsultingDoc(String name, PatientWrapper patient){
        patient.getConsultingDoc().setDocName(name);
    }

    public void setConsultingDocSpecialization(String specialization, PatientWrapper patient){
        patient.getConsultingDoc().getSpecialization().add(specialization);
    }

    public void setPatientAilments(String ailment, PatientWrapper patient){
        patient.getAilments().getAilments().add(ailment);
    }

    public void setPatientOpDate(CustomisedDate date, PatientWrapper patient){
        patient.setDate(date);
    }
}
