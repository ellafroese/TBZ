package Hospital.people;

import Hospital.Interfaces.Lohn;

public class Empfang extends Administation implements Lohn {

    @Override
    public double getLohn() {
        return 4500;
    }

    @Override
    public String lohnAuszahlen(){
        return "Eine Empfangsperson hat " + getLohn() + " verdient.";
    }

    @Override
    public String toString(){
        return "Empfang";
    }
}
