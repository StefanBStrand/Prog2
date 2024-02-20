public class Star extends CelestialBody { // setting Class Star to extends (inheriting from CelestialBody)

    private double effectiveTemp; // Keeping effective temp as an instance variable in star, since this is unique
    // to a star and not shared with a planet.

    // Oppgave 2.3 oblig 3 - I already defined these constants below as desired here in oblig 2.
    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass); // calling super here - constructor from PlanetSystem.
        this.effectiveTemp = effectiveTemp;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }
    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    // Keeping methods getRadiusInkm and getMassInKg in Star since method for Planet with the same name exists.
    // Cannot abstract this since the overloading principle is not applicable because the methods cannot be
    //  differentiated - they do not take any parameters (that would differentiate them). Applies to all
    //  conversion-methods.
    
    // Oppg. 2.3 Olbig3 below - 2 methods using RSUN and MSUN.
    public double getRadiusInKm() { // values for sun set to Rsun and Msun - expecting other stars in future obligs
        // that will have radius and mass relative to "our" sun?
        return getRadius() * RSUN;
    }

    public double getMassInKg() {
        return getMass() * MSUN;
    }


    @Override // Clearly stating that toString method is intentionally being overridden.
    public String toString() {
        return "Star name: " + getName() + "| Star radius: " + getRadius() + "| Star mass: " + getMass() +
                "| Star effective temp; "
                + effectiveTemp;
    }

}
