public class Star {
    private String name;

    private double radius;

    private double mass;

    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
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
    public double getEffectiveTemp() {
        return effectiveTemp;
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
    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
    @Override
    public String toString() {
        return "Star name: " + name + "| Star radius: " + radius + "| Star mass: " + mass + "| Star effective temp; "
                + effectiveTemp;
    }

}
