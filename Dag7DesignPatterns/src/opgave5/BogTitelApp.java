package opgave5;

public class BogTitelApp {
    public static void main(String[] args) {
        Saelger hansen = new Saelger("Hansen");
        Indkoeber jensen = new Indkoeber("Jensen");

        BogTitel anders = new BogTitel("Anders And", 6);
        anders.addObserver(hansen);
        anders.addObserver(jensen);

        BogTitel java = new BogTitel("Java", 8);
        java.addObserver(hansen);
        java.addObserver(jensen);

        Kunde læs1 = new Kunde("Læsehest1");
        Kunde læs2 = new Kunde("Læsehest2");
        Kunde læs3 = new Kunde("Læsehest3");

        java.etKoeb(læs1);
        java.etKoeb(læs2);
        java.etKoeb(læs3);
        anders.etKoeb(læs1);
        anders.etKoeb(læs2);
        anders.etKoeb(læs3);
    }
}
