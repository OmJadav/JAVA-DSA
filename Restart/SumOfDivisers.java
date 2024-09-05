public class SumOfDivisers {
    public static long sumOfDivisors(int n) {
        // code here
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * (n / i);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDivisors(66600));
    }
}
