package opgave22;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studentSet = new HashSet<>();

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende){
        studentSet.add(studerende);
    }

    public void removeStuderende(Studerende studerende){
        studentSet.remove(studerende);
    }

    public double gennemsnit(){
        double gennemsnit = 0;
        int i = 0;
        for (Studerende student : studentSet){
            for (Integer karakter : student.getKarakterer()){
                gennemsnit += karakter;
                i++;
            }
        }
        return gennemsnit / i;
    }

    public Studerende findStuderende(int studieNr){
        Studerende student = null;
        for (Studerende studerende : studentSet){
            if (studerende.getStudieNr() == studieNr){
                student = studerende;
            }
        }
        return student;
    }

    public String toString(){
        return navn;
    }
}