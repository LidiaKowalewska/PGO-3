public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(String imie, String nazwisko, String email, int idKlienta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.idKlienta = idKlienta;

    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public String DaneKlienta() {
        return imie + " " + nazwisko + " " + email + " " + idKlienta;
    }

    @Override
    public String toString() {
        return String.format("imie: %s | nazwisko: %s | email: %s | idKlienta: %s", imie, nazwisko, email, idKlienta);

    }
    @Override
    public boolean equals(Object kk) {
        KlientKawiarni toCheck = (KlientKawiarni) kk;
        if (this.idKlienta == toCheck.getIdKlienta()
        && this.email == toCheck.getEmail())
            return true;
        else
            return false;

    }
}
