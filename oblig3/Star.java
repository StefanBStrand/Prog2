public class Star extends CelestialBody { // setting Class Star to extends (inheriting from CelestialBody)

    private double effectiveTemp; // Keeping effective temp as an instance variable in star, since this is unique
    // to a star and not shared with a planet.

    // Oppgave 2.3 oblig 3 - I already defined these constants below as desired here in oblig 2.
    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass); // calling super here - constructor from CelestialBody.
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
    

    @Override
    public double getRadiusInKm() { // Oppg 2.5b
        return getRadius() * RSUN;
    }
    @Override
    public double getMassInKg() {  // Oppg 2.5b
        return getMass() * MSUN;
    }


    @Override // Clearly stating that toString method is intentionally being overridden.
    public String toString() {
        return "Star name: " + getName() + "| Star radius: " + getRadius() + "| Star mass: " + getMass() +
                "| Star effective temp; "
                + effectiveTemp;
    }

}
