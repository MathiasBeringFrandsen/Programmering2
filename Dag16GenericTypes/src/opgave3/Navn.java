package opgave3;

public class Navn implements Comparable<Navn> {
    private String fornavn;
    private String efternavn;

    public Navn(String fornavn, String efternavn){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String toString(){
        return fornavn + " " + efternavn;
    }


    @Override
    public int compareTo(Navn o) {
        return this.toString().compareTo(o.toString());
    }
}
