public class Star extends CelestialBody {

    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

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
