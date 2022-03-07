package opgave2;

public class Counter {
    private static Counter counter;
    private int value;

    private Counter() {
        this.value = 0;
    }

    public static Counter getInstance() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }

    public void count() {
        this.value += 1;
    }

    public void times2() {
        value = value * 2;
    }

    public void zero(){
        this.value = 0;
    }

    public int getValue(){
        return value;
    }

}
