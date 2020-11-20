package bevasarlolista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Bolt {

    private String nev;
    private String cim;
    private List<Termék> Lista = new ArrayList<Termék>(); //milyen termékeket akarunk megvenni a boltban

    //get-set
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

    //constructorok
    public Bolt(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    public Bolt() {
    }

    //metodusok
    void termekHozzadasa(Termék termek) {   //egy termék objektum hozzáadása
        Lista.add(termek);
    }

    void termekTorlese(Termék termek) { //egy termék törlése a listából
        Lista.remove(termek);
    }

    int osszegzettAr() {    //az egész lista árát lehet vele lekérdezni
        int ar = 0;
        for (Termék termek : Lista) {
            ar += termek.getAr();
        }
        return ar;
    }

    List listazzEgysegSzerint(boltEgysegek boltegysegszerint) { //listázza egy adott egységhez tartozó termékeket pl Húsok

        List<Termék> egysegSzerintiLista = new ArrayList<>(); //készítünk egy új listát

        for (Termék termek : Lista) {       //végig megyünk az eredeti listán
            if (termek.getBoltegyseg() == boltegysegszerint) {  //ha 
                egysegSzerintiLista.add(termek);
            }

        }
        return egysegSzerintiLista;
    }

    String bejaras() {  //a felirt termékeket az egységek szerint rendezetten csoportositva adja vissza
        String result = "";

        System.out.println(boltEgysegek.ElektronikaiCikk);

        return result;
    }

    List<Termék> altalanosKereses(String mit) { //minden stringet végignéz a termékben, és visszadja a termékeket amelyikekben voltak a stringek

        List keresettTermekek = new ArrayList();

        for (Termék termek : Lista) {
            if (termek.getNev() == mit || termek.getBoltegyseg().toString() == mit) {
                keresettTermekek.add(termek);
            }

        }
        return keresettTermekek;
    }

    @Override
    public String toString() { //kiirja a boltban tárolt összes vásárolni kivánt terméket
        String results = "\n";
        for (Termék termek : Lista) {
            results += termek.toString() + "\n";
        }
        return results;
    }

}
