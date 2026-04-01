import java.util.ArrayList;
import java.util.Arrays;
public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = kolejnyNumer;
        kolejnyNumer++;
        this.oplacone = false;
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(ProduktMenu produkt) {
        this.produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0.0;
        for(int i = 0; i < this.produkty.size(); i++) {
            ProduktMenu p = this.produkty.get(i);
            suma = suma + p.getCena();
        }
        return suma;
    }


    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public static int pobierzKolejnyNumer() {
        return kolejnyNumer;
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
