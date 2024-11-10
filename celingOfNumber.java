// celing number = smallest element in array greater or equal target

public class celingOfNumber {
    public static void main(String args[]) {
        int[] arrs = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(celingNumber(arrs, target));
    }

    public static int celingNumber(int[] arrs, int target) {
        int start = 0;
        int end = arrs.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // int mid = (start + end) / 2;

            if (arrs[mid] < target) {
                start = mid + 1;
            } else if (arrs[mid] > target) {
                end = mid - 1;
            } else {
                return arrs[mid];
            }
        }
        return arrs[start];
    }

}
