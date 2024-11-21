package nephrologistapp.treatments;

import nephrologistapp.patients.Patient;

public class Treatment {
    private final String treatmentName;

    public Treatment(String treatmentName) {
        this.treatmentName = treatmentName;
    }


    // Getters and setters
    public String getTreatmentName() {  
        return treatmentName;
    }

    // Other methods
    public String treatPatient(Patient patient) {
        return "Patient " + patient.getName() + " has been treated with " + treatmentName;
    }

}
