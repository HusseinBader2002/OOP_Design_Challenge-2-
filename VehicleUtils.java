// Utility class showing coupling examples
public class VehicleUtils {

    // Data coupling: primitive data passed to method
    public static void showVehicleAge(int year) {
        int currentYear = 2025;
        int age = currentYear - year;
        System.out.println("Vehicle is " + age + " years old.");
    }

    // Stamp coupling: entire object passed
    public static void showVehicleDetails(Vehicle vehicle) {
        vehicle.displayInfo(); // Uses polymorphism
    }
}
