package Array;
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class LeetCode1252 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };

        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                // System.out.println(arr[i][j]);
                // System.out.println("row : " + i + " and col : " + j);
                arr[row][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][col]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
