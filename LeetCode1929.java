// https://leetcode.com/problems/concatenation-of-array/
public class LeetCode1929 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] ans = getConcatenation(nums);

        for (int ind : ans) {
            System.out.println(ind);
        }
        // System.out.println(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}