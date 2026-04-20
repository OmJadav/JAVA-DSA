// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class LeetCode1832 {

    public static void main(String[] args) {
        String sentence = "amnvbcxzoilskdpfgjhuytrqwe";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            seen[ch - 'a'] = true;
        }
        for (boolean has : seen) {
            if (!has)
                return false;
        }
        return true;
    }
}
