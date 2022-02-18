package opgave5;

import java.util.HashSet;
import java.util.Set;

public class Saelger implements Observer{
    private String navn;

    public Saelger(String navn){
        this.navn = navn;
    }


    @Override
    public void update(Subject s) {
        Set<BogTitel> titler = new HashSet<>();
        for (Kunde kunde : ((BogTitel) s).getKunder()){
            titler.addAll(kunde.getBoeger());
        }
        titler.remove(s);
        System.out.println("Andre kunder der har købt samme bog har også købt: " + titler);
    }
}
