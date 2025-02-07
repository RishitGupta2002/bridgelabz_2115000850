class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void refuel() {
        System.out.println(model + " is refueling.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle petrolVehicle = new PetrolVehicle(180, "Ford Mustang");

        electricVehicle.charge();
        petrolVehicle.refuel();
    }
}
