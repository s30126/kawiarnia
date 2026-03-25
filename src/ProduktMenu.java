public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

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

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {

        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;

    }

}
