import java.util.Arrays;

public class WerknemerApp {
    public static void main(String[] args) {

        Werknemer w1 = new Werknemer("Tom", "Claes",new Adres("Lillosteenweg", "12", 3530, "Houthalen"),"Werknemer", 900);
        Werknemer w2 = new Werknemer("Greet", "Aerts", new Adres("Everselstraat","151A", 3580, "Beringen"));
        Manager m1 = new Manager("Jef", "Test", new Adres("Europalaan", "42", 3560, "Genk"), "CEO", 50);

        w1.voegVoornamenToe("Jozef", "Maria");

        System.out.println(w1.toString());
        System.out.println(w1.getSalaris());
        System.out.println(w2.getSalaris());
        System.out.println(m1.getSalaris());
        System.out.println(m1.getProcAandeelManagers());



    }
}
