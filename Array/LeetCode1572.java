package Array;

// https://leetcode.com/problems/matrix-diagonal-sum/
public class LeetCode1572 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] mat = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1
        // } };
        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == mat.length - 1 && i != j) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
