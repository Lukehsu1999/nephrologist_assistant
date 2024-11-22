package nephrologistapp.treatments;

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

    // Enum for dose types
    public enum DoseType {
        STANDARD,
        REDUCED
    }

    // Store dosages in a map
    private Map<DoseType, Map<String, Map<WeightGroup, Double>>> dosageTable;

    // Constructor
    public PrednisoneTreatment() {
        super("Prednisone"); 
        initializeDosageTable();
    }

    private void initializeDosageTable() {
        // Initialize standard doses
        Map<String, Map<WeightGroup, Double>> standardDoses = new HashMap<>();
        standardDoses.put("1", createWeightDoseMap(50.0, 60.0, 75.0));
        standardDoses.put("2", createWeightDoseMap(50.0, 60.0, 75.0));
        // Add more weeks...
        
        dosageTable.put(DoseType.STANDARD, standardDoses);
    }

    private Map<WeightGroup, Double> createWeightDoseMap(Double under50, Double medium, Double over75) {
        Map<WeightGroup, Double> doses = new EnumMap<>(WeightGroup.class);
        doses.put(WeightGroup.UNDER_50, under50);
        doses.put(WeightGroup.MEDIUM, medium);
        doses.put(WeightGroup.OVER_75, over75);
        return doses;
    }

    public Double getDose(DoseType doseType, String week, WeightGroup weightGroup) {
        return dosageTable.get(doseType)
                         .getOrDefault(week, Collections.emptyMap())
                         .getOrDefault(weightGroup, 0.0);
    }


    
    @Override
    public String treatPatient(Patient patient) {
        return "";
    }
    
}
