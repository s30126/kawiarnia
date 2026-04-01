import java.util.Objects;

public class KlientKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String zwrocDaneKlienta () {
        return this.imie + " " + this.nazwisko + " " + this.idKlienta + " " + this.email;
    }

    @Override
    public String toString() {
        return "KlientKawiarni{" +
                "idKlienta=" + idKlienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KlientKawiarni klient = (KlientKawiarni) o;
        return Objects.equals(idKlienta, klient.idKlienta) || Objects.equals(email, klient.email);
    }

}
