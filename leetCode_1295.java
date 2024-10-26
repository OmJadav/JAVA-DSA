// 1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class leetCode_1295 {
    public static void main(String args[]) {
        int[] nums = { 12, 345, 2, 6, 7896, 234, 14 };
        System.out.println(findNumbers(nums));
    }

    // public static int findNumbers(int[] nums) {
    // int count = 0;
    // for (int num : nums) {
    // if (even(num)) {
    // count++;
    // }
    // }
    // return count;
    // }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (((int) (Math.log10(num)) + 1) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) { // check for even number of digits
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // optimized digits function
    static int digits(int num) {
        return (int) (Math.log10(num)) + 1;
    }
    // static int digits(int num) {
    // if (num < 0) {
    // num = num * -1;
    // }
    // if (num == 0) {
    // return 1;
    // }
    // int count = 0;
    // while (num > 0) {
    // count++;
    // num = num / 10;
    // }
    // return count;
    // }

}

// optimized code trial 1 {
// static int findNumbers(int[] nums) {
// int count = 0;
// for (int num : nums) {
// // Directly check for even digit count without extra function calls
// int digits = 0;
// while (num > 0) {
// num /= 10;
// digits++;
// }
// if (digits % 2 == 0) {
// count++;
// }
// }
// return count;
// }
// }