import java.util.ArrayList;

public class Main {
    // First create Planet objects (from Planet class)
    // When created some planet-objects, create new array-list to hold these planets - ADD them to list
    // Finally create a new instance of the PlanetSystem class - and pass all the stuff to it..
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 2440, 3.3e23);
        Planet venus = new Planet("Venus", 6051, 4.87e24);
        Planet earth = new Planet("Earth", 6371, 5.97e24);
        Planet mars = new Planet("Mars", 3390, 6.42e23);
        Planet jupiter = new Planet("Jupiter", 69911, 5.68e26);

        ArrayList<Planet> myPlanets = new ArrayList<>();

        myPlanets.add(mercury);
        myPlanets.add(venus);
        myPlanets.add(earth);
        myPlanets.add(mars);
        myPlanets.add(jupiter);



        PlanetSystem solarSystem = new PlanetSystem("Solar system","Sun", myPlanets);
    }
}
