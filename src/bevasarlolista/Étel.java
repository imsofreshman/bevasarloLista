package bevasarlolista;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public abstract class Étel extends Termék {

    public Étel(String nev, int ar, boltEgysegek boltegyseg) {
        super(nev, ar, boltegyseg);
    }

    public Étel() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
