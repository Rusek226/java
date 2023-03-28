import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę , podaj pierwszą liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą liczbę");
        int secondNumber = scanner.nextInt();


        boolean result = secondNumber > firstNumber;
        System.out.println(result);
        System.out.println(firstNumber>secondNumber);
        System.out.println(firstNumber<secondNumber);
        System.out.println(firstNumber>=secondNumber);
        System.out.println(firstNumber<=secondNumber);
        System.out.println(firstNumber==secondNumber);
        System.out.println(firstNumber!=secondNumber);
    }
}
