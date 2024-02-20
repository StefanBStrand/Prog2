public class Planet extends CelestialBody {

    private double semiMajorAxis;

    private double eccentricity;

    private double orbitalPeriod;

    // Oppgave 2.3 oblig 3 - I already defined these constants below as desired here in oblig 2.
    public static final double RJUP = 71492;
    public static final double MJUP = 1.898e27;

    public static final double MEARTH = 5.972e24;

    public static final double REARTH = 6371;

    public static final double G = 6.67408e-11;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double
                  orbitalPeriod) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRadiusInKm() {
        return getRadius() * RJUP;
    }

    public double getMassInKg() {
        return getMass() * MJUP;
    }

    public double getMassInMEARTH() {
        return getMassInKg() / MEARTH;

    }

    public double getRadiusInREARTH() {
        return getRadiusInKm() / REARTH;

    }

    public double surfaceGravity() {
        double radiusInMeters = getRadiusInKm() * 1000;
        double radiusSquared = Math.pow(radiusInMeters, 2);
        return G * getMassInKg() / radiusSquared;
    }


    @Override
    public String toString() {
        return "Planet name: " + getName() + " | Planet radius: " + getRadius() + " | Planet mass: " + getMass() +
                "| Semi major axis: " + getSemiMajorAxis() + "| Eccentricity: " + getEccentricity() +
                "| Orbital period: " + getOrbitalPeriod();
    }
}
