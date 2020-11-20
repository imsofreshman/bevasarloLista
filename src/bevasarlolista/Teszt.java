package bevasarlolista;
/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Teszt {

    public static void main(String[] args) {

        //Italok
        Ital cola = new Ital("Coca-Cola", 0, "Cola", 350, boltEgysegek.Ital);
        Ital tej = new Ital("Mizo", 0, "Tej", 240, boltEgysegek.Tejtermék);
        Ital whiskey = new Ital("Jim-beam", 45, "Whiskey", 8500, boltEgysegek.Ital);

        //Édes ételek
        ÉdesÉtel sutemeny = new ÉdesÉtel("Hatlapos", 150, boltEgysegek.Pékárú);
        ÉdesÉtel fank = new ÉdesÉtel("Fánk", 220, boltEgysegek.Pékárú);
        ÉdesÉtel muzli = new ÉdesÉtel("Műzli", 580, boltEgysegek.Pékárú);
        ÉdesÉtel barack = new ÉdesÉtel("Barack", 48, boltEgysegek.Gyümölcs);
        ÉdesÉtel kompot = new ÉdesÉtel("kompot", 300, boltEgysegek.Gyümölcs);

        //Sós ételek
        SósÉtel perec = new SósÉtel("Perec", 15, boltEgysegek.Pékárú);
        SósÉtel szalami = new SósÉtel("Szalámi", 1500, boltEgysegek.Hús);
        SósÉtel porkolt = new SósÉtel("Pörkölt", 940, boltEgysegek.Hús);
        SósÉtel pizza = new SósÉtel("Pizza", 2100, boltEgysegek.Pékárú);
        SósÉtel kenyer = new SósÉtel("Kenyér", 189, boltEgysegek.Pékárú);
        SósÉtel krumpli = new SósÉtel("Krumpli", 4, boltEgysegek.Zöldség);
        SósÉtel hagyma = new SósÉtel("Hagyma", 37, boltEgysegek.Zöldség);
                
        //Elektornikai cikkek
        TartósCikk playStation = new TartósCikk("Sony", 4, "Playstation", 300000, boltEgysegek.ElektronikaiCikk);
        TartósCikk processzor = new TartósCikk("Intel", 5, "i5", 68000, boltEgysegek.ElektronikaiCikk);
        TartósCikk videoKartya = new TartósCikk("Nvidia", 2, "Gtx-1080", 270000, boltEgysegek.ElektronikaiCikk);
        TartósCikk hangfal = new TartósCikk("Klipsch", 1, "Soundblaster", 140000, boltEgysegek.ElektronikaiCikk);
        TartósCikk laptop = new TartósCikk("Dell", 3, "E2545", 470000, boltEgysegek.ElektronikaiCikk);

        
        //Boltok
        Bolt tesco = new Bolt("Tesco", "Királyszék ut 33");
        Bolt auchan = new Bolt("Auchan", "Vasvári Pál u. 1/a");
        Bolt mediaMarkt = new Bolt("Média Markt", "Budai út 1");
        Bolt abc = new Bolt("ABC", "Új utca 1");

        
        //Termékek feltöltése
        tesco.termekHozzadasa(sutemeny);
        tesco.termekHozzadasa(muzli);
        tesco.termekHozzadasa(perec);
        tesco.termekHozzadasa(szalami);
        tesco.termekHozzadasa(playStation);
        tesco.termekHozzadasa(krumpli);
        tesco.termekHozzadasa(hagyma);

        auchan.termekHozzadasa(tej);
        auchan.termekHozzadasa(pizza);
        auchan.termekHozzadasa(hangfal);
        auchan.termekHozzadasa(kompot);

        mediaMarkt.termekHozzadasa(processzor);
        mediaMarkt.termekHozzadasa(videoKartya);
        mediaMarkt.termekHozzadasa(laptop);

        abc.termekHozzadasa(cola);
        abc.termekHozzadasa(whiskey);
        abc.termekHozzadasa(fank);
        abc.termekHozzadasa(barack);
        abc.termekHozzadasa(porkolt);
        abc.termekHozzadasa(kenyer);
            
        
        
        System.out.println(tesco.altalanosKereses("Műzli"));
   
        int ar = tesco.osszegzettAr();
        
        System.out.println("Az összes vásárolni kívánt termék a " + tesco.getNev() + "-ban" + tesco.toString());
        System.out.println("Az összes pékárú:\n" + tesco.listazzEgysegSzerint(boltEgysegek.Pékárú));
        
        System.out.println("Az osszes termek ára " + ar + "Ft");
        
      //  System.out.println(tesco.altalanosKereses("Krumpli"));
        
    }
}
