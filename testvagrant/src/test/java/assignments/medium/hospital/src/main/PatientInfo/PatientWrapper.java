package assignments.medium.hospital.src.main.PatientInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * This class wraps unit classes for the information associated for patient
 * Please add more unit classes needed for patient information
 */

public class PatientWrapper{
    Patient patient;
    Address address;
    ConsultingDoctor consultingDoc;
    PatientAilment ailments;
    CustomisedDate date;

    public CustomisedDate getDate() {
        return date;
    }

    public void setDate(CustomisedDate date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ConsultingDoctor getConsultingDoc() {
        return consultingDoc;
    }

    public void setConsultingDoc(ConsultingDoctor consultingDoc) {
        this.consultingDoc = consultingDoc;
    }

    public PatientAilment getAilments() {
        return ailments;
    }

    public void setAilments(PatientAilment ailments) {
        this.ailments = ailments;
    }
}
