// Main.java - Driver class
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");

        // Polymorphism in action
        VehicleUtils.showVehicleDetails(car);
        VehicleUtils.showVehicleDetails(motorcycle);

        // Interface method usage
        ((Drivable) car).drive();
        ((Drivable) motorcycle).drive();

        // Data coupling example
        VehicleUtils.showVehicleAge(2015);
    }
}
