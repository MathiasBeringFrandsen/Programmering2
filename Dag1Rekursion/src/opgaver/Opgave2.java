package opgaver;

public class Opgave2 {

    public static int power(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else {
            result = n * power(n, p - 1);
        }
        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else if (p % 2 == 1) {
            result = n * power2(n, p - 1);
        } else {
            result = power2(n * n, p / 2);
        }
        return result;
    }

}
