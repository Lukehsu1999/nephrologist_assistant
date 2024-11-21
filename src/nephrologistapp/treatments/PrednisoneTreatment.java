package nephrologistapp.treatments;

import nephrologistapp.patients.Patient;

public class PrednisoneTreatment extends Treatment{
    
    public PrednisoneTreatment() {
        super("Prednisone"); 
    }
    
    @Override
    public String treatPatient(Patient patient) {
        return "Predisone treatment";
    }
    
}
