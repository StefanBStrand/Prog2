public class Oppgave2_3 {
    public static void main(String[] args) {
        // creating new instances of Planet class.
        Planet mars = new Planet("Mars", 3389.5, 6.39e23);
        Planet tellus = new Planet("Tellus", 6371, 5.97e24);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898e27);

        System.out.println("Planeten " + mars.getNavn() + " har en radius på " + mars.getRadius() + "km"
        + " og en masse på " + mars.getMasse() + "kg");
        System.out.println("Planeten " + tellus.getNavn() + " har en radius på " + tellus.getRadius() + "km"
        + " og en masse på " + tellus.getMasse() + "kg");
        System.out.println("Planeten " + jupiter.getNavn() + " har en radius på " + jupiter.getRadius() + "km"
        + " og en masse på " + jupiter.getMasse() + "kg");
    }
}
