// Car.java - Inherits from Vehicle and implements Drivable
public class Car extends Vehicle implements Drivable {
    public Car(String make) {
        super(make);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Car made by " + getMake());
    }

    @Override
    public void drive() {
        System.out.println("Car is driving on four wheels.");
    }
}
