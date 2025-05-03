// Vehicle.java - Abstract class to enforce common behavior
public abstract class Vehicle {
    private String make; // Made private to enforce encapsulation

    public Vehicle(String make) {
        this.make = make;
    }

    public String getMake() { // Getter for encapsulated field
        return make;
    }

    // Abstract method to be implemented by all vehicles
    public abstract void displayInfo();
}
