package bevasarlolista;
/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class TartósCikk extends Termék {

    private String gyarto;
    private int garanciaIdo;

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public TartósCikk(String gyarto, int garanciaIdo, String nev, int ar, boltEgysegek boltegyseg) {
        super(nev, ar, boltegyseg);
        this.gyarto = gyarto;
        this.garanciaIdo = garanciaIdo;
    }

    public TartósCikk(String gyarto, int garanciaIdo) {
        this.gyarto = gyarto;
        this.garanciaIdo = garanciaIdo;
    }

    public TartósCikk() {
    }

    

}
