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

    public int getGaranciaIdo() {
        return garanciaIdo;
    }

    public void setGaranciaIdo(int garanciaIdo) {
        this.garanciaIdo = garanciaIdo;
    }
    
    

    public TartósCikk(String gyarto, int garanciaIdo, String nev, int ar, boltEgysegek boltegyseg) {
        super(nev, ar, boltegyseg);
        this.gyarto = gyarto;
        this.garanciaIdo = garanciaIdo;
    }

    public TartósCikk() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    

}
