import java.util.ArrayList;

public class Main {
    // First create Planet objects (from Planet class)
    // When created some planet-objects, create new array-list to hold these planets - ADD them to list
    // Finally create a new instance of the PlanetSystem class - and pass all the stuff to it..
    public static void main(String[] args) {


        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627e-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256e-4);
        Planet jupiter = new Planet("Jupiter", 71492, 1.898e27);

        ArrayList<Planet> myPlanets = new ArrayList<>();

        myPlanets.add(mercury);
        myPlanets.add(venus);
        myPlanets.add(earth);
        myPlanets.add(mars);
        myPlanets.add(jupiter);

        PlanetSystem solarSystem = new PlanetSystem("Solar system","Sun", myPlanets);

        System.out.println(solarSystem);

        System.out.println(jupiter);
        System.out.println(mars);
        System.out.println(earth);

        System.out.println(mars.getMassInKg());
        System.out.println(mars.getRadiusInKm());
    }
}
