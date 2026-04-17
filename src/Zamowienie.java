import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkt;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(KlientKawiarni klient) {
        this.klient = klient;
        this.produkt = new ArrayList<ProduktMenu>();
    }


    public void dodajProdukt(ProduktMenu pro) {
        this.produkt.add(pro);
    }

    public double policzWartosc() {
        double wartosc = 0.0;
        for (int i = 0; i < produkt.size(); i++) {
            wartosc += produkt.get(i).getCena();
        }
        return wartosc;
    }

    public int policzLiczbeProduktow() {
        return produkt.size();
    }

    public void oznaczJakoOplacone() {
       oplacone = true;
    }

    public static int pobierzKolejnyNumer() {
        kolejnyNumer+=1;
        return kolejnyNumer;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < produkt.size(); i++) {
            s += produkt.get(i).toString() + "\n";

        }
        return s;
    }



}
