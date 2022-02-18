package opgave22;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<>();

    public Studerende(int studieNr, String navn){
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr(){
        return studieNr;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public void addKarakter(int karakter){
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer(){
        return karakterer;
    }

    public String toString(){
        return navn + " " + studieNr;
    }
}
