  
/**
 * Represents a generic vehicle with common attributes and behaviors.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public abstract class Vehicle {
    private final String model;
    private final String make;
    private final int year;
    private final String type;
    private final String color;

    /**
     * Constructs a Vehicle with the specified attributes.
     *
     * @param model the model of the vehicle
     * @param make  the make of the vehicle
     * @param year  the year the vehicle was manufactured
     * @param type  the type of vehicle (e.g., Sedan, Pickup)
     * @param color the color of the vehicle
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Vehicle(String model, String make, int year, String type, String color) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty or null");
        }
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be empty or null");
        }
        if (year <= 1886 || year > 2025) {
            throw new IllegalArgumentException("Invalid vehicle year: " + year);
        }
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be empty or null");
        }
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color cannot be empty or null");
        }
        this.model = model;
        this.make = make;
        this.year = year;
        this.type = type;
        this.color = color;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    /**
     * Simulates opening the vehicle's doors.
     *
     * @return a message indicating the doors are opening
     */
    public String openDoors() {
        return "Opening doors for " + type + ".";
    }

    /**
     * Indicates whether the vehicle has tinted windows.
     *
     * @return true if the vehicle has no tint, false otherwise
     */
    public abstract boolean isTinted();

    /**
     * Indicates whether the vehicle has two doors.
     *
     * @return true if the vehicle has two doors, false otherwise
     */
    public abstract boolean hasTwoDoors();

    /**
     * Simulates driving the vehicle.
     */
    public abstract void drive();
}