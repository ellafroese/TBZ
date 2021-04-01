package Hospital;

public class Fachpersonal extends Angestellte implements Apotheke{


    @Override
    public void getLohn() {
        super.getLohn();
    }

    @Override
    public void buyMedis() {
        System.out.println("DrugsS");
    }
}
