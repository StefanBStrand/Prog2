
import astronomy.Planet;
import astronomy.PlanetSystem;
import astronomy.Star;
import tools.StarCSVFileHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.0, 1.0, 5777);
        Star MUCas = new Star("MU Cas", 4.192, 4.657, 14750);
        Star V6947 = new Star("V69-47", 1.316, 0.876, 5945);
        Star YZCas = new Star("YZ Cas", 2.547, 2.308, 9200);
        Star NGC188 = new Star("NGC188", 1.425, 1.102, 5900);
        Star zetPhe = new Star("zet Phe", 2.853, 3.922, 14550);

        List<Star> stars = new ArrayList<>();


        // Adding stars for oblig 4.
        stars.add(sun);
        stars.add(MUCas);
        stars.add(V6947);
        stars.add(YZCas);
        stars.add(NGC188);
        stars.add(zetPhe);

        System.out.println("Oblig 4, 2.2b:");
        System.out.println();
        StarCSVFileHandler handler = new StarCSVFileHandler();
        handler.writeObjectsToFile(stars, "test-stars.txt");
        handler.readObjectsFromFile("test-stars.txt");

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

        PlanetSystem solarSystem = new PlanetSystem("Solar system","Sun", myPlanets);

        System.out.println();
        System.out.println("Oblig 4, oppg. 2.1:");
        System.out.println();
        System.out.println("Before sorting (");
        for (Planet p : myPlanets) {
            System.out.println(p.getName() + " | Mass: " + p.getMass());
        }

        Collections.sort(myPlanets); // Sorting the planets.
        System.out.println();

        System.out.println("After sorting:");
        for (Planet p : myPlanets) {
            System.out.println(p.getName() + " | Mass: " + p.getMass());
        }
    }
}
