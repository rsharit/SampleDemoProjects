package assignments.medium.hospital.src.main.hospitalutils;

/**
 * This is the interface to define the functionalities needed
 * for updating information of a patient.
 */

import assignments.medium.hospital.src.main.PatientInfo.CustomisedDate;
import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;

import java.util.Date;

public interface createPatientProfileInterface {

    public void setAddressCity(String city, PatientWrapper patient);

    public void setAddressArea(String area, PatientWrapper patient);

    public void setConsultingDoc(String name, PatientWrapper patient);

    public void setConsultingDocSpecialization(String specialization, PatientWrapper patient);

    public void setPatientAilments(String ailment, PatientWrapper patient);

    public void setPatientOpDate(CustomisedDate date, PatientWrapper patient);
}
