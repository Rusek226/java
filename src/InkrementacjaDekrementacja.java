// Inkrementacja - zwiększenie wartości o jeden
public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int a = 0;

        System.out.println("Wartość a: " + a);//0
        int b = a++;
        System.out.println("Wartość b: " + b);//0
        System.out.println("Wartość a: " + a);//1
        int c = ++a;
        System.out.println("Wartość c: " + c);//2
        System.out.println("Wartość a: " + a);//2

        // Dekrementacja zmniejszenie wartości o jeden

        int d =0;
        System.out.println("Wartość d: " +d);//0
        int e = d--;
        System.out.println("Wartość e: " +e );//0
        System.out.println("Wartośc d: " +d);//-1

        int f = --d;
        System.out.println("Wartośc f: " +d);//-2
        System.out.println("Wartosć d: " +f);//-2
    }
}




