package Hospital;

public class Arzt extends Fachpersonal implements Akten, Witz, Lohn{

    @Override
    public double getLohn() {
        return 12000;
    }

    @Override
    public void getAkten() {
        System.out.println("Der/Die Arzt/Ärztin hat die Akten eingesehen.");
    }

    @Override
    public void joke() {

    }

    @Override
    public String lohnAuszahlen(){
        return "Ein Arzt hat " + getLohn() + " verdient.";
    }
}
