package nephrologistapp;

import java.io.BufferedReader;
import java.io.FileReader;
import nephrologistapp.patients.Patient;
import nephrologistapp.treatments.Treatment;
import nephrologistapp.treatments.PrednisoneTreatment;

public class App {
    public static void main(String[] args) throws Exception {
        Patient patient = new Patient("John Doe", 25, 50.0);
        Treatment treatment = new PrednisoneTreatment();
        
        BufferedReader reader = new BufferedReader(new FileReader("src/nephrologistapp/treatments/prednisone_data/standard_dosage.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
        }
        
        System.out.println(patient.printPatient());
        System.out.println(treatment.treatPatient(patient));
    }
}
