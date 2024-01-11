import java.util.ArrayList;
import java.util.Scanner;
public class Bonus3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Planet> planets = new ArrayList<>();
        boolean registering = true; // Code added for oppgave 3.2

        while (registering) {  // Code added for oppgave 3.2

            System.out.print("Enter the name of the planet:");
            String planetName = scanner.nextLine();

            System.out.print("Enter the radius of the planet:");
            double planetRadius = scanner.nextDouble();

            System.out.print("Enter the mass of the planet:");
            double planetMass = scanner.nextDouble();

            scanner.nextLine();

            Planet planet = new Planet(planetName, planetRadius, planetMass);

            planets.add(planet);

            System.out.println(planet.getNavn() + " has a radius of " + planet.getRadius() + "km and a mass of " +
                    planet.getMasse() + "kg");

            // Code added for oppgave 3.2
            System.out.print("Do you wish to continue registering planets? Answer yes or no: ");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                registering = false;
            }

        System.out.println(planets);
        }
    }
}

