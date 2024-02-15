public class Star extends CelestialBody {
    private String name;

    private double radius;

    private double mass;

    private double effectiveTemp;

    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getRadiusInKm() { // values for sun set to Rsun and Msun - expecting other stars in future obligs
        // that will have radius and mass relative to "our" sun?
        return radius * RSUN;
    }

    public double getMassInKg() {
        return mass * MSUN;
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
    @Override // Clearly stating that toString method is intentionally being overridden.
    public String toString() {
        return "Star name: " + name + "| Star radius: " + radius + "| Star mass: " + mass + "| Star effective temp; "
                + effectiveTemp;
    }

}
