public class SearchInString {
    public static void main(String[] args) {
        String name = "jagdish";
        char target = 'u';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // advanced for loop complexity would be n(0)
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}