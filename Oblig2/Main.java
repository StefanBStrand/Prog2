
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627e-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256e-4);
        Planet jupiter = new Planet("Jupiter", Planet.RJUP, Planet.MJUP);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        ArrayList<Planet> myPlanets = new ArrayList<>();

        myPlanets.add(mercury);
        myPlanets.add(venus);
        myPlanets.add(earth);
        myPlanets.add(mars);
        myPlanets.add(jupiter);
        myPlanets.add(saturn);
        myPlanets.add(neptune);

        // Oppg. 2.2
        Star sun = new Star("Sun", Star.RSUN, Star.MSUN, 5777);
        // Oppg. 2.2
        PlanetSystem solarSystem = new PlanetSystem("Solar system","Sun", myPlanets);
        // Oppg 2.3
        System.out.println("Oppgave 2.3: \n" + solarSystem);

        System.out.println(jupiter);
        System.out.println(mars);
        System.out.println(earth);

        //Oppg. 2.4:
        System.out.println("Oppgave 2.4: ");
        System.out.println("Mass: " + saturn.getMassInKg() + " kg." + " Radius: " + saturn.getRadiusInKm() + " km");
        System.out.println("Mass: " + sun.getMassInKg() + " kg." + " Radius: " + sun.getRadiusInKm() + " km");

        // Oppg 2.5
        System.out.println("Oppgave 2.5:");
        System.out.println("The surface gravity on Neptune is " + neptune.surfaceGravity() + " m/s2");

        // Bonus 3.1
        System.out.println("Bonus 3.1: ");
        System.out.println("The smallest planet in the solar system is: " + solarSystem.getSmallestPlanet());
        System.out.println("The biggest planet in the solar system is: " + solarSystem.getLargestPlanet());

        // Bonus 3.2
        System.out.println("Bonus 3.2: ");
        System.out.println("The mass in MEARTH for Mars is " + mars.getMassInMEARTH());
        System.out.println("The radius in REARTH for Mars is " + mars.getRadiusInREARTH());

    }
}
