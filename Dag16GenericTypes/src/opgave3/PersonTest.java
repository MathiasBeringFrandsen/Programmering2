package opgave3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Navn navn = new Navn("Mads", "Bøllestrup");
        Navn navn1 = new Navn("Markus","Markzu");
        Navn navn2 = new Navn("Fredrik","Frederiksen");

        Person<Navn> p1 = new Person(navn);
        Person<Navn> p2 = new Person(navn1);
        Person<Navn> p3 = new Person(navn2);
        Person<Navn> p4 = new Person("Mads Nørskov");
        Person<Navn> p5 = new Person("Tobias Tobiasen");
        Person<Navn> p6 = new Person("Omar Omarsen");

        List<Person<Navn>> personer = new ArrayList<>();

        personer.add(p1);
        personer.add(p2);
        personer.add(p3);
//        personer.add(p4);
//        personer.add(p5);
//        personer.add(p6);

        for (Person<Navn> p : personer){
            System.out.println(p.getNavn());
        }

        Collections.sort(personer);

        for (Person<Navn> p : personer){
            System.out.println(p.getNavn());
        }

//        System.out.println(p1.getNavn());
//        System.out.println();
//        System.out.println(p2.getNavn());


    }
}