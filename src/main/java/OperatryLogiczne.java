public class OperatryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourthValue = true;


    //&& - opertor i - true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue&&secondValue);//false
        System.out.println(firstValue&&fourthValue);//true
        System.out.println(secondValue && thirdValue);// flase

    // || -> true wtedy gdy jedno wyrażnie skłasdowe jest róne true

        System.out.println(firstValue || secondValue);// true
        System.out.println(secondValue || thirdValue); // false

    // ! -> zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje.


        System.out.println(!firstValue);// false
        System.out.println(!thirdValue);//true



    }
}
