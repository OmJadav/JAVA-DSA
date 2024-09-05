public class Palindrome {
    // public static boolean isPalindrome(int x) {
    // int newNum = 0;
    // int temp = x;
    // if (x >= 0) {
    // while (x > 0) {
    // int lastDigit = x % 10;
    // newNum = newNum * 10 + lastDigit;
    // x = x / 10;
    // System.out.println(newNum);
    // }
    // if (newNum == temp) {
    // return true;
    // } else {
    // return false;
    // }
    // } else
    // return false;

    // }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));
    }
}
