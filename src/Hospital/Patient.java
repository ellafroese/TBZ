package Hospital;

public class Patient implements Apotheke, Witz{
    @Override
    public void buyMedis() {
        System.out.println("Der/Die Patient/in hat Medikamente gekauft.");
    }

    @Override
    public void joke() {
        System.out.println("Der PAtient macht einen Witz.");
    }
}
