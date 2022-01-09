package assignments.medium.hospital.src.main.PatientInfo;

import java.util.ArrayList;
import java.util.List;

public class ConsultingDoctor {
    String docName;
    List<String> specialization = new ArrayList<>();

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public List<String> getSpecialization() {
        return specialization;
    }

    public void setSpecialization(List<String> specialization) {
        this.specialization = specialization;
    }
}
