 

/**
 * A concrete class representing a sedan, extending Car.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public class Sedan extends Car {

    /**
     * Constructs a Sedan with the specified attributes.
     *
     * @param model     the model of the sedan
     * @param make      the make of the sedan
     * @param year      the year the sedan was manufactured
     * @param color     the color of the sedan
     * @param isTwoDoor true if the sedan has two doors, false if it has four
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Sedan(String model, String make, int year, String color, boolean isTwoDoor) {
        super(isTwoDoor, model, make, year, "Sedan", color);
    }

    /**
     * Indicates whether the sedan has tinted windows.
     *
     * @return false, assuming sedans have tinted windows by default
     */
    @Override
    public boolean isTinted() {
        return false; // Example: Sedans have tint by default
    }

    /**
     * Simulates driving the sedan.
     */
    @Override
    public void drive() {
        System.out.println("Sedan is driving smoothly.");
    }
}