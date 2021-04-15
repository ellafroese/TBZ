package Hospital.people;

import Hospital.Interfaces.Lohn;

public class Buchhaltung extends Administation implements Lohn {

    @Override
    public double getLohn() {
        return 6000;
    }

    @Override
    public String lohnAuszahlen(){
        return "Eine Buchhaltungsperson hat " + getLohn() + " verdient.";
    }

    @Override
    public String toString(){
        return "Buchhaltung";
    }
}
