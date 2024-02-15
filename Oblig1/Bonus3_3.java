import java.util.ArrayList;
import java.util.Scanner;
public class Bonus3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Planet> planets = new ArrayList<>(); // creating new ArrayList. Declaring what it "takes" as input.
        // named planets.
        boolean registering = true;

        while (registering) {

            System.out.println("Type add to ADD planet. Type remove to REMOVE planet. Type" +
                    " print to PRINT planets. Type update to UPDATE an entry. Choose what you want to do: ");
            String menuChoices = scanner.nextLine();

            //using a switch instead of multiple else if -statements.

            switch (menuChoices) {
                case "add" -> {

                    System.out.print("Enter the name of the planet:");
                    String planetName = scanner.nextLine();

                    System.out.print("Enter the radius of the planet:");
                    double planetRadius = scanner.nextDouble();

                    System.out.print("Enter the mass of the planet:");
                    double planetMass = scanner.nextDouble();

                    scanner.nextLine(); //Used to "eat up" the empty line after scanner reads double.

                    Planet planet = new Planet(planetName, planetRadius, planetMass); // creating new Planet object
                    // named planet.

                    planets.add(planet); // adding planet to object to ArrayList (planets).

                    System.out.println(planet.getNavn() + " has a radius of " + planet.getRadius() + "km and a mass of " +
                            planet.getMasse() + "kg");
                }

                case "remove" -> {
                    System.out.println("Which planet would you like to remove?: ");
                    String planetToRemove = scanner.nextLine();
                    planets.removeIf(planet -> planet.getNavn().equals(planetToRemove));
                    System.out.println("You have removed the planet " + planetToRemove);
                }
                case "print" -> {
                    for (Planet planet : planets) {
                        System.out.println("Name: " + planet.getNavn() + ". | Radius: " + planet.getRadius() + "km. "
                                + "| Mass: " + planet.getMasse() + "kg");
                    }
                }
                case "update" -> {
                    System.out.println("Which planet would you like to update?");
                    String planetToUpdate = scanner.nextLine();

                    for (Planet planet : planets) {
                        if (planetToUpdate.equals(planet.getNavn())) {
                            System.out.println("Enter new name of planet:");
                            String newName = scanner.nextLine();
                            planet.setNavn(newName);

                            System.out.println("Enter new radius of planet:");
                            double newRadius = scanner.nextDouble();
                            planet.setRadius(newRadius);

                            scanner.nextLine(); //added to eat empty space after reading Double

                            System.out.println("Enter new mass of planet:");
                            double newMass = scanner.nextDouble();
                            planet.setMasse(newMass);
                            scanner.nextLine(); //eat empty space
                            System.out.println("Here is your updated planet: Name: " + newName +  " | Radius: "
                                    + newRadius + " | Mass: " + newMass);
                        }
                    }
                }
            }

            System.out.print("Do you wish to continue the program? Answer yes or no: ");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                registering = false;
            }
        }
    }
}

