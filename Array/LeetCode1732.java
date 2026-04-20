package Array;
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class LeetCode1732 {

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (maxAltitude < currentAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}