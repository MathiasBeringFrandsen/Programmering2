package opgave1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private int time;
    private List<String> times = new ArrayList<>();


    public MyTime(){
        time = 0;
    }

    public void increase(){
        time++;
    }

    public void reset(){
        time = 0;
    }

    public int getTime(){
        return time;
    }

    public String toString(){
        return "" + time;
    }

    public void saveTime(){
        times.add(time + "");
    }

}
