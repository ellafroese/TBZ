package Hospital;

import Hospital.Interfaces.Lohn;

import java.util.ArrayList;

public class Starter {


    //information hiding
    private ArrayList<Lohn> personal = new ArrayList<>();


    public void start(){
        UI ui = new UI(this);
        ui.start();
    }
    public ArrayList<Lohn> getPersonnelList(){
        return personal;
    }
}
