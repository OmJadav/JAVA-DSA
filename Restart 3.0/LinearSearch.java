public class LinearSearch {
    public static void main(String args[]) {
        int[] arr = { 3, 6, 8, 12, 34 };
        LinearSearchBrute(arr);
    }

    static void LinearSearchBrute(int[] arr) {
        int key = 34;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {

                System.out.println("The Key has been found on index : " + i);
                break;
            }

        }
    }
}
