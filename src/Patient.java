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

    // Other methods
    public String printPatient(){
        return "Patient Info:\n" + "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
    }
}
