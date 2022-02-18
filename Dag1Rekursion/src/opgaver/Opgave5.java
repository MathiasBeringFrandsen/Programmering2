package opgaver;

public class Opgave5 {

    public static int euclid(int a, int b) {
        int result = 0;
        if (b <= a && a % b == 0) {
            result = b;
        } else if (a < b) {
            result = euclid(b, a);
        } else {
           result = euclid(b, a % b);
        }
        return result;
    }
}
