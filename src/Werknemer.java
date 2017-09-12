public class Werknemer extends Persoon {

    private String functie;
    private double salaris;
    private final static double MIN_SALARIS = 1000;

    private static double aantalWerknemers = 0;

    public Werknemer(String naam, String voornaam, Adres adres) {
        this(naam, voornaam, adres,"Algemeen bediende",1800);
    }

    public double getAantalWerknemers() {
        return aantalWerknemers;
    }

    public Werknemer(String naam, String voornaam, Adres adres, String functie, double salaris) {
        super(naam, voornaam, adres);
        this.functie = functie;
        setSalaris(salaris);
        aantalWerknemers++;

    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = (salaris >= MIN_SALARIS) ? salaris : MIN_SALARIS;

    }

    public static double getMinSalaris() {
        return MIN_SALARIS;
    }

    @Override
    public String toString() {
        return  super.toString() + '\n' + "Werknemer{" +
                "functie='" + functie + '\'' +
                ", salaris=" + salaris +
                '}';
    }
}
