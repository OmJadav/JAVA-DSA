package String;

// https://leetcode.com/problems/goal-parser-interpretation/description/
public class LeetCode1678 {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(interpret(command));
    }

    public static String interpret(String command) {

        // command = command.replace("()", "o");
        // command = command.replace("G", "G");
        // command = command.replace("(al)", "al");

        // return command;

        StringBuilder S = new StringBuilder(command.length());

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                S.append('G');
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    S.append('o');
                    i++;
                } else {
                    S.append("al");
                    i = i + 3;
                }
            }
        }
        return S.toString();
    }
}
