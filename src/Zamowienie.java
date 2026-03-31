import java.util.ArrayList;
import java.util.Arrays;
public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public void dodajProdukt(ProduktMenu produkt) {
        this.produkty.add(produkt);
    }

    /* Nie umiem :(

    public void policzWartosc(Zamowienie zamowienie) {

    }

     */

    public void policzLiczbeProduktow() {
        System.out.println("liczba produktów=" + produkty.size());
    }

    public boolean oznaczJakoOplacone(Zamowienie zamowienie) {
        return oplacone = true;
    }
    public static int pobierzKolejnyNumer() {
        return kolejnyNumer++;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numerZamowienia=" + numerZamowienia +
                ", klient=" + klient +
                ", produkty=" + produkty +
                ", oplacone=" + oplacone +
                '}';
    }

}
