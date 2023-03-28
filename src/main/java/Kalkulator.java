import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę , podaj pierwszą liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int additon = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber%secondNumber;
        System.out.println("Wynik dodawania " + additon);
        System.out.println("Wynik odejmowania "  +subtraction);
        System.out.println("Wynik mnożenia " +multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);





    }
}
