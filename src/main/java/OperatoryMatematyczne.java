public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int liczba = 4;
        int liczba2 =6;
        float thiirdNumber = 4.0F;

        int additon = liczba + liczba2;
        int subtraction = liczba - liczba2;
        int multiplication = liczba*liczba2;
        float division = thiirdNumber / liczba2;
        int mod = liczba2%liczba;
        System.out.println("Wynik dodawania " + additon);
        System.out.println("Wynik odejmowania "  +subtraction);
        System.out.println("Wynik mnożenia " +multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);
    }
}
