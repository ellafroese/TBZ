package Hospital;

public class Empfang extends Administation implements Lohn{

    @Override
    public double getLohn() {
        return 4500;
    }

    @Override
    public String lohnAuszahlen(){
        return "Eine Empfangsperson hat " + getLohn() + " verdient.";
    }
}
