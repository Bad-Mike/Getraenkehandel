package getraenkeHandel;

/**
 * Created by mike on 02.10.16.
 */
public class Getraenkeverwaltung {

    public static void main(String[] args) {

        // create Object
        Getraenk getraenk1 = new Getraenk();
        

        // set attribute via Set-Method
        getraenk1.setName("Apfelsaft");
        getraenk1.setPreis(1.99);
        getraenk1.setBestand(78);
        getraenk1.setHoechstBestand(100);
        getraenk1.setMindestBestand(50);

        // out of attributes
        System.out.println("Name: " + getraenk1.getName());
        System.out.println("Preis: " + getraenk1.getPreis());
        System.out.println("Bestand: " + getraenk1.getBestand());
        System.out.println("Hoechstbestand: " + getraenk1.getHoechstBestand());
        System.out.println("Mindestbestand: " + getraenk1.getMindestBestand());

    }

}
