package opgave3;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {

    @Override
    public int compare(Studerende o1, Studerende o2) {
        return o1.getNavn().compareToIgnoreCase(o2.getNavn());
    }
}
