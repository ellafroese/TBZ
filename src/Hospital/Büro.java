package Hospital;

public class Büro extends Administation implements Akten{

    @Override
    public void getLohn() {
        System.out.println("Das Büro erhält Lohn.");
    }

    @Override
    public void getAkten() {
        System.out.println("Das Büro hat die Akten eingesehen.");
    }
}
