package opgave1;

import java.util.Objects;

public class Bil {
    private String regNr;
    private String mærke;
    private String model;
    private String farve;

    public Bil(String regNr, String mærke, String model, String farve){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public String toString(){
        return regNr + " " + mærke + " " + model + " " + farve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return regNr.equals(bil.regNr) && mærke.equals(bil.mærke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNr, mærke);
    }
}
