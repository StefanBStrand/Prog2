public abstract class CelestialBody { // Oppg 2.5a - setting class to abstract explicitly, as it is not intended
    //to be instantiated.
    private String name;

    private double radius;

    private double mass;

    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public abstract double getRadiusInKm(); //Oppg. 2.5b - defining abstract methods as required.
    public abstract double getMassInKg(); //Oppg. 2.5b - defining abstract methods as required.

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
}
