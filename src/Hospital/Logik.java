package Hospital;

import java.util.ArrayList;

public class Logik {

    public static int getSumOfSalaries(ArrayList<Lohn> personal) {
        int sum = 0;
        for (Lohn l : personal) {
            System.out.println(l.lohnAuszahlen());
            // hier werden die gesammten Kosten ausgerechnet
            sum += l.getLohn();
        }
        return sum;
    }

    public static Lohn getPersonalFromNumber(int option){
        switch (option) {
            case 1:
                System.out.println("Arzt");
                return new Arzt();
            case 2:
                System.out.println("Buchhaltungperson");
                return  new Buchhaltung();
            case 3:
                System.out.println("Büro");
                return new Büro();
            case 4:
                System.out.println("Empfang");
                return new Empfang();
            case 5:
                System.out.println("FaGe");
                return new FaGe();
        }
        return null;
    }

}


