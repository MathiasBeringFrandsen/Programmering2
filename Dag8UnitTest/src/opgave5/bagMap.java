package opgave5;

import java.util.HashMap;
import java.util.Iterator;

public class bagMap implements Bag, Iterable {
    HashMap<String, Integer> contents = new HashMap<>();

    @Override
    public void add(String s) {
        if (!contents.containsKey(s)) {
            contents.put(s, 1);
        } else {
            contents.put(s, contents.get(s) + 1);
        }
    }

    @Override
    public void remove(String s) {
        if (contents.get(s) == 1){
            contents.remove(s);
        } else {
            contents.put(s, contents.get(s) - 1);
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

}
