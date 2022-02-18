package opgave5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BogTitel implements Subject{
    private String titel;
    private int antal;

    private Set<Observer> observers = new HashSet<>();
    private final List<Kunde> kunder = new ArrayList<>();

    public BogTitel(String titel, int antal){
        this.antal = antal;
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void indkoebTilLager(int antal){
        this.antal += antal;
    }

    public void etKoeb(Kunde k){
        kunder.add(k);
        k.addBogTitel(this);
        this.antal--;
        notifyObservers();
    }

    public void notifyObservers(){
        for (Observer o : observers)
            o.update(this);
    }

    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public String toString(){
        return titel;
    }
}
