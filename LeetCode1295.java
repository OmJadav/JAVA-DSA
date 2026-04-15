// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class LeetCode1295 {
    public static void main(String args[]) {
        int[] nums = { 12, 345, 22, 6, 7896 };

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int arr : nums) {
            if (checkEven(arr)) {
                count++;
            }
        }
        return count;
    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static int countDigitOptimized(int num){
        return (int)(Math.log10(num))+1;
    }

    public static boolean checkEven(int arr) {
        int number = countDigitOptimized(arr);
        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
