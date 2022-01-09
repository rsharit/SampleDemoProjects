package assignments.medium.hospital.src.main.hospitalutils;

import assignments.medium.hospital.src.main.PatientInfo.Address;
import assignments.medium.hospital.src.main.PatientInfo.ConsultingDoctor;
import assignments.medium.hospital.src.main.PatientInfo.CustomisedDate;
import assignments.medium.hospital.src.main.PatientInfo.PatientWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreateHospital {
    final String hospitalName = "Chinnamaya Mission Hospital";
    List<PatientWrapper> patientsList = new ArrayList<>();
    List<ConsultingDoctor> doctorsList = new ArrayList<>();
    HashMap<String, Address> addressList = new HashMap<>();

    public String getHospitalName() {
        return hospitalName;
    }

    public List<PatientWrapper> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<PatientWrapper> patientsList) {
        this.patientsList = patientsList;
    }

    public List<ConsultingDoctor> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<ConsultingDoctor> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public HashMap<String, Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(HashMap<String, Address> addressList) {
        this.addressList = addressList;
    }

    public void filterPatientByDates(CustomisedDate date){
        /**
         * Add logic to filter patient by dates
         */
    }

    public void filterPatientByPin(){
        /**
         * Add logic to filter patient by Pin
         */
    }

    public void parsePatients(){
        /**
         * override to string method to print patient information
         */

    }




}
