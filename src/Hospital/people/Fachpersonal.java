package Hospital.people;

import Hospital.Interfaces.Apotheke;

public class Fachpersonal extends Angestellte implements Apotheke {


    @Override
    public double getLohn() {
        return 0;
    }

    @Override
    public void buyMedis() {
        System.out.println("DrugsS");
    }
}
