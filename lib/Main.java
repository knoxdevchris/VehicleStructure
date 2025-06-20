
 

/**
 * A test class to demonstrate the Vehicle hierarchy.
 *
 * @author Your Name
 * @version 1.0, June 2025
 */
public class Main {
    public static void main(String[] args) {
        try {
            Sedan sedan = new Sedan("Civic", "Honda", 2023, "Blue", false);
            System.out.println("Model: " + sedan.getModel());
            System.out.println("Type: " + sedan.getType());
            System.out.println("Is Two-Door: " + sedan.hasTwoDoors());
            System.out.println("Tinted: " + sedan.isTinted());
            System.out.println(sedan.openDoors());
            sedan.drive();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}