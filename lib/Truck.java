 

/**
 * An abstract class representing a truck, extending Vehicle.
 * Defines truck-specific properties like truck bed presence.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public abstract class Truck extends Vehicle {
    public boolean hasTruckBed;

    /**
     * Constructs a Truck with the specified attributes.
     *
     * @param hasTruckBed true if the truck has a truck bed, false otherwise
     * @param model       the model of the truck
     * @param make        the make of the truck
     * @param year        the year the truck was manufactured
     * @param type        the type of truck (e.g., Pickup, Flatbed)
     * @param color       the color of the truck
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Truck(boolean hasTruckBed, String model, String make, int year, String type, String color) {
        super(model, make, year, type, color);
        this.hasTruckBed = hasTruckBed;
    }

    /**
     * Checks if the truck has a truck bed.
     *
     * @return true if the truck has a truck bed, false otherwise
     */
    public boolean hasTruckBed() {
        return hasTruckBed;
    }
}