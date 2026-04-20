package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LeetCode1380 {
    public static void main(String[] args) {
        // int[][] nums = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        // int[][] nums = { { 7, 8 }, { 1, 2 } };
        int[][] nums = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };

        List<Integer> result = luckyNumbers(nums);
        System.out.println(result);
        // luckyNumberss(nums);
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int rowMin = matrix[row][0];
            int colIndex = 0;
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] < rowMin) {
                    rowMin = matrix[row][col];
                    colIndex = col;
                }
            }
            boolean isLucky = true;

            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][colIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(rowMin);
            }
        }
        return result;
    }

    public static void luckyNumberss(int[][] matrix) {
        int[] result = new int[1];
        int colMax = Integer.MIN_VALUE;
        int rowMin = Integer.MAX_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < rowMin) {
                    rowMin = matrix[row][col];
                } else if (matrix[row][col] > colMax) {
                    colMax = matrix[row][col];
                }

            }
        }
        if (rowMin > colMax) {
            result[0] = rowMin;
        } else {
            result[0] = colMax;
        }
        System.out.println(rowMin);
        System.out.println(colMax);
        System.out.println(Arrays.toString(result));

    }
}
