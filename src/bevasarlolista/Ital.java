package bevasarlolista;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Ital extends Termék {

    String marka;
    float alkoholtartalom;

    public Ital(String marka, float alkoholtartalom, String nev, int ar, boltEgysegek boltegyseg) {
        super(nev, ar, boltegyseg);
        this.marka = marka;
        this.alkoholtartalom = alkoholtartalom;
    }

    public Ital(String marka, float alkoholtartalom) {
        this.marka = marka;
        this.alkoholtartalom = alkoholtartalom;
    }

    public Ital() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
