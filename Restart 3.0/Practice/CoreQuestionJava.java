public class CoreQuestionJava {
    public static void main(String[] args) {
        // ReverseNumber(12365);
        // Swap2NumberWith3rdVar(2, 3);
        // Swap2NumberWithout3rdVar(3, 5);
        // FindMissingNumFromArray();
        // IsPalindrome(-121);
        // PrintFactorial();
        PrintFibonacci();
    }

    // Reverse a number without converting it to a String.
    static void ReverseNumber(int number) {
        int reversed = 0;
        int temp = Math.abs(number);
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        reversed = (number < 0) ? -reversed : reversed;
        System.out.println("Reserved Number : " + reversed);
    }

    // Swap two numbers using a third variable.
    static void Swap2NumberWith3rdVar(int num1, int num2) {

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " And " + num2);
    }

    // Swap two numbers without using a third variable.
    static void Swap2NumberWithout3rdVar(int num1, int num2) {
        // method 1
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // method 2

        // num1 = num1 * num2;
        // num2 = num1 / num2;
        // num1 = num1 / num2;

        // method 3 XOR
        // num1 = num1 ^ num2;
        // num2 = num1 ^ num2;
        // num1 = num1 ^ num2;
        System.out.println(num1 + " And " + num2);
    }

    // Find missing number in an array of size n containing numbers 1 to n
    static void FindMissingNumFromArray() {

        int num[] = { 1, 2, 3, 4, 6 };
        int n = 0;
        // Find maximum value
        for (int value : num) {
            if (value > n) {
                n = value;
            }
        }
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int arr : num) {
            actualSum += arr;
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing Number : " + missing);

    }

    static void IsPalindrome(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if (num < 0) {
            System.out.println("Number is Not a Palindrome");

        } else if (reversed == num) {
            System.out.println("Number is a Palindrome");
        } else {
            System.out.println("Number is Not a Palindrome");
        }
    }

    static void PrintFactorial() {
        int num = 10;
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n = n * i;
            System.out.print(n + " ");
        }
    }

    static void PrintFibonacci() {
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

}