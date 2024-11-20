public class App {
    public static void main(String[] args) throws Exception {
        Patient patient = new Patient("John Doe", 25, 75.5);
        System.out.println(patient.printPatient());
        System.out.println("Hello, World!");
    }
}
