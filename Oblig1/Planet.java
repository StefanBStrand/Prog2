public class Planet { // Declaring a class called Planet.
    private String navn; // instance variables here. Set to private to encapsulate (as per OOP principles).
    private double radius;
    private double masse;

    public Planet(String navn, double radius, double masse) { // this is a constructor, to make a new object.
        this.navn = navn; // "this" to refer to the instance variable when we have constructor/method variables with
        //the same name.
        this.radius = radius;
        this.masse = masse;
    }

    public String getNavn() { //getter for the navn variable.
        return navn;
    }

    public double getRadius() { //getter for the radius variable.
        return radius;
    }

    public double getMasse() {
        return masse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }
}