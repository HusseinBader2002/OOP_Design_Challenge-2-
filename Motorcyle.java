// Motorcycle.java - Inherits from Vehicle and implements Drivable
public class Motorcycle extends Vehicle implements Drivable {
    public Motorcycle(String make) {
        super(make);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Motorcycle made by " + getMake());
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is riding on two wheels.");
    }
}
