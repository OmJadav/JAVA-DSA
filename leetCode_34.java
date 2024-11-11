// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array 
public class leetCode_34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = search(nums, target, true);
        if (result[0] != -1) {
            result[1] = search(nums, target, false);
        }
        return result;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                result = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
