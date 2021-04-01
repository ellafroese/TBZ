package Hospital;

public class Büro extends Administation implements Akten, Lohn{

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
}
