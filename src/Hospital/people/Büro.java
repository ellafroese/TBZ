package Hospital.people;

import Hospital.Interfaces.Akten;
import Hospital.Interfaces.Lohn;

public class Büro extends Administation implements Akten, Lohn {

    @Override
    public double getLohn() {
        return 4800;
    }

    @Override
    public String lohnAuszahlen(){
        return "Eine Büroperson hat " + getLohn() + " verdient.";
    }

    @Override
    public void getAkten() {
        System.out.println("Das Büro hat die Akten eingesehen.");
    }

    @Override
    public String toString(){
        return "Büro";
    }
}
