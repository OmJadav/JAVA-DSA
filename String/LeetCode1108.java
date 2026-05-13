package String;

// https://leetcode.com/problems/defanging-an-ip-address/
public class LeetCode1108 {
    public static void main(String args[]) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        String result = address.replace(".", "[.]");

        return result;
    }
}
