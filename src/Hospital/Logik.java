package Hospital;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
                System.out.print("Arzt ");
                return new Arzt();
            case 2:
                System.out.print("Buchhaltungperson ");
                return  new Buchhaltung();
            case 3:
                System.out.print("Büro ");
                return new Büro();
            case 4:
                System.out.print("Empfang ");
                return new Empfang();
            case 5:
                System.out.print("FaGe ");
                return new FaGe();
        }
        return null;
    }


    public static void addPersonnelFromFile(ArrayList<Lohn> personal){
        try{
            File f = new File ("personnelFile.txt");
            Scanner scanner = new Scanner(f);

            while(scanner.hasNextInt()) {
                Logik.addPersonFromNumber(personal, scanner.nextInt());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void addPersonFromNumber(ArrayList<Lohn> personal, int number){
        personal.add(getPersonalFromNumber(number));
        System.out.println("wurde hinzugefügt.");
    }

}


