package nephrologistapp.treatments;

import nephrologistapp.patients.Patient;

public class IVCyclophosphamideTreatment extends Treatment{
    public IVCyclophosphamideTreatment() {
        super("IV Cyclophosphamide");
    }
    @Override
    public String treatPatient(Patient patient) {
        Double gfr = patient.getGFR().orElse(-1.0);
        // check if gfr is present
        if (gfr == -1.0){
            return "GFR not available. Cannot prescribe Oral Cyclophosphamide";
        }
        int age = patient.getAge();
        double weight = patient.getWeight();
        if (gfr > 30){
            if (age<60){
                return "15 mg/kg/day";
            }
            else if (age>=60 && age<70){
                return "12.5 mg/kg/day";
            }
            else {
                return "10 mg/kg/day";
            }
        }
        else {
            if (age<60){
                return "12.5 mg/kg/day";
            }
            else if (age>=60 && age<70){
                return "10 mg/kg/day";
            }
            else {
                return "7.5 mg/kg/day";
            }
        }
    }
}
