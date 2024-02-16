public class Planet extends CelestialBody {


    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
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

    @Override // oppg. 2.3
    public String toString() {
        return "Planet name: " + getName() + " | Planet radius: " + getName() + " | Planet mass: " + getMass();
    }
}
