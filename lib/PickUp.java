 

/**
 * A concrete class representing a pickup truck, extending Truck.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public class PickUp extends Truck {
    private final boolean isTwoDoor; // Added to support hasTwoDoors()

    /**
     * Constructs a PickUp with the specified attributes.
     *
     * @param model       the model of the pickup truck
     * @param make        the make of the pickup truck
     * @param year        the year the pickup truck was manufactured
     * @param color       the color of the pickup truck
     * @param hasTruckBed true if the pickup truck has a truck bed, false otherwise
     * @param isTwoDoor   true if the pickup truck has two doors, false otherwise
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public PickUp(String model, String make, int year, String color, boolean hasTruckBed, boolean isTwoDoor) {
        super(hasTruckBed, model, make, year, "PickUp", color);
        this.isTwoDoor = isTwoDoor;
    }

    /**
     * Indicates whether the pickup truck has tinted windows.
     *
     * @return false, assuming pickup trucks have tinted windows by default
     */
    @Override
    public boolean isTinted() {
        return false; // Example: Pickup trucks have tint by default
    }

    /**
     * Indicates whether the pickup truck has two doors.
     *
     * @return true if the pickup truck has two doors, false otherwise
     */
    @Override
    public boolean hasTwoDoors() {
        return isTwoDoor;
    }

    /**
     * Simulates driving the pickup truck.
     */
    @Override
    public void drive() {
        System.out.println("PickUp is driving smoothly.");
    }
}