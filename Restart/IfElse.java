public class IfElse {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        }
        if (n > m) {
            return "greater";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        // compareNM(4, 5);
        System.out.println(compareNM(4, 5));
    }
}
