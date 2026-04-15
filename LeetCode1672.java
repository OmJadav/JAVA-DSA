// https://leetcode.com/problems/richest-customer-wealth/
public class LeetCode1672 {

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 5, 6, 5 }, { 3, 2, 1 }, { 5, 6 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int current_maxWealth = Integer.MIN_VALUE;
        int maxCustWealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            current_maxWealth = sumOfWealth(accounts[i]);
            if (current_maxWealth > maxCustWealth) {
                maxCustWealth = current_maxWealth;
            }
        }

        return maxCustWealth;
    }

    public static int sumOfWealth(int[] account) {
        int sum = 0;

        for (int i = 0; i < account.length; i++) {
            sum += account[i];
        }
        return sum;
    }
}
