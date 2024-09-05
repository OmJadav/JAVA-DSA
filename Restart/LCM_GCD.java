public class LCM_GCD {
    static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static Long[] lcmAndGcd(Long a, Long b) {
        Long gcdAns = gcd(a, b);
        Long lcmAns = (a * b) / gcdAns;
        return new Long[] { lcmAns, gcdAns };
    }

    public static void main(String[] args) {
        Long a = 14L, b = 8L;
        Long[] ans = lcmAndGcd(a, b);
        System.out.println("LCM: " + ans[0] + ", GCD: " + ans[1]);
    }
}
