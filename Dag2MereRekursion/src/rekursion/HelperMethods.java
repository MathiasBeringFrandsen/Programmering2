package rekursion;

import java.util.ArrayList;
import java.util.Collections;

public class HelperMethods {
    public static int sum1(ArrayList<Integer> list) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            result = list.get(0);
            list.remove(0);
            result = result + sum(list);
        }
        return result;
    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    // Rekursiv hjælpemetode med de nødvendige parametre

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }

    public static int length(ArrayList<Integer> list) {
        return length(list, 0);

    }

    // Rekursiv hjælpemetode med de nødvendige parametre
    private static int length(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = 1 + length(list, index + 1);
        }
        return result;

    }

    public static int ligeTal(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            result = 0;
        } else if (list.get(index) % 2 != 0) {
            result = ligeTal(list, index + 1);
        } else {
            result = 1 + ligeTal(list, index + 1);
        }
        return result;
    }

    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    public static boolean palindrom(String tekst, int index) {
        boolean isPalindrom = false;
        if (index * 2 >= tekst.length()) {
            isPalindrom = true;
        } else if (tekst.charAt(index) == tekst.charAt(tekst.length() - index - 1)) {
            isPalindrom = palindrom(tekst, index + 1);
        }
        return isPalindrom;
    }

    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0);
    }

    public static boolean findTal(ArrayList<Integer> list, int target, int left, int right) {
        boolean foundNumber = false;
        int middle = (left + right) / 2;
        if (middle < list.size()) {
            if (target == list.get(middle)) {
                foundNumber = true;
            } else if (list.get(middle) > target && left >= 0 && right >= 0) {
                foundNumber = findTal(list, target, left, middle - 1);
            } else if (left >= 0 && right >= 0) {
                foundNumber = findTal(list, target, middle, right + 1);
            }
        }
        return foundNumber;
    }

    public static boolean findTal(ArrayList<Integer> list, int target) {
        return findTal(list, target, 0, list.size() - 1);
    }

    public static int ackermann(int x, int y) {
        int result = 0;
        if (x == 0) {
            result = y + 1;
        } else if (y == 0) {
            result = ackermann(x - 1, 1);
        } else {
            result = ackermann(x - 1, ackermann(x, y - 1));
        }
        return result;
    }

    public static int binomial(int n, int m) {
        int result = 0;
        if (m == 0) {
            result = 1;
        } else if (m == n) {
            result = 1;
        } else if (0 < m && m < n){
            result = binomial(n-1,m) + binomial(n-1,m-1);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(8);
        list.add(45);
        list.add(29);
        System.out.println(list);
        System.out.println("sum: " + sum(list));
        System.out.println("length: " + length(list));
        System.out.println("lige: " + ligeTal(list, 0));
        System.out.println("palindrom: " + palindrom("KAJAK"));
        Collections.sort(list);
        System.out.println("findTal: " + findTal(list, 3));
        System.out.println("ackermann: " + ackermann(3, 5));
        System.out.println("binomial: " + binomial(7, 2));

        System.out.println(list);
    }

}
