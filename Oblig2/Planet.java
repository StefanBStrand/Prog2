public class Planet {
    private String name;

    private double radius;

    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public double getRadiusInKm() {
        double rjup = 71492;
        return radius * rjup;
    }

    public double getMassInKg() {
        double mjup = 1.898e27;
        return mass * mjup;
    }


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
    @Override
    public String toString() {
        return "Planet name: " + name + " | Planet radius: " + radius + " | Planet mass: " + mass;
    }
}
