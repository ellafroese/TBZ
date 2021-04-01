package Hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Lohn> personal = new ArrayList<>();

    public void start() {
        //ui ausgeben
        System.out.println("----------------------------------");
        System.out.println("        Willkommen");
        System.out.println("        Das Hospital-Tool");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println(" Was wollen Sie tun?");
        System.out.println(" 1. Personal erfassen");
        System.out.println(" 2. Zahltag Personal");
        System.out.println("");
        System.out.println("----------------------------------");


        int option = getInput(1, 2);

        switch (option) {
            case 1:
                personalErfassen();
                break;
            case 2:
                personalAuszahlen();
                break;
        }
    }

    public int getInput(int min, int max){
        int option = max + 1;

        //user input
        while (option < min || option > max) {
            if(option == 0){
                break;
            }
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        return option;
    }


    public void personalErfassen() {
        System.out.println("---------------------------------------");
        System.out.println(" Was für Personal wollen Sie erfassen?");
        System.out.println(" 1. Arzt erfassen");
        System.out.println(" 2. Buchhaltung erfassen");
        System.out.println(" 3. Büro erfassen");
        System.out.println(" 4. Empfang erfassen");
        System.out.println(" 5. FaGe erfassen");
        System.out.println("");
        System.out.println(" 0 für Exit");
        System.out.println("---------------------------------------");


        int option = 1;

        while(option != 0){

            option = getInput(1, 5);

            Lohn a = new Arzt();
            switch (option) {
                case 1:
                    a = new Arzt();
                    System.out.println("Arzt");
                    break;
                case 2:
                    a = new Buchhaltung();
                    System.out.println("Buchhaltungperson");
                    break;
                case 3:
                    a = new Büro();
                    System.out.println("Büro");
                    break;
                case 4:
                    a = new Empfang();
                    System.out.println("Empfang");
                    break;
                case 5:
                    a = new FaGe();
                    System.out.println("FaGe");
                    break;
                case 0:
                    break;
            }

            personal.add(a);
            if (option != 0) {
                System.out.println(" wurde hinzugefügt.");
            }

        }
    }


    public void personalAuszahlen(){
        for(Lohn l: personal){
            System.out.println(l.lohnAuszahlen());
        }

    }


}
