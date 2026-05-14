package String;

// https://leetcode.com/problems/shuffle-string/description/
public class LeetCode1508 {

    public static void main(String args[]) {
        String s = "codeleet";

        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
