public class Planet {
    private String name;

    private double radius;

    private double mass;

    public static final double RJUP = 71492;
    public static final double MJUP = 1.898e27;

    private static final double G = 6.67408e-11;


    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    // Oppg 2.4 - Method for Planet.
    public double getRadiusInKm() {
        return radius * RJUP;
    }
    // Oppg 2.4 - Method for Planet
    public double getMassInKg() {
        return mass * MJUP;
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
