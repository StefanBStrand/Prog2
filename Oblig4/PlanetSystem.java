import java.util.ArrayList;

public class PlanetSystem implements Comparable<PlanetSystem> {
    private String name;
    private String centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, String centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }
    // Oppgave 2.2 Oblig 3:
    public Planet getPlanet(String name) {
        for (Planet planet : planets) {
            if (planet.getName().equals(name)) {
                return planet;
            }
        }
        System.out.println("Sorry, no such planet was found in planet system");
        return null; // always expecting a return value, in this case Planet or null, for all possible execution paths.
    }

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
    //Bonus 3.1 Oblig2.
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

    // Oppgave 2.1 Oblig 4: 
    @Override
    public int compareTo(PlanetSystem other) {
        return Integer.compare(this.planets.size(), other.planets.size());
    }
}
