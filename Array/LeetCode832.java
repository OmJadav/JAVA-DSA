package Array;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image/
public class LeetCode832 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        System.out.println(Arrays.deepToString(flipAndInvertImage(mat)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < image[i].length; j++) {
                arr[i][j] = image[i][n - 1 - j];
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}
