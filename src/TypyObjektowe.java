public class TypyObjektowe {

    public static void main(String[] args) {
        //liczby stałoprzecinkowe
        byte firstNumber= 127; // 1 bajt 128 do 127
        short secondNumber = 32689; // 2 bajty 32786 do 32767
        int thirdNumber = 3276899; // 4 bajty
        long fourthNumber = 2148000L; // 8 bajtów 2^63

        // liczby zmiennoprzecinkowe
        float fifthNumber = 4.9934F; // 4 bajty max około 6 - 7 liczb po przecinku
        double sixthNuber = 3.99999999999999D; // max ok 15 cyfr po przecinku

        // wartość logiczna

        boolean prawda = true;
        boolean fałsz = false;

        // pojedyńczy znak

        char letter = 'A';
        String hello = "Hello Marcin";
        System.out.println(hello.charAt(0));


    }




}


