package nephrologistapp;

import java.io.BufferedReader;
import java.io.FileReader;
import nephrologistapp.patients.Patient;
import nephrologistapp.treatments.Treatment;
import nephrologistapp.treatments.IVCyclophosphamideTreatment;
import nephrologistapp.treatments.OralCyclophosphamideTreatment;
import nephrologistapp.treatments.PrednisoneTreatment;

public class App {
    public static void main(String[] args) throws Exception {
        Patient patient = new Patient("John Doe", 25, 50.0, 40.0); //weigth in kilogram
        Treatment p_treatment = new PrednisoneTreatment();
        Treatment oc_treatment = new OralCyclophosphamideTreatment();
        Treatment ivc_treatment = new IVCyclophosphamideTreatment(); 
        
        System.out.println("Patient Info:");
        System.out.println(patient.printPatient());

        System.out.println("");

        System.out.println("Using PrednisoneTreatment:");
        System.out.println(p_treatment.treatPatient(patient,true));
        System.out.println("");
        System.out.println("Using OralCyclophosphamideTreatment:");
        System.out.println(oc_treatment.treatPatient(patient));
        System.out.println("");
        System.out.println("Using IVCyclophosphamideTreatment:");
        System.out.println(ivc_treatment.treatPatient(patient));
    }
}
