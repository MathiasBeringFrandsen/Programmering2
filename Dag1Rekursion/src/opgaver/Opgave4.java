package opgaver;

public class Opgave4 {

    public static String reverse(String s) {
        String bagvendt = "";
        if (s.length() <= 1) {
            bagvendt = s;
        } else {
            bagvendt = s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
        }
        return bagvendt;
    }
}
