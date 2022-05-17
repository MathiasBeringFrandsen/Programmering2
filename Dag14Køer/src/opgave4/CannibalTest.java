package opgave4;

public class CannibalTest {
    public static void main(String[] args) {
        CannibalListe cl = new CannibalListe();
        Person p1 = new Person("Tom", 44);
        Person p2 = new Person("Diana", 55);
        Person p3 = new Person("Harry", 33);
        Person p4 = new Person("Thomas", 22);
        Person p5 = new Person("Bob", 66);
        Person p6 = new Person("Brian", 77);

        cl.enqueue(p1);
        cl.enqueue(p2);
        cl.enqueue(p3);
        cl.enqueue(p4);
        cl.enqueue(p5);
        cl.enqueue(p6);

        cl.print();

        cl.randomStart();
        System.out.println();
        System.out.println(cl.eat(5));
        System.out.println(cl.eat(5));
        System.out.println(cl.eat(5));
        System.out.println(cl.eat(5));
        System.out.println(cl.eat(5));
        System.out.println(cl.eat(5));

        System.out.println();
        cl.print();
    }
}
