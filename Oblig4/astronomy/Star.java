package astronomy;

public class Star extends CelestialBody { // setting Class astronomy.Star to extends (inheriting from astronomy.CelestialBody)

    private double effectiveTemp; // Keeping effective temp as an instance variable in star, since this is unique
    // to a star and not shared with a planet.

    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass); // calling super here - constructor from astronomy.CelestialBody.
        this.effectiveTemp = effectiveTemp;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }
    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public double getRadiusInKm() {
        return getRadius() * RSUN;
    }
    @Override
    public double getMassInKg() {
        return getMass() * MSUN;
    }

    @Override
    public String toString() {
        return "astronomy.Star name: " + getName() + "| astronomy.Star radius: " + getRadius() + "| astronomy.Star mass: " + getMass() +
                "| astronomy.Star effective temp; "
                + effectiveTemp;
    }
}
