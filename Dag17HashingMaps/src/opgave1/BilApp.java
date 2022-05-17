package opgave1;

import java.util.HashSet;

public class BilApp {
    public static void main(String[] args) {
        HashSet<Bil> biler = new HashSet();

        Bil b1 = new Bil("CU12123","Tesla","X","Sort");
        Bil b2 = new Bil("CU12123","Tesla","X","Sort");
        Bil b3 = new Bil("PD45345","Skoda","Octavia","Sølv");
        Bil b4 = new Bil("RE93857","Masserati","GT","Rød");
        Bil b5 = new Bil("RE93857","Masserati","GT","Rød");
        Bil b6 = new Bil("KG30563","Fiat", "Punto","Hvid");
        Bil b7 = new Bil("KG30563","Fiat", "Punto","Hvid");

        biler.add(b1);
        biler.add(b2);
        biler.add(b3);
        biler.add(b4);
        biler.add(b5);
        biler.add(b6);
        biler.add(b7);

        System.out.println(biler.size());

    }
}
