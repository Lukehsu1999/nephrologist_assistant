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
        double dosagePerWeight = 0.0;
        if (gfr > 30){
            if (age<60){
                dosagePerWeight = 15.0;
            }
            else if (age>=60 && age<70){
                dosagePerWeight = 12.5;
            }
            else {
                dosagePerWeight = 10.0;
            }
        }
        else {
            if (age<60){
                dosagePerWeight = 12.5;
            }
            else if (age>=60 && age<70){
                dosagePerWeight = 10.0;
            }
            else {
                dosagePerWeight = 7.5;
            }
        }
        return dosagePerWeight*weight+ " per injection every 2 weeks";
    }
}
