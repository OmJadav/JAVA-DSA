// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> anss = kidsWithCandies(candies, extraCandies);
        // for (boolean ans : anss) {
        // System.out.println(ans);
        // }
        // System.out.println(Arrays.toString(anss));
        System.out.println(anss);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int choco : candies) {
            if (choco > max) {
                max = choco;
            }
        }

        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
