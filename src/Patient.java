public class Patient {
    private String name;
    private int age;
    private double weight;
    
    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // Getters and setters
    public String printPatient(){
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
    }
}
