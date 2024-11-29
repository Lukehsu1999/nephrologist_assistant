package nephrologistapp.treatments;

import nephrologistapp.patients.Patient;
public class OralCyclophosphamideTreatment extends Treatment {

    public OralCyclophosphamideTreatment() {
        super("Oral Cyclophosphamide");
    }

    @Override
    public String treatPatient(Patient patient) {
        return "Patient " + patient.getName() + " has been treated with Oral Cyclphosphamide";
    }
    
}
