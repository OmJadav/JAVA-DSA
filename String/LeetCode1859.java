package String;

// https://leetcode.com/problems/sorting-the-sentence/description/
public class LeetCode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        // s.split(" ");
        System.out.println(sortSentence(s));

    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int pos = word.charAt(word.length() - 1) - '0';
            result[pos - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", result);
    }
}
