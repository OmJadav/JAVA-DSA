package Array;

import java.util.Arrays;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
public class LeetCode1304 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            arr[index++] = i;
            arr[index++] = -i;
        }
        if (n % 2 != 0) {
            arr[index] = 0;
        }
        return arr;
    }
}
