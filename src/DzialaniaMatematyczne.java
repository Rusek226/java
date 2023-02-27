public class DzialaniaMatematyczne {
    public static void main(String[] args) {
        int liczba = 10;
        int liczba1 = 20;
        float liczba2 = 10.0F;


        int addition = liczba + liczba1;
        int substraction = liczba - liczba1;
        int multiplication = liczba * liczba1;
        float division = liczba2 / liczba1;
        int modulo = liczba % liczba1;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Odejmowanie: " + substraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mod: " + modulo);
    }
}
