public class InstrukcjaSterujacaSwitch {
    public static void main(String[] args) {
        String danie = "chleb";

        switch (danie) {
            case "Pizza" :
                System.out.println("Cena to 22 zł");
                break;
            case "Łosoś":
                System.out.println("Cena to 35 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Brak dania w karcie restauracji");
        }

    }
}
