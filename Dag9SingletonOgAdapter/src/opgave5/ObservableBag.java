package opgave5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ObservableBag implements Bag, Iterable {
    HashMap<String, Integer> contents = new HashMap<>();
    HashSet<Observer> observers = new HashSet<>();

    @Override
    public void add(String s) {
        if (!contents.containsKey(s)) {
            contents.put(s, 1);
        } else {
            contents.put(s, contents.get(s) + 1);
        }
        updateObservers(s);
    }

    @Override
    public void remove(String s) {
        if (contents.get(s) == 1){
            contents.remove(s);
        } else {
            contents.put(s, contents.get(s) - 1);
        }
        updateObservers(s);
    }

    private void updateObservers(String s){
        for (Observer o : observers) {
            o.update(s, contents.get(s));
        }
    }

    @Override
    public int getCount(String s) {
        return contents.get(s);
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<String> iterator() {
        return contents.keySet().iterator();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


}
