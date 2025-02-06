import java.util.ArrayList;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient: " + name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients; 

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void consult(Patient patient) {  
        System.out.println("Dr. " + name + " is consulting with " + patient.name);
    }

    public void viewPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void displayDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor doctor : doctors) {
            doctor.viewPatients();
        }
    }
}

public class MainHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Max Hospital");

        Doctor drSmith = new Doctor("John Smith");
        Doctor drJohnson = new Doctor("Jane Johnson");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        Patient patient3 = new Patient("Charlie");

        drSmith.addPatient(patient1);
        drSmith.addPatient(patient2);
        drJohnson.addPatient(patient3);

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJohnson);

        hospital.displayDoctors();

        drSmith.consult(patient1);
        drJohnson.consult(patient3);
    }
}