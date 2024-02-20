public class Planet extends CelestialBody {

    private double semiMajorAxis;

    private double eccentricity;

    private double orbitalPeriod;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double
                  orbitalPeriod) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
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
        return "Planet name: " + getName() + " | Planet radius: " + getRadius() + " | Planet mass: " + getMass();
    }
}
