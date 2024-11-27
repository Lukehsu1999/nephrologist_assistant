package nephrologistapp.treatments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import nephrologistapp.patients.Patient;

public class PrednisoneTreatment extends Treatment{
    // Enum for weight groups
    public enum WeightGroup {
        UNDER_50("<50"),
        MEDIUM("50-75"),
        OVER_75(">75");

        private final String label;

        WeightGroup(String label) {
            this.label = label;
        }
    }

    private WeightGroup getWeightGroup(double weight) {
        if (weight < 50) {
            return WeightGroup.UNDER_50;
        } else if (weight < 75) {
            return WeightGroup.MEDIUM;
        } else {
            return WeightGroup.OVER_75;
        }
    }

    // Class attribute: static and final
    // DoseType -> Week -> WeightGroup -> Dose
    private static String standardDosageFilePath = "src/nephrologistapp/treatments/prednisone_data/standard_dosage.csv";
    private static String reducedDosageFilePath = "src/nephrologistapp/treatments/prednisone_data/reduced_dosage.csv";
    // refactor DosageTable to WeightGroup -> Week -> Dose
    private static final Map<WeightGroup, Map<String, Double>> standardDosageTable;
    private static final Map<WeightGroup, Map<String, Double>> reducedDosageTable;


    // Static initializer block to populate the dosageTable
    static {
        System.out.println("PrednisoneTreatment class initialized");
        standardDosageTable = new HashMap<>();
        reducedDosageTable = new HashMap<>();

        // Populate the standardDosageTable here
        try (BufferedReader reader = new BufferedReader(new FileReader(standardDosageFilePath))) {
            // Skip the header line
            reader.readLine();

            standardDosageTable.put(WeightGroup.UNDER_50, new HashMap<String, Double>());
            standardDosageTable.put(WeightGroup.MEDIUM, new HashMap<String, Double>());
            standardDosageTable.put(WeightGroup.OVER_75, new HashMap<String, Double>());
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String weekString = parts[0];
                double under50Dose = Double.parseDouble(parts[1]);
                double mediumDose = Double.parseDouble(parts[2]);
                double over75Dose = Double.parseDouble(parts[3]);
                standardDosageTable.get(WeightGroup.UNDER_50).put(weekString, under50Dose);
                standardDosageTable.get(WeightGroup.MEDIUM).put(weekString, mediumDose);
                standardDosageTable.get(WeightGroup.OVER_75).put(weekString, over75Dose);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Populate the reducedDosageTable here
        try (BufferedReader reader = new BufferedReader(new FileReader(reducedDosageFilePath))) {
            // Skip the header line
            reader.readLine();

            reducedDosageTable.put(WeightGroup.UNDER_50, new HashMap<String, Double>());
            reducedDosageTable.put(WeightGroup.MEDIUM, new HashMap<String, Double>());
            reducedDosageTable.put(WeightGroup.OVER_75, new HashMap<String, Double>());
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String weekString = parts[0];
                double under50Dose = Double.parseDouble(parts[1]);
                double mediumDose = Double.parseDouble(parts[2]);
                double over75Dose = Double.parseDouble(parts[3]);
                reducedDosageTable.get(WeightGroup.UNDER_50).put(weekString, under50Dose);
                reducedDosageTable.get(WeightGroup.MEDIUM).put(weekString, mediumDose);
                reducedDosageTable.get(WeightGroup.OVER_75).put(weekString, over75Dose);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // You can provide a public getter method if needed
    public static Map<WeightGroup, Map<String, Double>> getDosageTable(Map<WeightGroup, Map<String, Double>> dosageTable) {
        return Collections.unmodifiableMap(dosageTable);
    }

    public static String printEntireDosageTable(Map<WeightGroup, Map<String, Double>> dosageTable) {
        return dosageTable.toString();
    }

    // Constructor
    public PrednisoneTreatment() {
        super("Prednisone"); 
    }
    
    @Override
    public String treatPatient(Patient patient) {
        double patient_weight = patient.getWeight();
        WeightGroup weightGroup = getWeightGroup(patient_weight);

        return printEntireDosageTable(standardDosageTable);
    }
    
}
