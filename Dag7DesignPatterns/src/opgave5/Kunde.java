package opgave5;

import java.util.HashSet;
import java.util.Set;

public class Kunde {
    private String navn;

    private final Set<BogTitel> boeger = new HashSet<>();

    public Kunde(String navn){
        this.navn = navn;
    }

    public Set<BogTitel> getBoeger() {
        return new HashSet<>(boeger);
    }

    public void addBogTitel(BogTitel bogTitel){
        boeger.add(bogTitel);
    }
}
