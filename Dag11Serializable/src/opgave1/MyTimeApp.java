package opgave1;

import java.io.*;

public class MyTimeApp {
    public static void main(String[] args) {
        MyTime time = null;

        try {
            FileInputStream f_in = new FileInputStream("myTime.ser");
            ObjectInputStream obj_in = new ObjectInputStream(f_in);
            Object obj = obj_in.readObject();
            if (obj instanceof MyTime) {
                time = (MyTime) obj;
                System.out.println(time);
            }
            obj_in.close();
            f_in.close();

            time.increase();
            time.increase();
            time.increase();
            time.increase();

            System.out.println(time.getTime());


            FileOutputStream f_out = new FileOutputStream("myTime.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
            obj_out.writeObject(time);
            System.out.println("Time er gemt som: " + time);
            obj_out.close();

        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
