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

    private WeightGroup getWeightGroup(double weight) {
        if (weight < 50) {
            return WeightGroup.UNDER_50;
        } else if (weight < 75) {
            return WeightGroup.MEDIUM;
        } else {
            return WeightGroup.OVER_75;
        }
    }

    // Enum for dose types
    public enum DoseType {
        STANDARD,
        REDUCED
    }

    // Class attribute: static and final
    // DoseType -> Week -> WeightGroup -> Dose
    private static final Map<DoseType, Map<String, Map<WeightGroup, Double>>> dosageTable;


    // Static initializer block to populate the dosageTable
    static {
        dosageTable = new HashMap<>();
        // Populate the dosageTable here
        dosageTable.put(DoseType.STANDARD, new HashMap<>());
        dosageTable.put(DoseType.REDUCED, new HashMap<>());
        // populate standard dosageTable
        dosageTable.get(DoseType.STANDARD).put("1", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("1").put(WeightGroup.UNDER_50, 50.0);
        dosageTable.get(DoseType.STANDARD).get("1").put(WeightGroup.MEDIUM, 60.0);
        dosageTable.get(DoseType.STANDARD).get("1").put(WeightGroup.OVER_75, 75.0);

        dosageTable.get(DoseType.STANDARD).put("2", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("2").put(WeightGroup.UNDER_50, 50.0);
        dosageTable.get(DoseType.STANDARD).get("2").put(WeightGroup.MEDIUM, 60.0);
        dosageTable.get(DoseType.STANDARD).get("2").put(WeightGroup.OVER_75, 75.0);

        dosageTable.get(DoseType.STANDARD).put("3-4", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("3-4").put(WeightGroup.UNDER_50, 40.0);
        dosageTable.get(DoseType.STANDARD).get("3-4").put(WeightGroup.MEDIUM, 50.0);
        dosageTable.get(DoseType.STANDARD).get("3-4").put(WeightGroup.OVER_75, 60.0);

        dosageTable.get(DoseType.STANDARD).put("5-6", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("5-6").put(WeightGroup.UNDER_50,30.0);
        dosageTable.get(DoseType.STANDARD).get("5-6").put(WeightGroup.MEDIUM,40.0);
        dosageTable.get(DoseType.STANDARD).get("5-6").put(WeightGroup.OVER_75, 50.0);

        dosageTable.get(DoseType.STANDARD).put("7-8", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("7-8").put(WeightGroup.UNDER_50,25.0);
        dosageTable.get(DoseType.STANDARD).get("7-8").put(WeightGroup.MEDIUM,30.0);
        dosageTable.get(DoseType.STANDARD).get("7-8").put(WeightGroup.OVER_75, 40.0);

        dosageTable.get(DoseType.STANDARD).put("9-10", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("9-10").put(WeightGroup.UNDER_50,20.0);
        dosageTable.get(DoseType.STANDARD).get("9-10").put(WeightGroup.MEDIUM,25.0);
        dosageTable.get(DoseType.STANDARD).get("9-10").put(WeightGroup.OVER_75, 30.0);

        dosageTable.get(DoseType.STANDARD).put("11-12", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("11-12").put(WeightGroup.UNDER_50,15.0);
        dosageTable.get(DoseType.STANDARD).get("11-12").put(WeightGroup.MEDIUM,20.0);
        dosageTable.get(DoseType.STANDARD).get("11-12").put(WeightGroup.OVER_75, 30.0);

        dosageTable.get(DoseType.STANDARD).put("13-14", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("13-14").put(WeightGroup.UNDER_50,12.5);
        dosageTable.get(DoseType.STANDARD).get("13-14").put(WeightGroup.MEDIUM,15.0);
        dosageTable.get(DoseType.STANDARD).get("13-14").put(WeightGroup.OVER_75, 20.0);

        dosageTable.get(DoseType.STANDARD).put("15-16", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("15-16").put(WeightGroup.UNDER_50,10.0);
        dosageTable.get(DoseType.STANDARD).get("15-16").put(WeightGroup.MEDIUM,10.0);
        dosageTable.get(DoseType.STANDARD).get("15-16").put(WeightGroup.OVER_75, 15.0);

        dosageTable.get(DoseType.STANDARD).put("17-18", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("17-18").put(WeightGroup.UNDER_50,10.0);
        dosageTable.get(DoseType.STANDARD).get("17-18").put(WeightGroup.MEDIUM,10.0);
        dosageTable.get(DoseType.STANDARD).get("17-18").put(WeightGroup.OVER_75, 15.0);

        dosageTable.get(DoseType.STANDARD).put("19-20", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("19-20").put(WeightGroup.UNDER_50,7.5);
        dosageTable.get(DoseType.STANDARD).get("19-20").put(WeightGroup.MEDIUM,7.5);
        dosageTable.get(DoseType.STANDARD).get("19-20").put(WeightGroup.OVER_75, 10.0);

        dosageTable.get(DoseType.STANDARD).put("21-22", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("21-22").put(WeightGroup.UNDER_50,7.5);
        dosageTable.get(DoseType.STANDARD).get("21-22").put(WeightGroup.MEDIUM,7.5);
        dosageTable.get(DoseType.STANDARD).get("21-22").put(WeightGroup.OVER_75, 7.5);

        dosageTable.get(DoseType.STANDARD).put("23-52", new EnumMap<>(WeightGroup.class));
        dosageTable.get(DoseType.STANDARD).get("23-52").put(WeightGroup.UNDER_50,5.0);
        dosageTable.get(DoseType.STANDARD).get("23-52").put(WeightGroup.MEDIUM,5.0);
        dosageTable.get(DoseType.STANDARD).get("23-52").put(WeightGroup.OVER_75, 5.0);
    }

    // You can provide a public getter method if needed
    public static Map<DoseType, Map<String, Map<WeightGroup, Double>>> getDosageTable() {
        return Collections.unmodifiableMap(dosageTable);
    }

    public static String printEntireDosageTable(){
        
        return dosageTable.toString();
    }

    // Constructor
    public PrednisoneTreatment() {
        super("Prednisone"); 
        //initializeDosageTable();
    }

    /*rivate void initializeDosageTable() {
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
    }*/


    
    @Override
    public String treatPatient(Patient patient) {
        double patient_weight = patient.getWeight();
        WeightGroup weightGroup = getWeightGroup(patient_weight);

        return printEntireDosageTable();
    }
    
}
