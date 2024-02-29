
import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // Oppg. 2.4b Oblig3 - Made necessary changes to main.java, adding the additional data for the planets.

        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627e-4,
                0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859,
                0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777,
                1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256e-4,
                1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049,
                4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275,
                9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,
                19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066,
                30.11, 0.010, 60225, sun);

        ArrayList<Planet> myPlanets = new ArrayList<>();

        myPlanets.add(mercury);
        myPlanets.add(venus);
        myPlanets.add(earth);
        myPlanets.add(mars);
        myPlanets.add(jupiter);
        myPlanets.add(saturn);
        myPlanets.add(uranus);
        myPlanets.add(neptune);

        // Oppg. 2.2 - Oblig2
        PlanetSystem solarSystem = new PlanetSystem("Solar system","Sun", myPlanets);
        // Oppg 2.3 - Oblig2
        System.out.println("Oppgave 2.3 (Oblig2): \n" + solarSystem);

        System.out.println(jupiter);
        System.out.println(mars);
        System.out.println(earth);

        //Oppg. 2.4: - Oblig2
        System.out.println("Oppgave 2.4 (Oblig2): ");
        System.out.println("Mass: " + saturn.getMassInKg() + " kg." + " Radius: " + saturn.getRadiusInKm() + " km");
        System.out.println("Mass: " + sun.getMassInKg() + " kg." + " Radius: " + sun.getRadiusInKm() + " km");

        // Oppg 2.5 - Oblig2
        System.out.println("Oppgave 2.5 (Oblig2):");
        System.out.println("The surface gravity on Neptune is " + neptune.surfaceGravity() + " m/s2");

        // Bonus 3.1 - Oblig2
        System.out.println("Bonus 3.1 (Oblig2): ");
        System.out.println("The smallest planet in the solar system is: " + solarSystem.getSmallestPlanet());
        System.out.println("The biggest planet in the solar system is: " + solarSystem.getLargestPlanet());

        // Bonus 3.2 - Oblig2
        System.out.println("Bonus 3.2 (Oblig2): ");
        System.out.println("The mass in MEARTH for Mars is " + mars.getMassInMEARTH());
        System.out.println("The radius in REARTH for Mars is " + mars.getRadiusInREARTH());

        System.out.println();

        // Oppg 2.2 - Oblig3
        System.out.println("Oppgave 2.2 - Oblig 3:");
        System.out.println(solarSystem.getPlanet("Saturn"));
        System.out.println(solarSystem.getPlanet("Mars"));
        System.out.println(solarSystem.getPlanet("Pluto")); // Just checking to see if function works as intended.

        System.out.println();

        // Oppg. 2.6 a og b Oblig 3
        System.out.println("Oppgave 2.6 ab Oblig 3:");
        int[] degrees = {0, 90, 180, 270, 360};

        for (int degree : degrees) {
            System.out.println("The distance between Earth and the sun at " + degree + " degrees is: " +
                    earth.distanceToCentralBody(degree));
        }

        System.out.println();

        System.out.println("Oppgave 2.7 ab Oblig 3:");
        //Oppg 2.7 a og b
        int[] degrees2 = {0, 45, 90, 135, 180};
        double[] distances = new double[degrees2.length];

        for (int i = 0; i < degrees2.length; i++) {
            int degree = degrees2[i];
            distances[i] = earth.distanceToCentralBody(degree);
            System.out.println("The distance between Earth and the sun at " + degree + " degrees is: " +
                    earth.distanceToCentralBody(degree));
        }

        System.out.println();

        for (double distance : distances) {
            System.out.println("At a distance of " + distance + " Earth has a velocity of " +
                    earth.orbitingVelocity(distance) + " km/s.");
            // Bonus 3.1
            System.out.println("At a distance of " + distance + " Earth has a velocity of " +
                    earth.orbitingVelocityInMetersPerSecond(distance) + " m/s.");
        }

        System.out.println();

        System.out.println("Bonus 3.2 Oblig3");
        // Bonus 3.2 - Jordavstand
        double minDistanceFromEarthToSun = earth.distanceToCentralBody(0);
        double maxDistanceFromEarthToSun = minDistanceFromEarthToSun;

        for (int j = 0; j <= 360; j++) {
            double currentDistance = earth.distanceToCentralBody(j);
            if (currentDistance < minDistanceFromEarthToSun) {
                minDistanceFromEarthToSun = currentDistance;
            }
            if (currentDistance > maxDistanceFromEarthToSun) {
                maxDistanceFromEarthToSun = currentDistance;
            }
        }
        System.out.println("The maximum distance between earth and the sun is " + maxDistanceFromEarthToSun + "km. " +
                "The minimum distance is " + minDistanceFromEarthToSun + "km.");

        System.out.println();

        System.out.println("Bonus task 3.2 oblig 3: ");
        System.out.println("The max distance from the sun for planet Mars is: "
                +mars.findMaxDistanceFromCentralBody() + "km.");
        System.out.println("The min distance from the sun for planet Mars is: " +
                mars.findMinDistanceFromCentralBody() + "km.");
    }

}
