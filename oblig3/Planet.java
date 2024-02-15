public class Planet extends CelestialBody {
    private String name;

    private double radius;

    private double mass;

    public static final double RJUP = 71492; // This is a constant - set as final.
    public static final double MJUP = 1.898e27;

    private static final double MEARTH = 5.972e24;

    private static final double REARTH = 6371;

    private static final double G = 6.67408e-11;


    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }
    // Oppg 2.4 - Method for Planet.
    public double getRadiusInKm() {
        return radius * RJUP;
    }
    // Oppg 2.4 - Method for Planet
    public double getMassInKg() {
        return mass * MJUP;
    }
    // Bonus 3.2
    public double getMassInMEARTH() {
        double planetInMEARTH = getMassInKg() / MEARTH;
        return planetInMEARTH;
    }
    // Bonus 3.2
    public double getRadiusInREARTH() {
        double planetInREARTH = getRadiusInKm() / REARTH;
        return planetInREARTH;
    }

    public double surfaceGravity() {
        double radiusInMeters = getRadiusInKm() * 1000;
        double radiusSquared = Math.pow(radiusInMeters, 2);
        double g = G * getMassInKg() / radiusSquared;
        return g;

    }

    // Oppg. 2.1 - Classes, getters and setters.
    public String getName() {
        return name;
    }
    public double getRadius() {
        return radius;
    }
    public double getMass() {
        return mass;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    @Override // oppg. 2.3
    public String toString() {
        return "Planet name: " + name + " | Planet radius: " + radius + " | Planet mass: " + mass;
    }
}
