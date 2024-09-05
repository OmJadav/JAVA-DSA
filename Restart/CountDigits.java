public class CountDigits {
    static int countEvenlyDividingDigits(int n) {
        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println(countEvenlyDividingDigits(n));
    }
}
