package opgave5;

public class Indkoeber implements Observer{
    private String navn;

    public Indkoeber(String navn){
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        if (((BogTitel) s).getAntal() < 6){
            ((BogTitel) s).indkoebTilLager(10);
            System.out.println("Der er bestilt 10 bøger af " + ((BogTitel) s).getTitel() + " til lageret");
        }
    }
}
