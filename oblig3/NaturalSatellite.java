public class NaturalSatellite extends CelestialBody { // Oppg 2.4a - creating Class Natural satellite with
    // constructor, getters and setters.

    //Oppg 2.4b - setting NaturalSatellite to extends CelestialBody - because to make calculations
    // data on a planet and a star is needed - both planet and star are celestial bodies.

    public double semiMajorAxis;

    public double eccentricity;

    public double orbitalPeriod;

    public CelestialBody centralCelestialBody;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity,
                            double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
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

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

}


