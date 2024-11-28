package nephrologistapp.patients;

import java.util.Optional;

public class Patient {
    private String name;
    private int age;
    private double weight;
    private Optional<Double> gfr;
    
    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gfr = Optional.empty();
    }

    public Patient(String name, int age, double weight, Double gfr) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gfr = Optional.ofNullable(gfr); // Allow null values
    }
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Optional<Double> getGFR() {
        return gfr;
    }

    public void setGFR(Double gfr) {
        this.gfr = Optional.ofNullable(gfr);
    }

    // Other methods
    public String printPatient(){
        return "Patient Info:\n" + "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + (gfr.isPresent() ? "\nGFR: " + gfr.get() : "\nGFR: Not available");
    }
}
