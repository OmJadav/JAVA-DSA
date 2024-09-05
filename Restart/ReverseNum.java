public class ReverseNum {
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        if (rev == (int) rev) {
            return (int) rev;
        } else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1523443466));
    }
}
