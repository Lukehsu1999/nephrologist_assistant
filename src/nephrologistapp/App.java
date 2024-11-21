package nephrologistapp;


import nephrologistapp.patients.Patient;
import nephrologistapp.treatments.Treatment;
import nephrologistapp.treatments.PrednisoneTreatment;

public class App {
    public static void main(String[] args) throws Exception {
        Patient patient = new Patient("John Doe", 25, 75.5);
        Treatment treatment = new PrednisoneTreatment();
        
        
        System.out.println(patient.printPatient());
        System.out.println(treatment.treatPatient(patient));
    }
}
