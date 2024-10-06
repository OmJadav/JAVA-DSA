package LeetCode;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] sums = { 2, 7, 11, 15 };
        int target = 26;
        int[] result = twoSum1(sums, target);
        System.out.println(Arrays.toString(result));
    }
}
