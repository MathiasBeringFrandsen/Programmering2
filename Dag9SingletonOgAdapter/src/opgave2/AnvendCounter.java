package opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();

        System.out.println("Start værdi: " + counter.getValue());
        counter.count();
        counter.count();
        counter.count();
        System.out.println("Efter 3 counts: " + counter.getValue());
        counter.times2();
        System.out.println("Efter times2: " + counter.getValue());
        counter.zero();
        System.out.println("Efter zero kald: " + counter.getValue());
    }
}
