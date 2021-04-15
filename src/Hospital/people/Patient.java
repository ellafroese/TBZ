package Hospital.people;

import Hospital.Interfaces.Apotheke;
import Hospital.Interfaces.Witz;

public class Patient implements Apotheke, Witz {
    @Override
    public void buyMedis() {
        System.out.println("Der/Die Patient/in hat Medikamente gekauft.");
    }

    @Override
    public void joke() {
        System.out.println("Der PAtient macht einen Witz.");
    }
}
