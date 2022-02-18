package opgave23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studentMap = new HashMap();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studentMap.put(studerende.getStudieNr(), studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studentMap.remove(studerende.getStudieNr());
    }

    public double gennemsnit() {
        double gennemsnit = 0;
        int i = 0;
        Set<Integer> keys = studentMap.keySet();
        for (Integer key : keys) {
            for (Integer karakter : studentMap.get(key).getKarakterer()) {
                gennemsnit += karakter;
                i++;
            }
        }
        return gennemsnit / i;
    }

    public double gennemsnit2() {
        double gennemsnit = 0;
        int i = 0;
        for (Studerende s : studentMap.values()) {
            for (Integer k : s.getKarakterer()) {
                gennemsnit += k;
                i++;
            }
        }
        return gennemsnit / i;
    }

    public Studerende findStuderende(int studieNr) {
        return studentMap.get(studieNr);
    }

    public String toString() {
        return navn;
    }
}