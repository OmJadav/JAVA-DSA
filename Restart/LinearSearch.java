public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 9, 14, 77, 50 };
        int key = 12;

        System.out.println(SearchKey(arr, key));
    }

    public static Boolean SearchKey(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index : " + i);
                return true;
            }
        }
        return false;
    }
}
