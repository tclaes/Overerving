import java.text.DecimalFormat;

public class Manager extends Werknemer {

    private double bonus;

    private static int aantalManagers = 0;

    public int getAantalManagers() {
        return aantalManagers;
    }

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris, double bonus) {
        super(naam, voornaam, adres, functie, salaris);
        this.bonus = bonus;
        aantalManagers++;

    }

    public Manager(String naam, String voornaam, Adres adres, String functie, double salaris) {
        this(naam, voornaam, adres, functie, salaris,50);
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalaris(){
        return super.getSalaris() + bonus;
    }

    public String getProcAandeelManagers(){
//        DecimalFormat f  = new DecimalFormat("##,00");
//        System.out.println(this.getAantalManagers());
//        System.out.println(super.getAantalWerknemers());
        double temp = (this.getAantalManagers() / super.getAantalWerknemers())*100;
        //System.out.println(temp);
        return String.format("%.2f",temp);
    }

}
