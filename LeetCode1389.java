// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] ans = createTargetArray(nums, index);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        return result;
    }
}
