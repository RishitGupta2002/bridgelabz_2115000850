abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord() {
        System.out.println("InPatient record added for: " + getName());
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing records for: " + getName());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord() {
        System.out.println("OutPatient record added for: " + getName());
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing records for: " + getName());
    }
}

interface MedicalRecord {
    void addRecord();
    void viewRecords();
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P123", "Alice", 30, 5, 2000);
        Patient outPatient = new OutPatient("P456", "Bob", 45, 500);

        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());

        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());
    }
}
