public class Star extends CelestialBody { // setting Class Star to extends (inheriting from CelestialBody)

    private double effectiveTemp; // Keeping effective temp as an instance variable in star, since this is unique
    // to a star and not shared with a planet.

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass); // calling super here - constructro from PlanetSystem.
        this.effectiveTemp = effectiveTemp;
    }

    // Keeping this method in Star since method for Planet with the same name exists. Cannot abstract this
    // since the overloading principle is not applicable because the methods cannot be differentiated - they
    // do not take any parameters (that would differentiate them). Applies to all conversion-methods.
    public double getRadiusInKm() { // values for sun set to Rsun and Msun - expecting other stars in future obligs
        // that will have radius and mass relative to "our" sun?
        return getRadius() * RSUN;
    }

    public double getMassInKg() {
        return getMass() * MSUN;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }
    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
    @Override // Clearly stating that toString method is intentionally being overridden.
    public String toString() {
        return "Star name: " + getName() + "| Star radius: " + getRadius() + "| Star mass: " + getMass() +
                "| Star effective temp; "
                + effectiveTemp;
    }

}
