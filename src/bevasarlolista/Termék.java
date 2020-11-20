package bevasarlolista;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
enum boltEgysegek {
    Ital,
    Hús,
    Tejtermék,
    Zöldség,
    Pékárú,
    ElektronikaiCikk,
    Gyümölcs

}

public class Termék {

    private String nev;
    private int ar;
    private boltEgysegek boltegyseg; //a bolt mely területén található a termék

    public Termék(String nev, int ar, boltEgysegek boltegyseg) {
        this.nev = nev;
        this.ar = ar;
        this.boltegyseg = boltegyseg;
    }

    public boltEgysegek getBoltegyseg() {
        return boltegyseg;
    }

    public void setBoltegyseg(boltEgysegek boltegyseg) {
        this.boltegyseg = boltegyseg;
    }

    public Termék() {
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "A termék neve: " + getNev() + " ára: " + getAr() + "FT " + boltegyseg + "-részen van";
    }

}
