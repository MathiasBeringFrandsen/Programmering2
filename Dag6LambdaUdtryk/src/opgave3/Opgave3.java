package opgave3;

import java.util.*;

public class Opgave3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2,4);
        numbers.put(3,9);
        numbers.put(4,16);
        numbers.put(5,25);
        numbers.put(6,36);

        Iterator<Integer> keys = numbers.keySet().iterator();
        while (keys.hasNext()){
            System.out.println(numbers.get(keys.next()));
        }
    }
}
