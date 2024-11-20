public class Treatment {
    private String treatmentName;

    public Treatment(String treatmentName) {
        this.treatmentName = treatmentName;
    }


    // Getters and setters
    public String getTreatmentName() {  
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    // Other methods
    public String treatPatient(Patient patient) {
        return "Patient " + patient.getName() + " has been treated with " + treatmentName;
    }

}
