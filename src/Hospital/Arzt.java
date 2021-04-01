package Hospital;

public class Arzt extends Fachpersonal implements Akten, Witz{

    @Override
    public void getLohn() {
        System.out.println("Der Arzt erhält Lohn");
    }

    @Override
    public void getAkten() {
        System.out.println("Der/Die Arzt/Ärztin hat die Akten eingesehen.");
    }

    @Override
    public void joke() {

    }
}
