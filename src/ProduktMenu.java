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
        this.liczbaProduktow++;
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

    public static int LiczbaProduktow() {
        System.out.println("Liczba produktow " + liczbaProduktow);
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return String.format("Produkt: %s | Kod: %s | Cena %.2f zł | Kat: %s", nazwa, kod , cena, kategoria);

    }

    @Override
    public boolean equals(Object pr) {
        ProduktMenu toCheck = (ProduktMenu) pr;
        if (this.kod == toCheck.getKod())
            return true;
        else
            return false;

        }
    }



