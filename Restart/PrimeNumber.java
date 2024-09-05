public class PrimeNumber {
    public static int isPrime(int n) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        if (n % 2 == 0)
            return 0;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(20));
    }
}
