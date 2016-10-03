package getraenkeHandel;

/**
 * Created by mike on 02.10.16.
 */
public class Getraenk {
    private String name;        //name

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double preis;       //preis

    public double getPreis() {

        return preis;
    }

    public void setPreis(double preis) {

        this.preis = preis;
    }

    private int bestand;        //bestand

    public int getBestand() {

        return bestand;
    }

    public void setBestand(int bestand) {

        this.bestand = bestand;
    }

    private int hoechstBestand;     //hoechstBestand

    public int getHoechstBestand() {

        return hoechstBestand;
    }

    public void setHoechstBestand(int hoechstBestand) {

        this.hoechstBestand = hoechstBestand;
    }

    private int mindestBestand;     //mindestBestand

    public int getMindestBestand() {

        return mindestBestand;
    }

    public void setMindestBestand(int mindestBestand) {

        this.mindestBestand = mindestBestand;
    }
}
