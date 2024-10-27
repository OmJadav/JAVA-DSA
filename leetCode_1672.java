//1672 : https://leetcode.com/problems/richest-customer-wealth

public class leetCode_1672 {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int max_num = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                max_num = max_num + accounts[i][j];
            }

            if (max_num > maxWealth) {
                maxWealth = max_num;
            }
        }
        return maxWealth;
    }
}