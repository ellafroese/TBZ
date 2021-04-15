package Hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    static Scanner scanner = new Scanner(System.in);
    Starter starter;

    public UI(Starter starter){
        this.starter = starter;
    }


    public void start () {
        int option = 1;

        while(option != 0){

            //ui ausgeben
            System.out.println("----------------------------------");
            System.out.println("        Willkommen");
            System.out.println("        Das Hospital-Tool");
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.println(" Was wollen Sie tun?");
            System.out.println(" 1. Personal erfassen");
            System.out.println(" 2. Zahltag Personal");
            System.out.println(" 3. Gesammte Personalliste löschen");
            System.out.println(" 4. File einlesen");
            System.out.println("");
            System.out.println("----------------------------------");

            option = getInput(1, 4);

            switch (option) {
                case 1:
                    personalErfassen();
                    break;
                case 2:
                    try {
                        personalAuszahlen();
                    } catch (NoPersonnelException e){
                        System.out.println("Es ist kein Personal in der Liste ersfasst.");
                    }
                    break;
                case 3:
                    personallisteLöschen();
                    break;
                case 4:
                    readPersonalFile();
                    break;
            }
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


            if (option != 0) {
                Logik.addPersonFromNumber(starter.getPersonnelList(), option);
            }
        }
    }



    // hier werden die Personen ausgezahlt
    //throws ist wie try catch
    public void personalAuszahlen() throws NoPersonnelException{
        if(starter.getPersonnelList().size() > 0) {
            System.out.println("");
            System.out.println("Insgesamt entstehen " + Logik.getSumOfSalaries(starter.getPersonnelList()) + " CHF Kosten für das Lohnauszahlen der Mitarbeiter/innen.");
        }else{
            throw new NoPersonnelException("Es ist kein Personal eingetragen.");
        }

    }


    //hier wird die personalliste gelöscht
    public void personallisteLöschen(){
        starter.getPersonnelList().clear();
        System.out.println("Die Personalliste wurde gelöscht.");


    }


    public void readPersonalFile(){
        Logik.addPersonnelFromFile(starter.getPersonnelList());
        System.out.println("Das File wurde erfolgreich eingelesen.");
    }


}
