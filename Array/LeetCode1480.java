package Array;
// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class LeetCode1480 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] anss = runningSum(arr);
        for (int ans : anss) {
            System.out.println(ans);
        }
    }

    public static int[] runningSum(int[] nums) {

        // int[] digitSum = new int[nums.length];
        // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        // digitSum[i] = nums[i] + sum;
        // sum = sum + nums[i];
        // }
        // return digitSum;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
