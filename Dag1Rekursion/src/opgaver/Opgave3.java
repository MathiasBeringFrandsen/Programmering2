package opgaver;

public class Opgave3 {

    public static int product(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else {
            result = product(a - 1, b) + b;
        }
        return result;
    }

    public static int productRus(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else if (a % 2 == 1) {
            result = productRus(a - 1, b) + b;
        } else {
            result = productRus(a / 2, b + b);
        }
        return result;
    }

}
