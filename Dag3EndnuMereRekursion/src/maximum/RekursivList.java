package maximum;

import java.util.ArrayList;

public class RekursivList {

    public int max(ArrayList<Integer> list) {

        return maximum(list, 0, list.size() - 1);
    }

    private int maximum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int max1 = maximum(list, l, m);
            int max2 = maximum(list, m + 1, h);
            if (max1 > max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }

    public int sum(ArrayList<Integer> list) {

        return summer(list, 0, list.size() - 1);
    }

    private int summer(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int max1 = summer(list, l, m);
            int max2 = summer(list, m + 1, h);
            return max1 + max2;
        }
    }

    public int zeroCounter(ArrayList<Integer> list) {

        return counter(list, 0, list.size() - 1);
    }

    private int counter(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int max1 = counter(list, l, m);
            int max2 = counter(list, m + 1, h);
            return max1 + max2;
        }
    }


}
