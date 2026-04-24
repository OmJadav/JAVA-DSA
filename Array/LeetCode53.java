package Array;

// https://leetcode.com/problems/maximum-subarray/description/
public class LeetCode53 {
    public static void main(String[] args) {
        int[] mat = { 5, 4, -1, 7, 8 };

        System.out.println(maxSubArray(mat));
    }

    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > sum) {
                sum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return sum;
    }

}
