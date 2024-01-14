import java.util.ArrayList;
import java.util.Scanner;
public class Bonus3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Planet> planets = new ArrayList<>();
        boolean registering = true; // Code added for oppgave 3.2

        while (registering) {  // Code added for oppgave 3.2

            // PRINT MENU
            // 1 to ADD, 2 to REMOVE, 3 to LIST, 4 to UPDATE
            // If checks for CHOICES and ACTIONS.

            System.out.println("Type add to ADD planet. Type remove to REMOVE planet. Type" +
                    " print to PRINT planets. Type update to UPDATE an entry. Choose what you want to do: ");
            String menuChoices = scanner.nextLine();

            switch (menuChoices) {
                case "add" -> {

                    System.out.print("Enter the name of the planet:");
                    String planetName = scanner.nextLine();

                    System.out.print("Enter the radius of the planet:");
                    double planetRadius = scanner.nextDouble();

                    System.out.print("Enter the mass of the planet:");
                    double planetMass = scanner.nextDouble();

                    scanner.nextLine(); //Used to "eat up" the empty line after scanner reads double.


                    Planet planet = new Planet(planetName, planetRadius, planetMass);

                    planets.add(planet);

                    System.out.println(planet.getNavn() + " has a radius of " + planet.getRadius() + "km and a mass of " +
                            planet.getMasse() + "kg");
                }
                case "remove" -> {
                    System.out.println("Which planet would you like to remove?: ");
                    String planetToRemove = scanner.nextLine();
                    planets.removeIf(planet -> planet.getNavn().equals(planetToRemove));
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

                }
                default -> {
                    // WHAT TO DO WITH CODE BELOW.... ?
                    // Code added for oppgave 3.2
                    System.out.print("Do you wish to continue registering planets? Answer yes or no: ");
                }
            }
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                registering = false;
            }
            //System.out.println(planets);
        }
    }
}

