package Hospital.test;


import Hospital.Interfaces.Lohn;
import Hospital.Logik;
import Hospital.people.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class getSumOfSalariesTest {

        @Test
        public void empty(){
            ArrayList<Lohn> l = new ArrayList<>();
            assertTrue(Logik.getSumOfSalaries(l) == 0);
        }

        @Test
        public void vonalleneins(){
            ArrayList<Lohn> l = new ArrayList<>();
            //vonalleneins
            l.add(new Arzt());
            l.add(new Buchhaltung());
            l.add(new Büro());
            l.add(new Empfang());
            l.add(new FaGe());

            assertTrue(Logik.getSumOfSalaries(l) == 32800);
        }

        @Test
        public void einArzt(){
            ArrayList<Lohn> l = new ArrayList<>();
            l.add(new Arzt());

            assertTrue(Logik.getSumOfSalaries(l) == 12000);
        }

        @Test
        public void einBuchhaltung(){
            ArrayList<Lohn> l = new ArrayList<>();
            l.add(new Buchhaltung());

            assertTrue(Logik.getSumOfSalaries(l) == 6000);
        }

        @Test
            public void einEmpfang(){
                ArrayList<Lohn> l = new ArrayList<>();
                l.add(new Empfang());

                assertTrue(Logik.getSumOfSalaries(l) == 4500);
            }

        @Test
        public void einFaGe(){
            ArrayList<Lohn> l = new ArrayList<>();
            l.add(new FaGe());

            assertTrue(Logik.getSumOfSalaries(l) == 5500);
        }

        @Test
        public void einBüro(){
            ArrayList<Lohn> l = new ArrayList<>();
            l.add(new Büro());

            assertTrue(Logik.getSumOfSalaries(l) == 4800);
        }

        @Test
        public void maxSalary(){
          ArrayList<Lohn> l = new ArrayList<>();
          for(int i = 0;  i<168956; i++){
              l.add(new Arzt());
          }
            assertTrue(Logik.getSumOfSalaries(l) == 2027472000);
        }

}


