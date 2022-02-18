package opgave21;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studentList = new ArrayList<>();

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende){
        if (!studentList.contains(studerende))
        studentList.add(studerende);
    }

    public void removeStuderende(Studerende studerende){
        studentList.remove(studerende);
    }

    public double gennemsnit(){
        double gennemsnit = 0;
        int i = 0;
        for (Studerende student : studentList){
            for (Integer karakter : student.getKarakterer()){
                gennemsnit += karakter;
                i++;
            }
        }
        return gennemsnit / i;
    }

    public Studerende findStuderende(int studieNr){
        Studerende student = null;
        for (Studerende studerende : studentList){
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