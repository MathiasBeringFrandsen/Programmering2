package bibliotek;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {

    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        int bøde = 0;
        int dageOverTid = (int) ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
        if (dageOverTid == 0){
        } else if (dageOverTid < 8){
            bøde = 10;
        } else if (dageOverTid < 15){
            bøde = 30;
        } else {
            bøde = 45;
        }
        if (voksen){
            bøde = bøde * 2;
        }
        return bøde;
    }
}
