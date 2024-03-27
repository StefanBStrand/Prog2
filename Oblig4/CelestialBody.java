public abstract class CelestialBody implements Comparable<CelestialBody> {

    private String name;

    private double radius;

    private double mass;


    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public abstract double getRadiusInKm();
    public abstract double getMassInKg();

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

    @Override // Overriding abstract method from Comparable interface
    public int compareTo(CelestialBody other) {
        return Double.compare(this.mass, other.mass);
    }
}
