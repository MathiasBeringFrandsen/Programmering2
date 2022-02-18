package opgaver;

public class Opgave1 {
    public static int fac(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        }
        else {
            result = n * fac(n - 1);
        }
        return result;
    }
}
