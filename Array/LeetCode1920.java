package Array;
// https://leetcode.com/problems/build-array-from-permutation/
public class LeetCode1920 {

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(buildArray(nums));
        ;
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}