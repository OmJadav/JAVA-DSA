// https://leetcode.com/problems/two-sum/description/
package Array;

import java.util.Arrays;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(nums, target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }
        // return new int[] { -1, -1 };

        int[] arr = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
            for (int k = 0; k < nums.length; k++) {
                if (k == i || k == j)
                    continue;
                else if (nums[i] + nums[k] == target) {
                    arr[0] = i;
                    arr[1] = k;
                    return arr;
                } else if (nums[j] + nums[k] == target) {
                    arr[0] = j;
                    arr[1] = k;
                    return arr;
                }

            }
            i++;
            j--;
        }
        return arr;
    }
}