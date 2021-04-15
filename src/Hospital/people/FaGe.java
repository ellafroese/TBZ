package Hospital.people;

import Hospital.Interfaces.Lohn;

public class FaGe extends Fachpersonal implements Lohn {

    @Override
    public double getLohn() {
       return 5500;
    }

    @Override
    public String lohnAuszahlen(){
        return "Eine FaGe hat " + getLohn() + " verdient.";
    }

    @Override
    public String toString(){
        return "FaGe";
    }
}
