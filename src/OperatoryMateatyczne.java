// operatory matematyczne umozliwiaja wykonanie podstawowych działań matematycznych
public class OperatoryMateatyczne {
    public static void main(String[] args) {
        int liczba = 4;
        int liczba1= 6;
        float liczba2 = 4.0F;

        int addition = liczba + liczba1; // 10
        int subtraction = liczba - liczba1; // -2
        int multiplication = liczba * liczba1; // 24
        float division = liczba2 / liczba1; // 0,66
        int modulo = liczba1%liczba; // ile razy 4 mieści się w 6 = 1, 2

        System.out.println("Wynik dodawania: " + addition); // +
        System.out.println("Odejmowanie: " + subtraction); // +
        System.out.println("Mnożenie: " + multiplication); //+
        System.out.println("Dzielenie: " + division); // +
        System.out.println("Mod: " + modulo); // +
    }
}
