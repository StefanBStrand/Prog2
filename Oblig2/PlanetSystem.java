import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PlanetSystem {
    private String name;
    private String centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, String centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
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
}