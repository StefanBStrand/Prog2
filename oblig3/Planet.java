public class Planet extends NaturalSatellite {

    // Oppgave 2.3 oblig 3 - I already defined these constants below as desired here in oblig 2.
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


    // Function will take a planet and its values.
    // Need to first convert degrees to radians using math.toRadians
    // a = semimajorAxis (value given i AU)
    // the function will return distance first in AU, then I can convert this to km. Funct. has to return in km.
    // r = distance measured in AU. 1 AU = avg distance between earth and the sun.
    public double distanceToCentralBody(double degrees) {
        double degreesToRadians = Math.toRadians(degrees);
        double distanceInAU = getSemiMajorAxis() * ((1 - Math.pow(getEccentricity(), 2)) / (1 + getEccentricity()
        * Math.cos(degreesToRadians)));
        return distanceInAU * AU;
    }


    @Override
    public String toString() {
        return "Planet name: " + getName() + " | Planet radius: " + getRadius() + " | Planet mass: " + getMass() +
                "| Semi major axis: " + getSemiMajorAxis() + "| Eccentricity: " + getEccentricity() +
                "| Orbital period: " + getOrbitalPeriod();
    }
}
