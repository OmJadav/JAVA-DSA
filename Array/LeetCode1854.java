package Array;

// https://leetcode.com/problems/maximum-population-year/description/
public class LeetCode1854 {
    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        int maxPopulation = 0;
        int resultYear = 1950;
        for (int year = 1950; year <=2050; year++) {
            int currentPopulation = 0;
            for (int i = 0; i < logs.length; i++) {
                int birth = logs[i][0];
                int death = logs[i][1];
                if (year >= birth && year < death) {
                    currentPopulation++;
                }
            }

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                resultYear = year;
            }
        }
        return resultYear;
    }
}
