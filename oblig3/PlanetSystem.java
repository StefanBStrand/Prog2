import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private String centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, String centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public Planet getPlanet(String name) {
        for (Planet planet : planets) {
            if (planet.getName().equals(name)) {
                return planet;
            }
        }
        System.out.println("Sorry, no such planet was found in planet system");
        return null; // always expecting a return value, in this case Planet or null, for all possible execution paths.
    }

    //Oppgave 2.2 - Oblig3 - (*)
    /* public Planet getPlanet(String name) {
        Planet desiredPlanet = planets.getFirst(); // getting first planet object, stored in desiredPlanet
        for (Planet planet : planets) {  //iterating through planet systems' planets here
            if (planet.getName().equals(name)) { // if the planet at hand's name equals name passed to function..
                desiredPlanet = planet; // ..then the desiredPlanet-variable is set to the current planet in the
                // iteration/in the loop.
            }
        }
        return desiredPlanet; // returning desired planet.
    } */


    public Planet getSmallestPlanet() {
        Planet smallestPLanet = planets.getFirst();
        for (Planet planet : planets) {
            if (planet.getRadiusInKm() < smallestPLanet.getRadiusInKm()) {
                smallestPLanet = planet;
            }
            else if (planet.getRadiusInKm() == smallestPLanet.getRadiusInKm()) {
                if (planet.getMassInKg() < smallestPLanet.getMassInKg()) {
                    smallestPLanet = planet;
                }
            }
        }
        return smallestPLanet;
    }
    //Bonus 3.1
    public Planet getLargestPlanet() {
        Planet largestPlanet = planets.getFirst();
        for (Planet planet : planets) {
            if (planet.getRadiusInKm() > largestPlanet.getRadiusInKm()) {
                largestPlanet = planet;
            }
            else if (planet.getRadiusInKm() == largestPlanet.getRadiusInKm()) {
                if (planet.getMassInKg() > largestPlanet.getMassInKg()) {
                    largestPlanet = planet;
                }
            }

        }
        return largestPlanet;
    }


    public String getName() {
        return name;
    }
    public String getCenterStar() {
        return centerStar;
    }
    public ArrayList<Planet> getPlanets() {
        return planets;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCenterStar(String centerStar) {
        this.centerStar = centerStar;
    }
    public void addPlanet(Planet planet) {
        planets.add(planet);
    }
    @Override
    public String toString() {
        return "Name of planet system: " + name + " | Center star: " + centerStar + " | Planets: " + planets;
    }
}
