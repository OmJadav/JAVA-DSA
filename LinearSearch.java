public class LinearSearch {
    public static void main(String args[]) {
        // int[] arr = { 3, 6, 8, 1, 34 };
        // LinearSearchBrute(arr);
        // System.out.println(min(arr));
        // searchIn2DArray();
        searchMaxIn2DArray();
    }

    static void LinearSearchBrute(int[] arr) {
        int key = 34;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {

                System.out.println("The Key has been found on index : " + index);
                break;
            }

        }
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static void searchIn2DArray() {
        int[][] arr = {
                { 1, 2, 3 },
                { 5, 4, 7, 21 },
                { 19, 14 },
                { 15, 24, 17 },
        };
        int target = 17;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Found at " + "Row " + row + " and Col " + col);
                }
            }
        }
    }

    static void searchMaxIn2DArray() {
        int[][] arr = {
                { 1, 2, 3 },
                { 5, 4, 47, 21 },
                { 19, 14 },
                { 15, 24, 17 }
        };
        int max = arr[0][0];

        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // if (arr[row][col] > max) {
        // max = arr[row][col];
        // }
        // }
        // }

        // second loop foreach
        for (int[] rows : arr) {
            for (int element : rows) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Max :" + max);
    }

    
}
