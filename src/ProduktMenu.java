import java.util.Objects;
public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {

        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;

    }

    public String getKod() {
        return kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public String toString() {
        return this.nazwa + "\n" + this.kategoria + "\n" + this.cena + "\n" + this.kod + "\n";
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProduktMenu produkt = (ProduktMenu) o;
        return Objects.equals(kod, produkt.kod);
    }

}
