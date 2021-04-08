package Hospital;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class getPersonalFromNumberTest {

    @Test
    public void zero(){
        assertTrue(Logik.getPersonalFromNumber(0) == null);
    }
    @Test
        public void one(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getPersonalFromNumber(1) instanceof Arzt);
        }

    @Test
        public void two(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getPersonalFromNumber(2) instanceof Buchhaltung);
        }

    @Test
        public void three(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getPersonalFromNumber(3) instanceof Büro);
        }
    @Test
        public void four(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getPersonalFromNumber(4) instanceof Empfang);
        }
    @Test
        public void five(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getPersonalFromNumber(5) instanceof FaGe);
        }

}


