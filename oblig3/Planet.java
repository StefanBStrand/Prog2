public class Planet extends NaturalSatellite {

    public static final double RJUP = 71492;
    public static final double MJUP = 1.898e27;

    public static final double MEARTH = 5.972e24;

    public static final double REARTH = 6371;

    public static final double G = 6.67408e-11;

    public static final double AU = 149597871;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double
                  orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);

    }
    @Override
    public double getRadiusInKm() { // Clearly stating override of the abstract class' abstract methods.
        return getRadius() * RJUP;
    }
    @Override
    public double getMassInKg() { // Clearly stating override of the abstract class' abstract methods.
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


    // Oblig 3 oppg. 2.6
    public double distanceToCentralBody(double degrees) {
        double degreesToRadians = Math.toRadians(degrees);
        double distanceInAU = getSemiMajorAxis() * ((1 - Math.pow(getEccentricity(), 2)) / (1 + getEccentricity()
        * Math.cos(degreesToRadians)));
        return distanceInAU * AU;
    }

    // Oblig3  oppg 2.7
    public double orbitingVelocity(double distance) {
        double v = Math.sqrt((G * CelestialBody.MSUN) / (distance * 1000));
        return v / 1000;
    }

    // Bonus 3.1 - Hastighet 2.0
    public double orbitingVelocityInMetersPerSecond(double distance) {
        return orbitingVelocity(distance) * 1000;
    }

    // Bonus 3.2 - Jordavstand
    // Use array/for loop to enter each degree (0-360 degrees) - return min and max values and for what degree.



    @Override
    public String toString() {
        return "Planet name: " + getName() + " | Planet radius: " + getRadius() + " | Planet mass: " + getMass() +
                "| Semi major axis: " + getSemiMajorAxis() + "| Eccentricity: " + getEccentricity() +
                "| Orbital period: " + getOrbitalPeriod();
    }
}
