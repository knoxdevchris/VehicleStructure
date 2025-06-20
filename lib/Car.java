 

/**
 * An abstract class representing a car, extending Vehicle.
 * Defines car-specific properties like two-door status.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public abstract class Car extends Vehicle {
    private final boolean isTwoDoor;

    /**
     * Constructs a Car with the specified attributes.
     *
     * @param isTwoDoor true if the car has two doors, false if it has four
     * @param model     the model of the car
     * @param make      the make of the car
     * @param year      the year the car was manufactured
     * @param type      the type of car (e.g., Sedan, Coupe)
     * @param color     the color of the car
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Car(boolean isTwoDoor, String model, String make, int year, String type, String color) {
        super(model, make, year, type, color);
        this.isTwoDoor = isTwoDoor;
    }

    /**
     * Checks if the car has two doors.
     *
     * @return true if the car has two doors, false otherwise
     */
    @Override
    public boolean hasTwoDoors() {
        return isTwoDoor;
    }

    /**
     * Gets the two-door status of the car.
     *
     * @return true if the car has two doors, false otherwise
     */
    public boolean isTwoDoor() {
        return isTwoDoor;
    }
}