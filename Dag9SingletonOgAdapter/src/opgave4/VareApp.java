package opgave4;

public class VareApp {
    public static void main(String[] args) {
        Vare boremaskine = new ElVare(1200,"Boremaskine");
        Vare mel = new FoedeVare(15,"Mel");
        Spiritus vodka = new Spiritus(375,"Purity Vodka");
        Vare vodkaAdap = new SpiritusAdapter(vodka);

        System.out.println("Moms på boremaskine: " + boremaskine.beregnMoms());
        System.out.println("Moms på mel: " + mel.beregnMoms());
        System.out.println("Moms på vodka: " + vodkaAdap.beregnMoms());
    }
}
