package Hospital;

import java.util.ArrayList;

public class Main {

    static ArrayList<Angestellte> angestellte = new ArrayList<>();


    public static void main(String[] args){

        UI ui = new UI();
        ui.start();

        Arzt a = new Arzt();
        FaGe f1 = new FaGe();
        FaGe f2 = new FaGe();
        Administation admin = new Administation();
        Büro b = new Büro();
        Buchhaltung bu = new Buchhaltung();

        angestellte.add(a);
        angestellte.add(f1);
        angestellte.add(f2);
        angestellte.add(admin);
        angestellte.add(b);
        angestellte.add(bu);

        payDay(angestellte);

    }

    public static void payDay(ArrayList<Angestellte> person){
        for (Angestellte a: person){
             a.getLohn();

        }
    }



}
