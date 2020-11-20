package bevasarlolista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Bolt {

    private String nev;
    private String cim;
    private List<Termék> Lista = new ArrayList<Termék>(); //milyen termékeket akarunk megvenni

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<Termék> getLista() {
        return Lista;
    }

    public void setLista(List<Termék> Lista) {
        this.Lista = Lista;
    }

    public Bolt(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    public Bolt() {
    }

    void termekHozzadasa(Termék termek) {
        Lista.add(termek);
    }

    void termekTorlese(Termék termek) {
        Lista.remove(termek);
    }

    int osszegzettAr() {
        int ar = 0;
        for (Termék termek : Lista) {
            ar += termek.getAr();
        }
        return ar;
    }

    List listazzEgysegSzerint(boltEgysegek boltegysegszerint) {

        List<Termék> egysegSzerintiLista = new ArrayList<>();

        for (Termék termek : Lista) {
            if (termek.getBoltegyseg() == boltegysegszerint) {
                egysegSzerintiLista.add(termek);
            }

        }
        return egysegSzerintiLista;
    }

    String bejaras() {
        String result = "";
        return result;
    }

    @Override
    public String toString() {
        String results = "";
        for (Termék termek : Lista) {
            results += ", " + termek.toString();
        }
        return results;
    }

}
