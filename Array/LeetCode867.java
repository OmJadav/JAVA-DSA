package Array;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/
public class LeetCode867 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(Arrays.deepToString(transpose(mat)));
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] arr = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[col][row] = matrix[row][col];
            }
        }

        return arr;
    }
}
