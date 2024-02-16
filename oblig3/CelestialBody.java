public class CelestialBody {
    private String name;

    private double radius;

    private double mass;

    public static final double RJUP = 71492;
    public static final double MJUP = 1.898e27;

    public static final double MEARTH = 5.972e24;

    public static final double REARTH = 6371;

    public static final double MSUN = 1.98892e30;
    public static final double RSUN = 695700;

    public static final double G = 6.67408e-11;

    //Oppg. 2.1 - Arv - Potensielle problemer med noen av instansvariablene/metodene som flyttes? :
    // effectiveTemp is unique to the Star class and does not apply to Planet - this variable has to be kept
    // in Star for clarity. Also, cannot abstract unit-conversion-methods from both classes (like getRadiusInKm)
    // this is because they do not take parameters and cannot be overloaded in CelestialBody - they server
    // their purpose best in their respective class. 

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }
    public double getRadius() {
        return radius;
    }
    public double getMass() {
        return mass;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
}
