import java.util.Scanner;
public class Bonus3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating a new Scanner object named scanner, configured to read
        // input from the standard input stream (usually the keyboard).

        boolean registering = true; // Code added for oppgave 3.2 (This file is bonus task 3.1 and 3.2 in one)

        while (registering) {  // Code added for oppgave 3.2

            System.out.print("Enter the name of the planet:");
            String planetName = scanner.nextLine(); // setting scanner to variable planetName.

            System.out.print("Enter the radius of the planet:");
            double planetRadius = scanner.nextDouble();

            System.out.print("Enter the mass of the planet:");
            double planetMass = scanner.nextDouble();

            scanner.nextLine(); // Using this to "eat up" the empty line that is left after scanner reads a double.

            Planet planet = new Planet(planetName, planetRadius, planetMass); // Using Planet constructor here to
            //create new planet object, so that line below can be formatted to getNavn, getRadius and mass.
            // using .(Dot) notation for this. e.g. planet.getNavn().

            System.out.println(planet.getNavn() + " has a radius of " + planet.getRadius() + "km and a mass of " +
                    planet.getMasse() + "kg");

            // Code added for oppgave 3.2
            System.out.print("Do you wish to continue registering planets? Answer yes or no: ");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                registering = false;
            }
        }
    }
}
