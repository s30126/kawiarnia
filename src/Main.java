public class Main {
    public static void main(String[] args) {

        KlientKawiarni klient1 = new KlientKawiarni(01, "Anna", "Nowak", "anna@gmail.com");

        ProduktMenu kawa = new ProduktMenu("11", "kawa", 10.50, "napoje");
        ProduktMenu herbata = new ProduktMenu("12", "herbata", 8, "napoje");
        ProduktMenu ciastko = new ProduktMenu("13", "ciastko", 9.50, "jedzenie");

        /* Test działania klasy ProduktMenu

        System.out.println(ProduktMenu.getLiczbaProduktow());
        System.out.println(produkt1.toString());

         */

        /* Test działania klasy KlientKawiarni

        System.out.println(klient1.zwrocDaneKlienta(klient1));
        System.out.println(klient1.toString());
        System.out.println(klient1.equals(klient1));

         */

    }
}
