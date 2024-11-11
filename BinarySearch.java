//704. https://leetcode.com/problems/binary-search

//for sorted Array
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 1 };
        int target = 2;
        System.out.println(Search_key(nums, target));
    }

    public static int Search_key(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (nums[mid] < target) { //for ascending order shorted array
            // start = mid + 1;
            // } else if(nums[mid] > target){
            // end = mid - 1;
            // } else {
            // return mid;
            // }
            if (nums[mid] > target) { // for descending order shorted array
                start = mid + 1;
            } else if (nums[mid] < target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
